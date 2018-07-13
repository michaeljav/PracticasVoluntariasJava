package com.mjm.herencia.clasesSinHerenciaRepeditos;

public class _sinHerencia_Jeans{

	public String id;
	public double precio;
	public String talla;
	public String color;
	public String corte;
	public char genero;
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
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public void mostrarDatos() {
		System.out.println("Playera");
		System.out.println("ID: "+ id);
		System.out.println("precio: "+ precio);
		System.out.println("talla: "+ talla);
		System.out.println("color: "+ color);
		System.out.println("corte: "+ corte);
		System.out.println("genero: "+ genero);
	}
	
	
}
