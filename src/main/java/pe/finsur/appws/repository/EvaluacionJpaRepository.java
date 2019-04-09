package pe.finsur.appws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.finsur.appws.model.Evaluacion;

public interface EvaluacionJpaRepository extends JpaRepository<Evaluacion, String> {

}
