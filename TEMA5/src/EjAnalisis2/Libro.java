package EjAnalisis2;

public class Libro extends Ficha{

	private String autor;
	
	private String editorial;
	
	private final int DIAS_PRESTADOS=15;
	
	
	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);
		setAutor(autor);		
		setEditorial(editorial);
	}




	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}




	public String getEditorial() {
		return editorial;
	}




	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	
	
	
	
	@Override
	public int getDiasDePrestamo() {
		return DIAS_PRESTADOS;
	}




	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", editorial=" + editorial + ", DIAS_PRESTADOS=" + DIAS_PRESTADOS + "]";
	}
	
	
	
}
