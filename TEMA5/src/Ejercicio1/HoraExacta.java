package Ejercicio1;

public class HoraExacta extends Hora {

	private int segundos;
	
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		
		setSegundos(segundos);
		
		
	}

	
	/*
	 * @param valor: el procima cantidad de segundos que tendra 
	 * 
	 * @return añadido: si esta añadido se vuelve true, si no se vuelve false
	 * */
	public boolean setSegundos(int valor) {
		
	boolean añadido=false;
		
		if(valor>=0&&valor<=59) {
			
			this.minutos=minutos;
			
			añadido=true;		
			
		}
		
		return añadido;	
		
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	/*
	 * Esta funcion hace lo mismo que su superclase, pero sumando antes a la cantidad segundos,
	 * si es posible añadirle a los segunso entonces se ejecutara la funcion de la superclase
	 * 
	 * */
	@Override
	public void inc() {
		
		if(!setSegundos(getSegundos()+1)){
			
			setSegundos(0);
			
			super.inc();			
		}
		
	}
	
	/*
	 * Imprimimos string con el reloj con segundos
	 * 
	 * */
	@Override
	public String toString() {
		return ""+ getHora() + ":" + getMinutos() + ":"+getMinutos();
	}
}
