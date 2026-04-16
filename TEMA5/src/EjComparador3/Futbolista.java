package EjComparador3;

public class Futbolista {

	private int numerosGoles;
	
	private int edad;
	
	private String nombre;

	public Futbolista(int numerosGoles, int edad, String nombre) {
		this.numerosGoles = numerosGoles;
		this.edad = edad;
		this.nombre = nombre;
	}

	public int getNumerosGoles() {
		return numerosGoles;
	}

	public void setNumerosGoles(int numerosGoles) {
		this.numerosGoles = numerosGoles;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "[numerosGoles=" + numerosGoles + ", edad=" + edad + ", nombre=" + nombre + "]\n";
	}

	
	
}
