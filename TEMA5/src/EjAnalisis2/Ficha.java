package EjAnalisis2;

import java.util.Objects;

public abstract class Ficha implements Prestable {

	protected int id;
	
	protected String titulo;
	
	
	
	public Ficha(int id, String titulo) {
		setId(id);
		setTitulo(titulo);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public abstract int getDiasDePrestamo();



	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales=false;
		
		Ficha nuevaFicha = (Ficha) obj;
		
		if(nuevaFicha.getId()==getId()) {
			
			sonIguales=true;
			
		}
		
		return sonIguales;
	}


	@Override
	public String toString() {
		return "Ficha [id=" + id + ", titulo=" + titulo + "]";
	}
	
	
	
	
}
