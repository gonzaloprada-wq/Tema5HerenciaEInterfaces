package EjComparador3;

import java.util.Arrays;

import EjComparador2.CompararEdad;

public class main {

	public static void main(String[] args) {
		
		Futbolista Jorge = new Futbolista(3, 45, "Jorge");
		Futbolista Sofia = new Futbolista(5, 35, "Sofia");
		Futbolista Enrique = new Futbolista(15, 75, "Enrique");
		Futbolista Paco = new Futbolista(9, 25, "Paco");
		Futbolista Pedri = new Futbolista(8, 55, "Pedri");
		
		Futbolista[] listaFutbolistas= new Futbolista[5];
		
		listaFutbolistas[0]=Jorge;
		listaFutbolistas[1]=Sofia;
		listaFutbolistas[2]=Enrique;
		listaFutbolistas[3]=Paco;
		listaFutbolistas[4]=Pedri;
		
		System.out.println("====LISTA NORMAL===");
		
		System.out.println(Arrays.toString(listaFutbolistas));
		
		Arrays.sort(listaFutbolistas, new comparadorGoles());
		
		System.out.println("====LISTA GOLES DESC===");
		
		System.out.println(Arrays.toString(listaFutbolistas));
		
		Arrays.sort(listaFutbolistas, new comparadorEdad());
		

		System.out.println("====LISTA EDAD ASC===");
		
		System.out.println(Arrays.toString(listaFutbolistas));
		
	}

}
