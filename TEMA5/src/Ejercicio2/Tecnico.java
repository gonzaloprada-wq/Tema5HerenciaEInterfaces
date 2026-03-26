package Ejercicio2;

public class Tecnico extends Operario {

	public Tecnico(String nombre){
		
		super(nombre);
		
	}
	
	public Tecnico(){
		
		
		
	}

	@Override
	public String toString() {
		return  super.toString()+" -> Tecnico";
	}
	
	
	
}
