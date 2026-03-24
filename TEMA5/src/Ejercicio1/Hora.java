package Ejercicio1;

public class Hora {

	protected int hora;
	
	protected int minutos;
	
	public Hora(int hora, int minutos){
		
		setHora(hora);
		
		setMinutos(minutos);
		
	}

	public int getHora() {
		return hora;
	}


	public int getMinutos() {
		return minutos;
	}

/*
 * Este metodo convierte la hora internamente la hora a mas un minuto conviertiendo la hora a uno * 
 * 
 * */
	public void inc(){
		
		if(!setMinutos(getMinutos()+1)){
			
				setMinutos(0);
			
			if(!setHora(getHora()+1)) {
				
				setHora(0);
				
			}
			
		}
		
	}
	
/*
 * @param valor: ingresas un int de los minutos que se ingresaran y si se añade
 * 
 * @return añadido: si esta añadido se vuelve true, si no se vuelve false
 * 
 * */	
	public boolean setMinutos(int valor) {
		
		boolean añadido=false;
		
		if(valor>=0&&valor<=59) {
			
			this.minutos=valor;
			
			añadido=true;		
			
		}
		
		return añadido;	
	}
	
	
	/*
	 * @param valor: si el valor no entra en las opciones devolvera false, si se consigue cambiar devolvera true
	 * 
	 * @return añadido: si esta añadido se vuelve true, si no se vuelve false
	 * 
	 * */
	public boolean setHora(int valor) {
		
		boolean añadido=false;
		
		if(valor>=0&&valor<=23) {
			
			this.hora=valor;
			
			añadido=true;		
			
		}
		
		return añadido;	
	}

	
	/*
	 * Imprimimos string con el reloj sin segundos
	 * 
	 * */
	@Override
	public String toString() {
		return ""+ getHora() + ":" + getMinutos() + "";
	}
	
	
	
	
	
}
