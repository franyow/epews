package pe.finsur.appws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.finsur.appws.model.DetalleCredito;

public interface DetalleCreditoJpaRepository extends JpaRepository<DetalleCredito, Long> {
	public DetalleCredito findByCodCredito(Long codCredito);
}
