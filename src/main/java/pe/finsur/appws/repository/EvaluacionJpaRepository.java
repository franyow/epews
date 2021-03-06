package pe.finsur.appws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.finsur.appws.model.Evaluacion;

@Repository
public interface EvaluacionJpaRepository extends JpaRepository<Evaluacion, String> {

}
