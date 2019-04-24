package pe.finsur.appws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.finsur.appws.model.Agencia;
import pe.finsur.appws.service.AgenciaService;

@RestController
@RequestMapping("/agencia")
public class AgenciaController {
	
	@Autowired
	AgenciaService agenciaService;
	
	@GetMapping("/getAll")
	public List<Agencia> getAllAgencia(){
		return agenciaService.getAllAgencia();
	}
	

}
