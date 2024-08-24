package in.nareshit.raghu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.Medicos;

public interface MedicosRepository extends JpaRepository<Medicos, Long>{

	@Query(value = "select * from #{#entityName} m where m.pid=?1", nativeQuery = true)
	public List<Medicos> getAllByPatientId(long pid);
}