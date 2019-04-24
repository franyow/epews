package pe.finsur.appws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.finsur.appws.model.DetalleCredito;
import pe.finsur.appws.service.DetalleCreditoService;

@RestController
@RequestMapping("/detalleCredito")
public class DetalleCreditoController {
	
	@Autowired
	DetalleCreditoService detalleCreditoService;
	
	@GetMapping("/credito/{codCredito}")
	public DetalleCredito getDetalleCredito(@PathVariable("codCredito") Long codCredito) {
		return detalleCreditoService.getDetalleAgencia(codCredito);
	}

}
