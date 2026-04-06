package Ejercicio4;

public class electrodomesticos {

	static String[] letrasConsumo = { "A", "B", "C", "D", "E", "F" };

	private double precioBase = 100;

	private int peso = 5;

	private enum Color {

		BLANCO, NEGRO, ROJO, AZUL, GRIS

	}

	private Color color;

	private String consumoEnergetico;

	public electrodomesticos(double precioBase, int peso) {

		setPrecioBase(precioBase);
		setPeso(peso);
		this.color = Color.BLANCO;
		this.consumoEnergetico = "F";

	}

	public electrodomesticos(double precioBase, int peso, String colorElegido, String consumoEnergeticoElegido) {

		setPrecioBase(precioBase);
		setPeso(peso);
		setColor(colorElegido);
		setConsumoEnergetico(consumoEnergeticoElegido);

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setColor(String colorRecibido) {

		if (comprobarColor(colorRecibido)) {

			this.color = Color.valueOf(colorRecibido.toUpperCase());

		} else {

			this.color = Color.BLANCO;

		}

	}

	public boolean comprobarColor(String colorRecibido) {

		boolean estaDentro = false;

		for (Color colorActual : Color.values()) {

			if (colorActual.name().equalsIgnoreCase(colorRecibido)) {

				estaDentro = true;

			}

		}

		return estaDentro;
	}

	public boolean comprobarConsumoEnergetico(String consumoEnergetico) {

		boolean estaDentro = false;

		for (String letra : letrasConsumo) {

			if (consumoEnergetico.equals(letra)) {

				estaDentro = true;

			}

		}

		return estaDentro;
	}

	public String getColor() {

		return color.name();

	}

	public void setConsumoEnergetico(String consumoEnergetico) {

		consumoEnergetico = consumoEnergetico.toUpperCase().trim();

		if (comprobarConsumoEnergetico(consumoEnergetico)) {

			this.consumoEnergetico = consumoEnergetico;

		} else {

			this.consumoEnergetico = "F";

		}

	}

	public String getConsumoEnergetico() {

		return this.consumoEnergetico;

	}

	public void precioFinal() {

		switch (getConsumoEnergetico()) {

		case "A" -> this.precioBase += 100;

		case "B" -> this.precioBase += 80;

		case "C" -> this.precioBase += 60;

		case "D" -> this.precioBase += 50;

		case "E" -> this.precioBase += 30;

		case "F" -> this.precioBase += 10;

		default -> this.precioBase += 0;

		}
		precioPorTamaño();
		
	}

	public void precioPorTamaño() {
		int sumaDePrecio = 0;
		
		if (this.peso >= 0 && this.peso < 20) {
			sumaDePrecio += 10;

		} else if (this.peso >= 20 && this.peso < 50) {
			sumaDePrecio += 50;

		} else if (this.peso >= 50 && this.peso < 80) {
			sumaDePrecio += 80;
		} else if (this.peso >= 80) {
			sumaDePrecio += 100;
		} else {
			sumaDePrecio += 0;
		}
		
		this.precioBase+=sumaDePrecio;
	}
}
