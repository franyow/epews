package pe.finsur.appws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	Long codUsuario;
	String username;
	String password;
	String nombre;
	
	public Usuario(Long codUsuario, String username, String password, String nombre) {
		super();
		this.codUsuario = codUsuario;
		this.username = username;
		this.password = password;
		this.nombre = nombre;
	}

	public Usuario() {
		super();
	}

	public Long getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Long codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
