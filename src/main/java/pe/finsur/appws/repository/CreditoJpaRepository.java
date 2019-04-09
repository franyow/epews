package pe.finsur.appws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.finsur.appws.model.Credito;

public interface CreditoJpaRepository extends JpaRepository<Credito, String> {

}
