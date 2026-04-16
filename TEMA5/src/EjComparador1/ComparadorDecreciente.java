package EjComparador1;

import java.util.Comparator;

public class ComparadorDecreciente implements Comparator<Integer> {

	@Override
	public int compare(Integer numero1, Integer numero2) {
		
		return numero2.compareTo(numero1);
	}


	
}
