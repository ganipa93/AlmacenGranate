package test;

import modelo.Contacto;
import modelo.Ubicacion;

public class TestContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto contacto = new Contacto("gabriel.nicolas.palazzo.93@gmail.com", "1134424414", new Ubicacion(60, 50));
		System.out.println(contacto);
		try {
			contacto.setCelular(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			contacto.setEmail(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			contacto.setUbicacion(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}