package spring.jwt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "maybay")
@Data
public class MayBay {
	@Id
	private int maMB;
	private String loai;
	private int tambay;
}
