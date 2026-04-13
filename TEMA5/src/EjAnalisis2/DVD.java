package EjAnalisis2;

public class DVD extends Ficha {

	private final int DIAS_PRESTADOS=5;


	private enum TipoDvd{
		
		PELICULA, DOCUMENTAL, SERIE
		
	}
	
	private TipoDvd tipo;
	
	private int año;
	
	private String director;

	
	
	public DVD(int id, String titulo, int tipo, int año, String director) {
		super(id, titulo);
		setAño(año);
		setTipo(tipo);
		setDirector(director);
	}



	public TipoDvd getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		
		if(tipo==0) {
			
			this.tipo=TipoDvd.PELICULA;
			
			
		}else if(tipo==1) {
			
			this.tipo=TipoDvd.DOCUMENTAL;
			
		}else {
			
			this.tipo=TipoDvd.SERIE;
			
		}
		
	}



	public int getAño() {
		return año;
	}



	public void setAño(int año) {
		this.año = año;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	@Override
	public int getDiasDePrestamo() {
		return DIAS_PRESTADOS;
	}



	@Override
	public String toString() {
		return "DVD [DIAS_PRESTADOS=" + DIAS_PRESTADOS + ", tipo=" + tipo + ", año=" + año + ", director=" + director
				+ "]";
	}
	
	
	
	
	
}
