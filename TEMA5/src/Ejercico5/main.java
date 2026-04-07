package Ejercico5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int selector=0;
		
		
		do {
		
		imprimirMenu();
			
		selector=seleccionarNumero();
			
		seleccionarSwitch(selector);
		
		}while(selector!=4);
		
		System.out.println("Saliendo...");
		
	}

	
	public static void imprimirMenu(){
		
		System.out.println("BIENVENIDO!");
		System.out.println("1. Introducir triángulo.\r\n"
				+ "2. Introducir rectángulo.\r\n"
				+ "3. Mostrar polígonos.\r\n"+
					"4. Salir"
				+ "");
		
		
	}
	
	public static int seleccionarNumero(){
		
		Scanner reader = new Scanner(System.in);

		boolean numeroValido=true;
		
		int selector=0;
		
		do {
		
		 selector=0;
		
		try {
			
			System.out.println("\nIngresa numero del selector entero: ");
			
			selector = reader.nextInt();
			
			numeroValido = true;
			
		} catch (Exception e) {

			numeroValido=false;
			
			System.out.println("ERROR!");
			reader.nextLine();
			
		}
		
		}while(!numeroValido);
		
		return selector;
		
	}
	
	public static void seleccionarSwitch(int selector){
		
		switch(selector) {
		
		case 1: 
			
			
			
			
			
			break;
		
		
		}
		
		
		
	}
	
	
	
}
