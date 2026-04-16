package EjComparador3;

import java.util.Comparator;

public class comparadorGoles implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista futbolista1, Futbolista futbolista2) {
		
		return futbolista2.getNumerosGoles()-futbolista1.getNumerosGoles();
	}

	

}
