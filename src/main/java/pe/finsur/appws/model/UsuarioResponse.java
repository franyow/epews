package pe.finsur.appws.model;

public class UsuarioResponse {
	boolean success;
	String nombre;
	public UsuarioResponse(boolean success, String nombre) {
		super();
		this.success = success;
		this.nombre = nombre;
	}
	public UsuarioResponse() {
		super();
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
