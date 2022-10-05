package spring.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "nhanvien")
@Data
public class NhanVien {
	@Id
	@Column(columnDefinition = "varchar(9)")
	private String maNV;
	
	private String ten;
	private int luong;
	
	
}
