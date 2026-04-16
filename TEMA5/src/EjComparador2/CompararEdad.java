package EjComparador2;

import java.util.Comparator;

public class CompararEdad implements Comparator<Socio>{

	@Override
	public int compare(Socio socio1, Socio socio2) {

		
		return socio2.getEdad()-socio1.getEdad();
	}

}
