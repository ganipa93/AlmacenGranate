package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.RetiroLocal;

public class TestRetiroLocal {

	public static void main(String[] args) {
		RetiroLocal retiroLocal = new RetiroLocal(LocalDate.now(), true, LocalTime.now());
		System.out.println(retiroLocal);
		
		retiroLocal.setHoraEntrega(LocalTime.of(20, 10));
		try {
			retiroLocal.setHoraEntrega(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}