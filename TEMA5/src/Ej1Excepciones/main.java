package Ej1Excepciones;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws NegativeSecondException {

		Scanner reader = new Scanner(System.in);
		
		Hora hora = new Hora();
		
		boolean realizadoCorrectamente;
		
		do {
			
		try {
		
		realizadoCorrectamente=true;
			
		System.out.println("Ingresa segundos: ");
		
		int segundos = reader.nextInt();
			
		hora.setSegundos(segundos);
		
		} catch (NegativeSecondException e) {
	        
	        System.out.println(e.getMessage()); 
	        
	        realizadoCorrectamente = false;
		}catch (Exception e) {
			
			System.out.println("Valor no valido! Vuelve a intentarlo!");
			
			reader.nextLine();
			
			realizadoCorrectamente=false;
			
		}
		
		}while(!realizadoCorrectamente);
	
		
		
		
	}

}
