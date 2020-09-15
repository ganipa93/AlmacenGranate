package modelo;

import java.security.InvalidParameterException;

public class Contacto {
	private String email;
	private String celular;
	private Ubicacion ubicacion;

	public Contacto(String email, String celular, Ubicacion ubicacion) {
		super();
		setEmail(email);
		setCelular(celular);
		setUbicacion(ubicacion);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email!=null) {
			this.email = email;			
		}else {
			throw new InvalidParameterException("[WARNING] El email no debe ser nulo");
		}
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		if(celular!=null) {
			this.celular = celular;			
		}else {
			throw new InvalidParameterException("[WARNING] El celular no debe ser nulo");
		}
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		if(ubicacion!=null) {
			this.ubicacion = ubicacion;			
		}else {
			throw new InvalidParameterException("[WARNING] La ubicacion no debe ser nula");
		}
	}

	@Override
	public String toString() {
		return "Contacto -> email=" + email + ", celular=" + celular + ", ubicacion=[ " + ubicacion + " ]";
	}
	
	public boolean equals(Contacto contacto) {
		boolean sonIguales = false;
		if (contacto != null) {
			sonIguales = this.email.equals(contacto.getEmail()) && this.celular.equals(contacto.getCelular()) && this.ubicacion.equals(contacto.getUbicacion());
		}else {
			throw new InvalidParameterException("[WARNING] El contacto no debe ser nulo");
		}
		return sonIguales;
	}
	
}
