package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Carrito{
	private int id;
	private LocalDate fecha;
	private LocalTime hora;
	private boolean cerrado;
	private double descuento;
	private Cliente cliente;
	private ArrayList<ItemCarrito> lstItemCarrito;
	private Entrega entrega;
	
	
	public Carrito(int id, LocalDate fecha, LocalTime hora, boolean cerrado, double descuento
			,ArrayList<ItemCarrito> listaItems, Cliente cliente, Entrega entrega) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.cerrado = cerrado;
		this.descuento = descuento;
		this.cliente = cliente;
		this.lstItemCarrito = listaItems;
		this.entrega = entrega;
	}
	
	public Carrito() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public boolean isCerrado() {
		return cerrado;
	}
	
	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}
	
	public double getDescuento() {
		return descuento;
	}
	
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<ItemCarrito> getLstItemCarrito() {
		return lstItemCarrito;
	}
	
	public void setLstItemCarrito(ArrayList<ItemCarrito>lstItemCarrito) {
		this.lstItemCarrito = lstItemCarrito;
	}
	
	public Entrega getEntrega() {
		return entrega;
	}
	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	
	@Override
	public String toString() {
		return "Carrito----> id=" + id + ", cerrado=" + cerrado + ", descuento: " + descuento +" Hora: "+hora+" Fecha: "+fecha+ "\n"+ lstItemCarrito.toString();
	}

	public boolean equals(Carrito carro) {
			return this.id ==carro.getId();
	}
	
	
}