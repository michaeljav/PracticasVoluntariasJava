package com.mjm.InterfacesExamples;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playera  playera    = new Playera(1, 299, "CH", "Gris", "Polo");
		PlayeraPersonalizada playeraPersonalizada = new PlayeraPersonalizada(1, 899, "m", "Rojo", "@mijm");
		Jeans    jeans      = new Jeans(2,88,"32","Azul","Kniny",'F');
		Calcetin calceting  = new Calcetin(2, 29, "M", "Rojo");
		
		playera.mostrarDatos("Playera Gris");
		playeraPersonalizada.mostrarDatos("Playera de @mjm");
		jeans.mostrarDatos("Jeans Mujer");
		calceting.mostrarDatos("Calcetin");
		
		SmartPhone smartPhone = new SmartPhone(5, 733, "Motorolza", "Moto G" , "ALGUNA TELEFONICA");
		smartPhone.hacerDevolucion();
	}
	

}
