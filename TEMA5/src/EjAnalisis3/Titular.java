package EjAnalisis3;

public class Titular {

	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private int telefono;

	public Titular(String dni, String nombre, String apellidos, int telefono) {
		setDni(dni);
		setNombre(nombre);
		setApellidos(apellidos);
		setTelefono(telefono);
	}

	public Titular() {
		
		
		
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	

}
