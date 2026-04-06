package Ejercicio4;

public class Lavadora extends electrodomesticos {

	private int carga = 5;

	public Lavadora(double precioBase, int peso) {

		super(precioBase, peso);
	}

	public Lavadora(double precioBase, int peso, String colorElegido, String consumoEnergeticoElegido, int carga) {
		
		super(precioBase, peso, colorElegido, consumoEnergeticoElegido);
		
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public double precioFinal() {
		double precioCalculado = super.precioFinal();

		if (this.carga > 30) {
			precioCalculado += 50;
		}

		return precioCalculado;
	}
}