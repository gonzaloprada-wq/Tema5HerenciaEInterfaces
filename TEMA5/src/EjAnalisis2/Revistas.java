package EjAnalisis2;

public class Revistas extends Ficha{

	private final int DIAS_PRESTADOS=10;
	
	private int numeroRevista;
	
	private String fechaPublicacion;
	
	
	
	
	public Revistas(int id, String titulo, int numeroRevista, String fechaPublicacion) {
		super(id, titulo);
		this.numeroRevista = numeroRevista;
		this.fechaPublicacion = fechaPublicacion;
	}




	public int getNumeroRevista() {
		return numeroRevista;
	}

	public void setNumeroRevista(int numeroRevista) {
		this.numeroRevista = numeroRevista;
	}


	public String getFechaPublicacion() {
		return fechaPublicacion;
	}


	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}


	@Override
	public int getDiasDePrestamo() {
		return DIAS_PRESTADOS;
	}




	@Override
	public String toString() {
		return "Revistas [DIAS_PRESTADOS=" + DIAS_PRESTADOS + ", numeroRevista=" + numeroRevista + ", fechaPublicacion="
				+ fechaPublicacion + "]";
	}
	
	
	
	
	
}
