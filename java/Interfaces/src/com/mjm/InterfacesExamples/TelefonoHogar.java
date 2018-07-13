package com.mjm.InterfacesExamples;

public class TelefonoHogar extends Telefono  implements IDevolucion{

	
	public TelefonoHogar(int id, double precio, String marca, String modelo) {
		super(id, precio, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	public boolean isAlambrico() {
		return alambrico;
	}

	public void setAlambrico(boolean alambrico) {
		this.alambrico = alambrico;
	}

	private boolean alambrico;

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("devolviendo TelefonoHogar");
	}
}
