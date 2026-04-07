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

public double precioFinal() {
		
		double precioTotal = this.precioBase;

		switch (this.consumoEnergetico) {
			case "A":
				precioTotal += 100;
				break;
				
			case "B":
				precioTotal += 80;
				break;
				
			case "C":
				precioTotal += 60;
				break;
				
			case "D":
				precioTotal += 50;
				break;
				
			case "E":
				precioTotal += 30;
				break;
				
			case "F":
				precioTotal += 10;
				break;
		}
		
		if (this.peso >= 0 && this.peso <= 19) {
			precioTotal += 10;
			
		} else if (this.peso >= 20 && this.peso <= 49) {
			precioTotal += 50;
			
		} else if (this.peso >= 50 && this.peso <= 79) {
			precioTotal += 80;
			
		} else if (this.peso >= 80) {
			precioTotal += 100;
		}

		return precioTotal;
	}

}
