package pe.finsur.appws.model;

public class ResponseBean {
	boolean success;
	String message;
	
	
	public ResponseBean() {
		super();
	}
	public ResponseBean(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	

}
