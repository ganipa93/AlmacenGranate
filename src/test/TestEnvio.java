package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Envio;
import modelo.Ubicacion;

public class TestEnvio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Envio envio = new Envio(LocalDate.now(), true, LocalTime.of(20, 0), LocalTime.now(), 500, new Ubicacion(80, 20));
		System.out.println(envio);
		
		try {
			envio.setHorasHasta(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			envio.setHorasDesde(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			envio.setCosto(-100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}