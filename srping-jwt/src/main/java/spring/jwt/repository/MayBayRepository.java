package spring.jwt.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.jwt.entity.MayBay;


@Repository
@Transactional
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
//	2
	@Query(value="select * from maybay where tambay > ?1", nativeQuery = true)
	List<MayBay> findMayBayLon(int tambay);
//	7
	@Query(value="select * from maybay where loai like %?1%", nativeQuery = true)
	List<MayBay> findMayBayByName(String name);
//	13
	@Query(value="select * from maybay where tambay > (select do_dai from chuyenbay where macb = ?1)", nativeQuery = true)
	List<MayBay> findMayBayByCB(String maCB);
	
//	16
	@Query(value="select  mb.mamb, mb.loai, COUNT(c.manv) as total from chungnhan c join maybay mb on c.mamb = mb.mamb GROUP BY(mb.loai)", nativeQuery = true)
	List<Object> findMayBayDuocLai();
}
