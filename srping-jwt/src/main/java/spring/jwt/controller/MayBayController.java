package spring.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.jwt.entity.MayBay;
import spring.jwt.repository.MayBayRepository;

@RestController
public class MayBayController {
	@Autowired
	MayBayRepository mayBayRepository;
	
	@GetMapping("/findMayBayLon")
	public ResponseEntity<List<MayBay>> findMayBayLon(){
		return ResponseEntity.ok(mayBayRepository.findMayBayLon(10000));
	}
	@GetMapping("/findMayBayByName")
	public ResponseEntity<List<MayBay>> findMayBayByName(){
		return ResponseEntity.ok(mayBayRepository.findMayBayByName("Boeing"));
	}
	
	@GetMapping("/findMayBayByCB")
	public ResponseEntity<List<MayBay>> findMayBayByCB(){
		return ResponseEntity.ok(mayBayRepository.findMayBayByCB("VN280"));
	}
	
	
	@GetMapping("/findMayBayDuocLai")
	public ResponseEntity<List<Object>> findMayBayDuocLai(){
		return ResponseEntity.ok(mayBayRepository.findMayBayDuocLai());
	}
}
