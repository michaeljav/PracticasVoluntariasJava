package com.mjm.herencia.clasesSinHerenciaRepeditos;

public class _sinHerencia_Calcetina {
	

	private String id;
	private double precio;
	private String talla;
	private String color;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void mostrarDatos() {
		System.out.println("Playera");
		System.out.println("ID: "+ id);
		System.out.println("precio: "+ precio);
		System.out.println("talla: "+ talla);
		System.out.println("color: "+ color);

	}

}
