package in.nareshit.raghu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	
	@Query(value = "select * from #{#entityName} d where d.DOC_ID=?1", nativeQuery = true)
	public Doctor getById(long doctorId);
	
	@Query(value = "select * from #{#entityName} d where d.PHONE_NO=?1", nativeQuery = true)
	public Doctor existsDoctorByDoctorPhoneNO(long doctorPhoneNO);
}
