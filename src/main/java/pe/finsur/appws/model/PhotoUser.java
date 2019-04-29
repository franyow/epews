package pe.finsur.appws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class PhotoUser {
	@Id
	@GeneratedValue
	long codPhoto;
	long codUser;
	@Lob
	private byte[] desContenido;
	
	public PhotoUser() {
		super();
	}
	public PhotoUser(long codPhoto, long codUser, byte[] desContenido) {
		super();
		this.codPhoto = codPhoto;
		this.codUser = codUser;
		this.desContenido = desContenido;
	}
	public long getCodPhoto() {
		return codPhoto;
	}
	public void setCodPhoto(long codPhoto) {
		this.codPhoto = codPhoto;
	}
	public long getCodUser() {
		return codUser;
	}
	public void setCodUser(long codUser) {
		this.codUser = codUser;
	}
	public byte[] getDesContenido() {
		return desContenido;
	}
	public void setDesContenido(byte[] desContenido) {
		this.desContenido = desContenido;
	}
	
	
	
	

}
