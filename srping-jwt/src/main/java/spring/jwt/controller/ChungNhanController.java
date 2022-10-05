package spring.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;
import spring.jwt.entity.ChungNhan;
import spring.jwt.jms.JmsProducer;
import spring.jwt.repository.ChungNhanRepository;

@RestController()
@Slf4j
public class ChungNhanController {

	@Autowired
	JmsProducer jmsProducer;

	@Autowired
	private ChungNhanRepository chungNhanRepository;

	@GetMapping("/findMaMBByFirstName")
	@PreAuthorize("hasAnyAuthority('USER_READ')")
	public ResponseEntity<List<String>> findMaMBByFirstName() {
		List<String> lsCn = 	chungNhanRepository.findMaMBByFirstName("Nguyen");
		jmsProducer.sendMessage(lsCn);
		
		return ResponseEntity.ok(lsCn);
	}
}
