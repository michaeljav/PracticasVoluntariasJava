package com.mjm.herencia;

public class Ropa {

	private int id;
	private double precio;
	private String talla;
	private String color;
	
	public Ropa(int id,double precio,String talla,String color) {
		this.id=id;
		this.precio=precio;
		this.talla=talla;
		this.color= color;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	public void mostrarDatos(String NombreClase) {
		System.out.println(NombreClase);
		System.out.println("ID: "+ id);
		System.out.println("precio: "+ precio);
		System.out.println("talla: "+ talla);
		System.out.println("color: "+ color);

	}
}
