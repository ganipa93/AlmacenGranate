package modelo;

import java.time.LocalTime;

public class Envio {
	private LocalTime horasHasta;
	private LocalTime horasDesde;
	private double costo;
	private Ubicacion ubicacion;
	
	public Envio(LocalTime horasHasta, LocalTime horasDesde, double costo, Ubicacion ubicacion) {
		super();
		this.horasHasta = horasHasta;
		this.horasDesde = horasDesde;
		this.costo = costo;
		this.ubicacion = ubicacion;
	}

	public LocalTime getHorasHasta() {
		return horasHasta;
	}

	public void setHorasHasta(LocalTime horasHasta) {
		this.horasHasta = horasHasta;
	}

	public LocalTime getHorasDesde() {
		return horasDesde;
	}

	public void setHorasDesde(LocalTime horasDesde) {
		this.horasDesde = horasDesde;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Envio [horasHasta=" + horasHasta + ", horasDesde=" + horasDesde + ", costo=" + costo + ", ubicacion="
				+ ubicacion + "]";
	}
	
	
	
	


}
