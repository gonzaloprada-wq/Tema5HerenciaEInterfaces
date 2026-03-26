package Ejercicio2;

public class Empleado {
	
	private String nombre;

	public Empleado(String nombre) {
		
		setNombre(nombre);
	}
	
	public Empleado() {
		
		
		
	}
	
	public void setNombre(String nombre){
		
		this.nombre=nombre;
		
	}
	
	public String getNombre(){
		
		return this.nombre;
		
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
	
	
	
}
