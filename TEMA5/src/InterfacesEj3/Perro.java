package InterfacesEj3;

public class Perro extends AnimalDomestico{
	
	final double PROBABILIDAD_OBEDIENCIA=0.90;
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	
	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}

	@Override
	public void hacerRuido() {
		
		System.out.println(getNombre()+"Dice: Guau");
		
	}

	public void sacarPaseo() {
		
		System.out.println(getNombre()+"esta de paseo");
		
	}
}
