package pe.finsur.appws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agencia {
	@Id
	@GeneratedValue
	Long codAgencia;
	String nombreAgencia;
    String direccionAgencia;
    String telefonoAgencia; 
    String latAgencia;
    String longAgencia;
    
    
	
	
	
	public Agencia() {
		super();
	}

	public Agencia(Long codAgencia, String nombreAgencia, String direccionAgencia, String telefonoAgencia,
			String latAgencia, String longAgencia) {
		super();
		this.codAgencia = codAgencia;
		this.nombreAgencia = nombreAgencia;
		this.direccionAgencia = direccionAgencia;
		this.telefonoAgencia = telefonoAgencia;
		this.latAgencia = latAgencia;
		this.longAgencia = longAgencia;
	}
	public Long getCodAgencia() {
		return codAgencia;
	}


	public void setCodAgencia(Long codAgencia) {
		this.codAgencia = codAgencia;
	}


	public String getNombreAgencia() {
		return nombreAgencia;
	}
	public void setNombreAgencia(String nombreAgencia) {
		this.nombreAgencia = nombreAgencia;
	}
	public String getDireccionAgencia() {
		return direccionAgencia;
	}
	public void setDireccionAgencia(String direccionAgencia) {
		this.direccionAgencia = direccionAgencia;
	}
	public String getTelefonoAgencia() {
		return telefonoAgencia;
	}
	public void setTelefonoAgencia(String telefonoAgencia) {
		this.telefonoAgencia = telefonoAgencia;
	}
	public String getLatAgencia() {
		return latAgencia;
	}
	public void setLatAgencia(String latAgencia) {
		this.latAgencia = latAgencia;
	}
	public String getLongAgencia() {
		return longAgencia;
	}
	public void setLongAgencia(String longAgencia) {
		this.longAgencia = longAgencia;
	}

	
    
    
}
