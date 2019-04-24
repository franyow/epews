package pe.finsur.appws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.finsur.appws.model.Agencia;
import pe.finsur.appws.repository.AgenciaRepository;

@Service
public class AgenciaService {
	
	@Autowired
	AgenciaRepository agenciaRepository;
	
	public List<Agencia> getAllAgencia(){
		return agenciaRepository.findAll();
	}

}
