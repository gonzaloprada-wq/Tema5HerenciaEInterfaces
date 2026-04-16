package EjComparador3;

import java.util.Comparator;

public class comparadorEdad implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista futbolista1, Futbolista futbolista2) {
		
		return futbolista1.getEdad()-futbolista2.getEdad();
	}

}
