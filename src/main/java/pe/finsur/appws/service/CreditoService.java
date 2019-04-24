package pe.finsur.appws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.finsur.appws.model.Credito;
import pe.finsur.appws.repository.CreditoJpaRepository;

@Service
public class CreditoService {
	
	@Autowired
	CreditoJpaRepository creditoRepo;
	
	public List<Credito> getCreditos(){
		return creditoRepo.findAll();
	}
	

}
