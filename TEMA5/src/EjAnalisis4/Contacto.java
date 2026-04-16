package EjAnalisis4;

import java.util.Objects;

public class Contacto {

	protected String nombre;
	
	protected int telefono;
	
	public Contacto(String nombre, int telefono) {
		
		setNombre(nombre);
		
		setTelefono(telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {

		boolean esIgual=false;
		
		Contacto nuevoContacto = (Contacto) obj;
		
		if(getNombre().equals(nuevoContacto.getNombre())) {
			
					esIgual=true;
			
		}
		
		
		return esIgual;
		
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
}
