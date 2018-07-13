package com.mjm.herencia;

public class Jeans  extends Ropa{

	public Jeans(int id, double precio, String talla, String color,String corte,char genero) {
		super(id, precio, talla, color);
		// TODO Auto-generated constructor stub
		this.corte=corte;
		this.genero= genero;
	}
	public String corte;
	
	private char genero;

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
	
	@Override
	public void mostrarDatos(String NombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(NombreClase);
		System.out.println("corte: "+corte);
		System.out.println("genero: "+genero);
	}
	

}
