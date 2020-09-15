package test;

import modelo.Ubicacion;

public class TestUbicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ubicacion ubicacion = new Ubicacion(70, 20);
		System.out.println(ubicacion);
		
		try {
			ubicacion.setLatitud(100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ubicacion.setLongitud(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}