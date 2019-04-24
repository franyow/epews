package pe.finsur.appws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DETALLE_CREDITO")
public class DetalleCredito {
	
	@Id
	@GeneratedValue
	Long id;
	Long codCredito;
	String  requisitos;
	String beneficios;
	
	public DetalleCredito() {
		super();
	}

	

	public DetalleCredito(Long id, Long codCredito, String requisitos, String beneficios) {
		super();
		this.id = id;
		this.codCredito = codCredito;
		this.requisitos = requisitos;
		this.beneficios = beneficios;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Long getCodCredito() {
		return codCredito;
	}



	public void setCodCredito(Long codCredito) {
		this.codCredito = codCredito;
	}



	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	
	
	
	

}
