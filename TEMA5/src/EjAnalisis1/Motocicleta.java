package EjAnalisis1;

public class Motocicleta extends Vehiculo {

	private int cilindridad;
	
	public Motocicleta(String marca, String modelo, String color, String matricula, Boolean encendido, int velocidad,
			int marchas, int cilindridad) {
		
		super(marca, modelo, color, matricula, encendido, velocidad, marchas);
	
		setCilindridad(cilindridad);
		
	}

	public int getCilindridad() {
		return cilindridad;
	}

	public void setCilindridad(int cilindridad) {
		this.cilindridad = cilindridad;
	}
	
	
	public boolean necesitaCarnet() {
		
		boolean necesita=false;
		
		if(getCilindridad()>=125) {
			
			necesita=true;
			
		}
		
		return necesita;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindridad=" + cilindridad + "]";
	}
	
	
	
}
