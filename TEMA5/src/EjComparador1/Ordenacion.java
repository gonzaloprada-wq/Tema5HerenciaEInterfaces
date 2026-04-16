package EjComparador1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ordenacion {

	public static void main(String[] args) {

		Integer[] numero = new Integer[20];
		
		Random rand = new Random();
		
		for(int i=0; i<numero.length; i++) {
			
			numero[i]=rand.nextInt(100)+1;
			
		}
		
		System.out.println("Tabla original: " + Arrays.toString(numero));
		
		Arrays.sort(numero, new ComparadorDecreciente());
		
		System.out.println("Tabla original: " + Arrays.toString(numero));
		
	}

}
