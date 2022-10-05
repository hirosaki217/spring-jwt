package spring.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import spring.jwt.entity.ChuyenBay;
import spring.jwt.repository.ChuyenBayRepository;

@RestController
public class ChuyenBayController {
	
	@Autowired
	ChuyenBayRepository chuyenBayRepository;
	
	@GetMapping("/findAllByGaDen/{gaDen}")
	public ResponseEntity<List<ChuyenBay>> findAllByGaDen(@PathVariable String gaDen){
		return ResponseEntity.ok(chuyenBayRepository.findAllByGaDen(gaDen));
	}
	
	@GetMapping("/findByCondition")
	public ResponseEntity<List<ChuyenBay>> findByCondition(){
		return ResponseEntity.ok(chuyenBayRepository.findByCondition(10000, 8000));
	}
	
	@GetMapping("/findCBByFromTo")
	public ResponseEntity<List<ChuyenBay>> findCBByFromTo(){
		return ResponseEntity.ok(chuyenBayRepository.findCBByFromTo("SGN", "BMV"));
	}
	
	
	@GetMapping("/findCBByFrom")
	public ResponseEntity<List<ChuyenBay>> findCBByFrom(){
		return ResponseEntity.ok(chuyenBayRepository.findCBByFrom("SGN"));
	}
	@GetMapping("/findChuyenMayByMB")
	public ResponseEntity<List<ChuyenBay>> findChuyenMayByMB(){
		return ResponseEntity.ok(chuyenBayRepository.findChuyenMayByMB("Airbus A320"));
	}
	@GetMapping("/findChuyenBay2Chieu")
	public ResponseEntity<List<ChuyenBay>> findChuyenBay2Chieu(){
		return ResponseEntity.ok(chuyenBayRepository.findChuyenBay2Chieu());
	}
	
	@GetMapping("/countCBFromGaDi")
	public ResponseEntity<List<Object>> countCBFromGaDi(){
		return ResponseEntity.ok(chuyenBayRepository.countCBFromGaDi());
	}
	
	@GetMapping("/totalPriceByCB")
	public ResponseEntity<List<Object>> totalPriceByCB(){
		return ResponseEntity.ok(chuyenBayRepository.totalPriceByCB());
	}
	@GetMapping("/totalCBByTime")
	public ResponseEntity<List<Object>> totalCBByTime(){
		return ResponseEntity.ok(chuyenBayRepository.totalCBByTime("12:00"));
	}
}
