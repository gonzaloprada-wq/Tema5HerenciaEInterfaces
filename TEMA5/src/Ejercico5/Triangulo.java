package Ejercico5;

public class Triangulo extends Poligono {

	private double lado1 = 1;

	private double lado2 = 1;

	private double lado3 = 1;

	public Triangulo() {
		super(3);

	}

	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);

		setLado1(lado1);

		setLado2(lado2);

		setLado3(lado3);

	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 > 0) {

			this.lado1 = lado1;

		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {

			this.lado2 = lado2;

		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (lado3 > 0) {

			this.lado3 = lado3;

		}
	}

	@Override
	public double area() {

		double calculoS = (lado1 + lado2 + lado3) / 2;

		double calculoArea = Math.sqrt(calculoS * (calculoS - lado1) * (calculoS - lado2) * (calculoS - lado3));

		return calculoArea;
	}

	@Override
	public String toString() {
		return super.toString() + " Rectangulo[lado1=" + getLado1() + " lado2=" + getLado2() + " lado3=" + getLado3()
				+ " area=" + area() + "]\n\n";
	}
}
