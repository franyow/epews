package pe.finsur.appws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.finsur.appws.model.Credito;
import pe.finsur.appws.repository.CreditoJpaRepository;

@RestController
@RequestMapping("/credito")
public class CreditoController {
	
	@Autowired
	CreditoJpaRepository creditoRepo;
	
	@GetMapping("/getCreditos")
	public List<Credito> getCreditos(){
		List<Credito> creditos = new ArrayList<>();
		 creditos.add(new Credito("01","https://www.pichincha.com/portal/Portals/0/adam/Submenu/lUoL0XRNf02YSYFs2bk-Sg/Icon/Personas-Credito-educativo.jpg?w=300&h=200&mode=crop","Crédito educativo","Estudia lo que siempre quisiste, en la universidad de tu elección."));
	        creditos.add(new Credito("02","https://www.pichincha.com/portal/Portals/0/adam/Submenu/TjNl-oEvDUqGx8gMpSaUNQ/Icon/Personas-Credito-ecologico.jpg?w=300&h=200&mode=crop","Crédito ecológico","Dale vida a tus propósitos con sostenibilidad ambiental."));
	        creditos.add(new Credito("03","https://www.pichincha.com/portal/Portals/0/adam/Submenu/W2zUNjJY1USH4wwPWEuUtg/Icon/Personas-Credito-hipotecario.jpg?w=300&h=200&mode=crop","Crédito hipotecario","Tener casa propia es una de las decisiones más importantes de tu vida. Tómala."));
	        creditos.add(new Credito("04","https://www.pichincha.com/portal/Portals/0/adam/Submenu/3tobtfSKDEOKEYsY8G2F1A/Icon/Personas-Credito-vehicular.jpg?w=300&h=200&mode=crop","Crédito Vehicular", "Conduce tu vida sobre ruedas. Elige el vehículo que se ajusta a tus necesidades."));
	        creditos.add(new Credito("05","https://www.pichincha.com/portal/Portals/0/adam/Submenu/CcBeElZVJkO_ut4A8pablQ/Icon/Personas-Credito-de-linea-abierta.jpg?w=300&h=200&mode=crop","Linea Abierta", "Nos interesa tu crecimiento, completa aquel proyecto personal que tienes en mente."));
	        creditos.add(new Credito("06","https://www.pichincha.com/portal/Portals/0/adam/Submenu/O2fQdJeEiEOjEG-OqEynzg/Icon/Personas-Credito-multiproposito.jpg?w=300&h=200&mode=crop","Crédito Multipropósito","Llegó el momento de hacer realidad tus propósitos. Todos tenemos algo pendiente por cumplir."));
	    
		
		
		return creditos;
	}
	

}
