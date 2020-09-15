package modelo;

import java.security.InvalidParameterException;
import java.time.LocalDate;


public class Entrega {
	private static int cantidad = 0;
	protected int id;
	protected LocalDate fecha;
	protected boolean efectivo;
	
	public Entrega(LocalDate fecha, boolean efectivo) {
		super();
		this.id = Entrega.cantidad;
		setFecha(fecha);
		setEfectivo(efectivo);
		Entrega.cantidad++;
	}

	public int getId() {
		return id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		if (fecha != null) {
			this.fecha = fecha;
		}else {
			throw new InvalidParameterException("[WARNING] La fecha no puede ser nula");
		}
	}

	public boolean isEfectivo() {
		return efectivo;
	}

	public void setEfectivo(boolean efectivo) {
		this.efectivo = efectivo;
	}

	@Override
	public String toString() {
		return  "Entrega" + this.atributosToString();
	}
	
	protected String atributosToString() {
		return " -> id=" + id + ", fecha=" + fecha + ", efectivo=" + efectivo ;
	}
	
	public boolean equals(Entrega entrega) {
		boolean sonIguales = false;
		if (entrega != null) {
			sonIguales = entrega.getId() == this.id;
		}else {
			throw new InvalidParameterException("[WARNING] La entrega no debe ser nula");
		}
		return sonIguales;
	}
	
	
}
