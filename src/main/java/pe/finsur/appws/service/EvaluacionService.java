package pe.finsur.appws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.finsur.appws.model.Evaluacion;
import pe.finsur.appws.repository.EvaluacionJpaRepository;

@Service
public class EvaluacionService {
	@Autowired 
	EvaluacionJpaRepository evaRepo;
	
	public void registrarEvaluacion(Evaluacion evaluacion) {
		evaRepo.save(evaluacion);
	}
	
	public Evaluacion getPersonById(String id) {
	        return evaRepo.findById(id).get();
	 }
	
	public List<Evaluacion> getEvaluaciones(){
		return evaRepo.findAll();
	}
	 


}
