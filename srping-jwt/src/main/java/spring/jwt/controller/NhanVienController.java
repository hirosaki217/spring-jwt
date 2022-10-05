package spring.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.jwt.entity.NhanVien;
import spring.jwt.repository.NhanVienRepository;

@RestController
public class NhanVienController {
	@Autowired
	NhanVienRepository nhanVienRepository;
	
	@GetMapping("/findNVLuongNho")
	public ResponseEntity<List<NhanVien>> findNVLuongNho(){
		return ResponseEntity.ok(nhanVienRepository.findNVLuongNho(10000));
	}
	
	
	@GetMapping("/totalLuong")
	public ResponseEntity<Integer> totalLuong(){
		return ResponseEntity.ok(nhanVienRepository.totalLuong());
	}
	@GetMapping("/findNVByMB")
	public ResponseEntity<List<String>> findNVByMB(){
		return ResponseEntity.ok(nhanVienRepository.findNVByMB("Boeing%"));
	}
	
	@GetMapping("/findNVLaiMB")
	public ResponseEntity<List<NhanVien>> findNVLaiMB(){
		return ResponseEntity.ok(nhanVienRepository.findNVLaiMB("747"));
	}
	
	@GetMapping("/findNVLaiMB1")
	public ResponseEntity<List<String>> findNVLaiMB(String mb1, String mb2){
		return ResponseEntity.ok(nhanVienRepository.findNVLaiMB("Airbus%", "Boeing%"));
	}
	@GetMapping("/findNameByMB")
	public ResponseEntity<List<String>> findNameByMB(String loai){
		return ResponseEntity.ok(nhanVienRepository.findNameByMB("Boeing%"));
	}
	
}
