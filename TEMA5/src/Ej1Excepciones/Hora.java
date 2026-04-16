package Ej1Excepciones;

public class Hora {

	private int segundos;
	
	private int minutos;
	
	private int horas;


	public Hora() {
	}

	public Hora(int segundos, int minutos, int horas) throws NegativeSecondException, NegativeMinuteException, NegativeHourException  {
		setSegundos(segundos);
		setMinutos(minutos);
		setHoras(horas);
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) throws NegativeSecondException {
		
		if(segundos<0) {
			
			throw new NegativeSecondException();
			
		}
		
		this.segundos = segundos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) throws NegativeMinuteException {
		
		if(minutos<0) {
			
			throw new NegativeMinuteException();
			
		}
		
		this.minutos = minutos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) throws NegativeHourException {
		
		if(horas<0) {
			
			throw new NegativeHourException();
			
		}
		
		this.horas = horas;
	}

	@Override
	public String toString() {
		return getHoras()+":"+getMinutos()+":"+getSegundos();
	}
	
	
	
}
