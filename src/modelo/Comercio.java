package modelo;

import java.util.Iterator;
import java.security.InvalidParameterException;
import java.util.ArrayList;

//Todo chequeado excepto lo que tenga que ver con listas carrito y dia retiro//

public class Comercio extends Actor {
	
	private String nombreComercio;
	private String cuit;
	private double costoFijo;
	private double costoPorKm;
	private int diaDescuento;
	private int porcentajeDescuentoDia;
	private int porcentajeDescuentoEfectivo;
	private ArrayList<DiaRetiro> lstDiaRetiro;
	private ArrayList<Carrito> lstCarrito;
	
	public Comercio(int id, Contacto contacto,String nombreComercio, String cuit, double costoFijo, double costoPorKm, int diaDescuento, int porcentajeDescuentoDia, int porcentajeDescuentoEfectivo)//, ArrayList<DiaRetiro> lstDiaRetiro, ArrayList<Carrito> lstCarrito) 
	{
		super(id, contacto);
		setNombreComercio(nombreComercio);
		setCuit(cuit);
		setCostoFijo(costoFijo);
		setCostoPorKm(costoPorKm);
		setDiaDescuento(diaDescuento);
		setPorcentajeDescuentoDia(porcentajeDescuentoDia);
		setPorcentajeDescuentoEfectivo(porcentajeDescuentoEfectivo);
		setLstDiaRetiro(lstDiaRetiro);
		//setLstCarrito(ArrayList<Carrito> lstCarrito);
		
	}

	public String getNombreComercio() {
		return nombreComercio;
	}

	public void setNombreComercio(String nombreComercio) {
		this.nombreComercio = nombreComercio;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		if(esCuitValido(cuit))
		{
		 this.cuit = cuit;
		}
		else 
		{
			throw new InvalidParameterException("[WARNING] El cuit ingresado es inválido");
		}
	}
	
	public boolean esCuitValido(String cuit)
	{
		boolean booleano=false;
		
		String parte = cuit.substring(3,11); 
		
		if (Integer.parseInt(cuit.substring(0,2))==30)
		{
			int acumulador =3*5+0*4;
			int cont = 3;
			for (int n=0; n<2;n++) 
			{
				acumulador  = acumulador + ((Character.getNumericValue(parte.charAt(n))) * cont);
				cont--;
			}
			cont = 7;
			parte = parte.substring(2);
			for (int n=0; n<6;n++) 
			{
				acumulador = acumulador + ((Character.getNumericValue(parte.charAt(n))) * cont);
				cont--;
			}
			int ultimoDigitoCuit=acumulador%11;
			if(ultimoDigitoCuit!=0)
			{
				ultimoDigitoCuit=11-ultimoDigitoCuit;
			}
			
			booleano = ultimoDigitoCuit == Character.getNumericValue(cuit.charAt(12));
		
		}
		
		return booleano;
	}

	public double getCostoFijo() {
		return costoFijo;
	}

	public void setCostoFijo(double costoFijo) {
		this.costoFijo = costoFijo;
	}

	public double getCostoPorKm() {
		return costoPorKm;
	}

	public void setCostoPorKm(double costoPorKm) {
		this.costoPorKm = costoPorKm;
	}

	public int getDiaDescuento() {
		return diaDescuento;
	}

	public void setDiaDescuento(int diaDescuento) {
		this.diaDescuento = diaDescuento;
	}

	public int getPorcentajeDescuentoDia() {
		return porcentajeDescuentoDia;
	}

	public void setPorcentajeDescuentoDia(int porcentajeDescuentoDia) {
		this.porcentajeDescuentoDia = porcentajeDescuentoDia;
	}

	public int getPorcentajeDescuentoEfectivo() {
		return porcentajeDescuentoEfectivo;
	}

	public void setPorcentajeDescuentoEfectivo(int porcentajeDescuentoEfectivo) {
		this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
	}

	public ArrayList<DiaRetiro> getLstDiaRetiro() {
		return lstDiaRetiro;
	}

	public void setLstDiaRetiro(ArrayList<DiaRetiro> lstDiaRetiro) {
		this.lstDiaRetiro = lstDiaRetiro;
	}

	public ArrayList<Carrito> getLstCarrito() {
		return lstCarrito;
	}

	public void setLstCarrito(ArrayList<Carrito> lstCarrito) {
		this.lstCarrito = lstCarrito;
	}
	
	public boolean equals(Comercio comercio)
	{
		return this.id==comercio.getId();
	}

	@Override
	public String toString() {
		return super.toString()+"Nombre: "+ nombreComercio + "\nCuit: "+cuit+ "\nCosto Fijo: "+ costoFijo + " Costo Por KM: " + costoPorKm + "\nDia de Descuento: " + diaDescuento + " Porcentaje Descuento Por dia: " + porcentajeDescuentoDia + " Porcentaje Descuento por Efectivo: "+porcentajeDescuentoEfectivo
				+"\nDias de Retiro: " + lstDiaRetiro.toString()+"\nLista de carritos: " + lstCarrito.toString();
	}
	
	
}