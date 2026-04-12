package InterfacesEj2;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Futbolista[] tablaFutbolistas = new Futbolista[5];
		
		tablaFutbolistas[0] = new Futbolista(10, "Pelé", 82, 762);
        tablaFutbolistas[1] = new Futbolista(7, "Cristian", 39, 870);
        tablaFutbolistas[2] = new Futbolista(10, "Maradona", 60, 345);
        tablaFutbolistas[3] = new Futbolista(1, "Casillas", 42, 0);
        tablaFutbolistas[4] = new Futbolista(9, "Ronaldo", 47, 414);
        
     
        System.out.println("--- TABLA ANTES DE ORDENAR ---");
        for (Futbolista f : tablaFutbolistas) {
            System.out.println(f);
        }
        
        Arrays.sort(tablaFutbolistas);
        
        System.out.println("\n--- TABLA DESPUÉS DE ORDENAR ---");
        for (Futbolista f : tablaFutbolistas) {
            System.out.println(f);
        }
        
	}

}
