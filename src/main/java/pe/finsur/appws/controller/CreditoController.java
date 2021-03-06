package pe.finsur.appws.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.finsur.appws.model.Credito;
import pe.finsur.appws.service.CreditoService;

@RestController
@RequestMapping("/credito")
public class CreditoController {
	
	@Autowired
	CreditoService creditoService;
	
	@GetMapping("/getCreditos")
	public List<Credito> getCreditos(){

		
		return creditoService.getCreditos();
	}
	
	
	
	
	
	

}
