package EjAnalisis4;

public class Persona extends Contacto{

	private String cumpleaños;


	public Persona(String nombre, int telefono, String cumpleaños) {
		super(nombre, telefono);
		setCumpleaños(cumpleaños);
	}

	
	public String getCumpleaños() {
		return cumpleaños;
	}

	public void setCumpleaños(String cumpleaños) {
		setCumpleaños(cumpleaños);
	}


	@Override
	public String toString() {
		return "Contacto tipo Persona [nombre=" + nombre + ", telefono=" + telefono + ",cumpleaños: "+getCumpleaños()+"]";
	}
	
	
	
}
