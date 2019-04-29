package pe.finsur.appws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.finsur.appws.model.PhotoUser;

public interface PhotoUserJpaRepository extends JpaRepository<PhotoUser, Long>{
	PhotoUser findByCodUser(Long codUser);

}
