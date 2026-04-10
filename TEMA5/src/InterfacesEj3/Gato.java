package InterfacesEj3;

public class Gato extends AnimalDomestico {

	final double PROBABILIDAD_OBEDIENCIA=0.05;
	
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}

	@Override
	public void hacerRuido() {

	System.out.println(getNombre()+ "Dice: Miau");
		
	}

	public void toseBolaPelo() {
		
		System.out.println(getNombre()+"esta tosiendo pelo");
		
	}
	
	
	
	
}
