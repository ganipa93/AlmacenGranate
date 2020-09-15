package modelo;

import java.security.InvalidParameterException;

public class Ubicacion {
	private double latitud;
	private double longitud;
	
	public Ubicacion(double latitud, double longitud) {
		super();
		setLatitud(latitud);
		setLongitud(longitud);
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		if(latitud>=-90 && latitud<=90) {
			this.latitud = latitud;
		}else {
			throw new InvalidParameterException("La latitud es invalida, debe pertenecer a este intervalo: [ -90;90 ].");
		}
		
		// -90 a 90 la latitud (grados)
	}

	public double getLongitud() {
		return longitud;
		
	}

	public void setLongitud(double longitud) {
		if(longitud>=-180 && longitud<=180) {
			this.longitud = longitud;
		}else {
			throw new InvalidParameterException("La longitud es invalida, debe pertenecer a este intervalo: [-180;180 ].");
		}
		// -180 a 180 la longitud (grados)
	}

	@Override
	public String toString() {
		return "Ubicacion -> latitud=" + latitud + ", longitud=" + longitud;
	}
	
	public boolean equals(Ubicacion ubicacion) {
		boolean sonIguales = false;
		if (ubicacion != null) {
			sonIguales = ( this.latitud == ubicacion.getLatitud() ) && ( this.longitud == ubicacion.getLongitud() );
		}else {
			throw new InvalidParameterException("[WARNING] La ubicacion no debe ser nula");
		}
		return sonIguales;
	}
	
	
}