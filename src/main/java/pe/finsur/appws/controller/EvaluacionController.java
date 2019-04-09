package pe.finsur.appws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.finsur.appws.model.Evaluacion;

import pe.finsur.appws.service.EvaluacionService;

@RestController
@RequestMapping("/evaluacion")
public class EvaluacionController {
	
	@Autowired
	EvaluacionService evaService;
	
	@PostMapping("/registrarEvaluacion")
	private String saveEvaluacion(@RequestBody Evaluacion evaluacion){
		evaService.registrarEvaluacion(evaluacion);
		return "true";
		 
	}
	
	@GetMapping("/getEvaluacion")
	private List<Evaluacion> getEvaluaciones() {
		return evaService.getEvaluaciones();
	}
	
}

