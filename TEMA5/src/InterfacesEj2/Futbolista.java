package InterfacesEj2;

import java.util.Objects;

public class Futbolista implements Comparable {

	private int numeroDeCamiseta;

	private String nombre;

	private int edad;

	private int numeroGoles;

	private boolean getNueva;

	
	
	public Futbolista(int numeroDeCamiseta, String nombre, int edad, int numeroGoles) {
		this.numeroDeCamiseta = numeroDeCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numeroGoles = numeroGoles;
	}

	@Override
	public int compareTo(Object obj) {
		
		int comparacion;
		
		Futbolista nuevoFutbolista = (Futbolista) obj;
		
		if(Integer.compare(this.numeroDeCamiseta, nuevoFutbolista.getNumeroDeCamiseta())!=0){
			
			comparacion=Integer.compare(this.numeroDeCamiseta, nuevoFutbolista.getNumeroDeCamiseta());
			
		}else {
			
			comparacion=this.nombre.compareToIgnoreCase(nuevoFutbolista.nombre);
			
		}
		
		
		return comparacion;
	}

	@Override
	public String toString() {
		return "Futbolista [numeroDeCamiseta=" + numeroDeCamiseta + ", nombre=" + nombre + ", edad=" + edad
				+ ", numeroGoles=" + numeroGoles + "]";
	}

	@Override
	public boolean equals(Object obj) {

		boolean sonIguales=false;
		
		Futbolista futbolistaNueva = (Futbolista) obj;
		
		if(futbolistaNueva.getNumeroDeCamiseta()==this.numeroDeCamiseta) {
			
			if(futbolistaNueva.getNombre().equals(this.nombre)) {
				
				sonIguales=true;
				
			}
			
		}
		
		return sonIguales;
	}

	public int getNumeroDeCamiseta() {
		return numeroDeCamiseta;
	}

	public void setNumeroDeCamiseta(int numeroDeCamiseta) {
		this.numeroDeCamiseta = numeroDeCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumeroGoles() {
		return numeroGoles;
	}

	public void setNumeroGoles(int numeroGoles) {
		this.numeroGoles = numeroGoles;
	}

}
