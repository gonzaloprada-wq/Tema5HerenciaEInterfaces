package Ejercico5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		gestion nuevoGestion = new gestion();
		
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
			
			
			añadirTriangulo();
			
			
			break;
		
		case 2:
			
			añadirRectangulo();
			
			break;	
			
		case 3:
			
			gestion gestionActual = new gestion();
			
			gestionActual.imprimirPoligonos();
			
			break;	
			
		
		}
		
	
		
		
	}
	
	public static double recibirDatoDouble(){
		
		Scanner reader = new Scanner(System.in);

		boolean numeroValido=true;
		
		double selector=0;
		
		do {
		
		 selector=0;
		
		try {
			
			System.out.println("\nIngresa numero (0 o menor es automaticamente 1): ");
			
			selector = reader.nextDouble();
			
			numeroValido = true;
			
		} catch (Exception e) {

			numeroValido=false;
			
			System.out.println("ERROR!");
			reader.nextLine();
			
		}
		
		}while(!numeroValido);
		
		return selector;
		
	}
	
	public static void añadirTriangulo(){
		
		Triangulo nuevoTriangulo = new Triangulo();
		
		gestion gestionActual = new gestion();
		
		
		System.out.println("Vamos a añadir el lado 1: ");
		
		double lado1=recibirDatoDouble();
		
		System.out.println("Vamos a añadir el lado 2: ");
		
		double lado2=recibirDatoDouble();
		
		System.out.println("Vamos a añadir el lado 3: ");
		
		double lado3=recibirDatoDouble();
		
		nuevoTriangulo.setLado1(lado1);
		nuevoTriangulo.setLado2(lado2);
		nuevoTriangulo.setLado3(lado3);
		
		gestionActual.añadirPoligonoListadO(nuevoTriangulo);
		
		
	}
	
	public static void añadirRectangulo(){
		
		Rectangulo nuevoRectangulo= new Rectangulo();
		
		gestion gestionActual = new gestion();
		
		
		System.out.println("Vamos a añadir el lado 1: ");
		
		double lado1=recibirDatoDouble();
		
		System.out.println("Vamos a añadir el lado 2: ");
		
		double lado2=recibirDatoDouble();
		
		nuevoRectangulo.setLado1(lado1);
		nuevoRectangulo.setLado2(lado2);
	
		gestionActual.añadirPoligonoListadO(nuevoRectangulo);
		
		
	}
}
