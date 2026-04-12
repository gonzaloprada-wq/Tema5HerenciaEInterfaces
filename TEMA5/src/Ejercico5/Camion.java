package Ejercico5;

import EjAnalisis1.Vehiculo;

public class Camion extends Vehiculo{

	private double pesoMaximo;
	
	private boolean mercancia;
	
	
	public Camion(String marca, String modelo, String color, String matricula, Boolean encendido, int velocidad,
			int marchas, int pesoMaximo, boolean esPeligroso) {
		super(marca, modelo, color, matricula, encendido, velocidad, marchas);
		
		setPesoMaximo(pesoMaximo);
		
		setMercancia(esPeligroso);
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public boolean isMercancia() {
		return mercancia;
	}

	public void setMercancia(boolean mercancia) {
		this.mercancia = mercancia;
	}

	@Override
	public String toString() {
		return "Camion [pesoMaximo=" + pesoMaximo + ", mercancia=" + mercancia + "]";
	}
	
		
}
