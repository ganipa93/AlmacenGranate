package test;

import java.time.LocalDate;

import modelo.Entrega;

public class TestEntrega {

	public static void main(String[] args) {
		Entrega entrega = new Entrega(LocalDate.now(), true);
		System.out.println(entrega);
		Entrega entrega2 = new Entrega(LocalDate.now(), true);
		System.out.println(entrega2);
		
		try {
			entrega.setFecha(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		entrega.setFecha(LocalDate.of(2010, 6, 26));
		System.out.println("Fecha de entrega = " + entrega.getFecha() +".");
	}

}
