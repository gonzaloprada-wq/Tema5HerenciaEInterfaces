package EjComparador4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {

	public static void main(String[] args) {

		
		List<Ficha> estanteria = new ArrayList<>();
		
        estanteria.add(new Ficha(3, "Don Quijote"));
        estanteria.add(new Ficha(1, "A sangre y fuego"));
        estanteria.add(new Ficha(2, "Rayuela"));
        
        System.out.println(estanteria);
        
        Collections.sort(estanteria);
        
        System.out.println("=======ORDENADOS POR ID========");
        
        System.out.println(estanteria);
        
        System.out.println("=======ORDENADOS POR ABECEDARIO========");
        
        Comparator<Ficha> porTitulo = new Comparator<Ficha>() {
            @Override
            public int compare(Ficha f1, Ficha f2) {
                return f1.getName().compareToIgnoreCase(f2.getName());
            }
        };
        
        Collections.sort(estanteria, porTitulo);
        
        System.out.println(estanteria);
        
	}

}
