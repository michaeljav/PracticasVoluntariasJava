package com.mjm.herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playera  playera    = new Playera(1, 299, "CH", "Gris", "Polo");
		Jeans    jeans      = new Jeans(2,88,"32","Azul","Kniny",'F');
		Calcetin calceting  = new Calcetin(2, 29, "M", "Rojo");
		playera.mostrarDatos("Playera Gris");
		jeans.mostrarDatos("Jeans Mujer");
		calceting.mostrarDatos("Calcetin");
	}
	

}
