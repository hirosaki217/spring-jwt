package spring.jwt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "chungnhan")
@Data
@IdClass(ChungNhanPK.class)
public class ChungNhan {
	@Id
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name = "maMB",
	foreignKey = @ForeignKey(name = "ChuyenBay_ID_FK"))
	private ChuyenBay maMB;
	@Id
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name = "maNV",
	foreignKey = @ForeignKey(name = "NhanVien_ID_FK"), columnDefinition = "varchar(9)")
	private NhanVien maNV;
	
	
}
