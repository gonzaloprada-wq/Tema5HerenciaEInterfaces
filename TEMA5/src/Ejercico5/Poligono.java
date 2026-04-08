package Ejercico5;

import java.util.Objects;

abstract class Poligono {

	protected int numeroLados;
	
	public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }
	
	public Poligono(){
		
	}

	
	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public abstract double area();
	
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroLados);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poligono other = (Poligono) obj;
		return numeroLados == other.numeroLados;
	}

	@Override
	public String toString() {
		return "Poligono [numeroLados=" + getNumeroLados() + "]\n\n";
	}
	
	
	
}
