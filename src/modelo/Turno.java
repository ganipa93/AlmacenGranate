package modelo;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.LocalTime;


public class Turno {
	private LocalDate diaTurno;
	private LocalTime horaTurno;
	private boolean ocupado;
	
	//---CONSTRUCTORES---
	public Turno() {}
	
	public Turno(LocalDate diaTurno, LocalTime horaTurno, boolean ocupado) {
		setDiaTurno(diaTurno);
		setHoraTurno(horaTurno);
		setOcupado(ocupado);
	}
	
	//---GETTERS---SETTERS--
	public LocalDate getDiaTurno() {
		return diaTurno;
	}
	public void setDiaTurno(LocalDate diaTurno) {
		if (diaTurno != null) {
			this.diaTurno = diaTurno;
		}else {
			throw new InvalidParameterException("La fecha no puede ser nula.");
		}
	}
	public LocalTime getHoraTurno() {
		return horaTurno;
	}
	public void setHoraTurno(LocalTime horaTurno) {
		if (horaTurno != null) {
			this.horaTurno = horaTurno;
		}else {
			throw new InvalidParameterException("La hora no puede ser nula.");
		}
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	@Override
	public String toString() {
		return "(Día: " + diaTurno + ", hora: " + horaTurno + ")";
	}
	
	public boolean equals(Turno t) {
		return (diaTurno == t.diaTurno && horaTurno == t.horaTurno);
	}

}
