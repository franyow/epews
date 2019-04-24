package pe.finsur.appws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.finsur.appws.model.DetalleCredito;
import pe.finsur.appws.repository.DetalleCreditoJpaRepository;

@Service
public class DetalleCreditoService {
	@Autowired
	DetalleCreditoJpaRepository detalleCreditoJpaRepository;
	
	public DetalleCredito getDetalleAgencia(Long codCredito) {
		return detalleCreditoJpaRepository.findByCodCredito(codCredito);	
		
	}

}
