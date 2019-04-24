package pe.finsur.appws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Evaluacion {
	@Id
	@GeneratedValue
	String Id;
    String nombreSolicitante;
    String dni;
    String codCredito;

}
