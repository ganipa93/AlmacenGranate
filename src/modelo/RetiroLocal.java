package modelo;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.LocalTime;

public class RetiroLocal extends Entrega {
	private LocalTime horaEntrega;

	public RetiroLocal(LocalDate fecha, boolean efectivo, LocalTime horaEntrega) {
		super(fecha, efectivo);
		setHoraEntrega(horaEntrega);
	}

	public LocalTime getHoraEntrega() {
		return horaEntrega;
	}

	public void setHoraEntrega(LocalTime horaEntrega) {
		if (horaEntrega != null) {
			this.horaEntrega = horaEntrega;
		}else {
			throw new InvalidParameterException("[WARNING] La hora de entrega no puede ser nula");
		}
	}

	@Override
	public String toString() {
		return "RetiroLocal" + this.atributosToString();
	}
	
	@Override
	protected String atributosToString() {
		return super.atributosToString() + ", horaEntrega="+horaEntrega;
	}
	
	public boolean equals(RetiroLocal retiroLocal) {
		boolean sonIguales = false;
		if (retiroLocal != null) {
			sonIguales = retiroLocal.getId() == this.getId();
		}else {
			throw new InvalidParameterException("[WARNING] El retiro local no debe ser nula");
		}
		return sonIguales;
	}
}