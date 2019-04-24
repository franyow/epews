package pe.finsur.appws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.finsur.appws.model.Agencia;

@Repository
public interface AgenciaRepository extends JpaRepository<Agencia, Long> {

}
