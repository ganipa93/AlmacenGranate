package modelo;

import java.time.LocalTime;

public class DiaRetiro {
	private int id;
	private int diaSemana;
	private LocalTime horasDesde;
	private LocalTime horasHasta;
	private int intervalo;
	
	public DiaRetiro(int id, int diaSemana, LocalTime horasDesde, LocalTime horasHasta, int intervalo) {
		super();
		this.id = id;
		this.diaSemana = diaSemana;
		this.horasDesde = horasDesde;
		this.horasHasta = horasHasta;
		this.intervalo = intervalo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}

	public LocalTime getHorasDesde() {
		return horasDesde;
	}

	public void setHorasDesde(LocalTime horasDesde) {
		this.horasDesde = horasDesde;
	}

	public LocalTime getHorasHasta() {
		return horasHasta;
	}

	public void setHorasHasta(LocalTime horasHasta) {
		this.horasHasta = horasHasta;
	}

	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	@Override
	public String toString() {
		return "DiaRetiro [id=" + id + ", diaSemana=" + diaSemana + ", horasDesde=" + horasDesde + ", horasHasta="
				+ horasHasta + ", intervalo=" + intervalo + "]";
	}
	
	


}
