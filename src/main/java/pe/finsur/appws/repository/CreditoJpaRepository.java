package pe.finsur.appws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.finsur.appws.model.Credito;

@Repository
public interface CreditoJpaRepository extends JpaRepository<Credito, Long> {

}
