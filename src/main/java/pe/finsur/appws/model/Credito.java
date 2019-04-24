package pe.finsur.appws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Credito {
	
	@Id
	@GeneratedValue
	Long codCredito;
    String imgCredito;
    String nombreCredito;
    String descripcionCredito;
    
    
	
	public Credito() {
		super();
	}
	public Credito(Long codCredito, String imgCredito, String nombreCredito, String descripcionCredito) {
		super();
		this.codCredito = codCredito;
		this.imgCredito = imgCredito;
		this.nombreCredito = nombreCredito;
		this.descripcionCredito = descripcionCredito;
	}
	public Long getCodCredito() {
		return codCredito;
	}
	public void setCodCredito(Long codCredito) {
		this.codCredito = codCredito;
	}
	public String getImgCredito() {
		return imgCredito;
	}
	public void setImgCredito(String imgCredito) {
		this.imgCredito = imgCredito;
	}
	public String getNombreCredito() {
		return nombreCredito;
	}
	public void setNombreCredito(String nombreCredito) {
		this.nombreCredito = nombreCredito;
	}
	public String getDescripcionCredito() {
		return descripcionCredito;
	}
	public void setDescripcionCredito(String descripcionCredito) {
		this.descripcionCredito = descripcionCredito;
	}
    
    

}
