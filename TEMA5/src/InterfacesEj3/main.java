package InterfacesEj3;

public class main {

	public static void main(String[] args) {

		Perro perro = new Perro("Rex", "Pastor Aleman", 30.5, "marrón");
		Gato gato = new Gato("Ulises", "Siamés", 4.5, "blanco");
		
		mostrarPerro(perro);
		mostrarGato(gato);
		demostrarPolimorfismoVivir(new Vivir[] {perro, gato});
        demostrarPolimorfismoAnimalDomestico(new AnimalDomestico[] {perro, gato});
		
	}
	private static void mostrarPerro(Perro perro){
		
		System.out.println("=====PERRO=====");
		System.out.println(perro);
		perro.comer();
		perro.dormir();
		perro.hacerRuido();
		imprimirObediencia(perro.getNombre(), perro.hacerCaso());
		perro.vacunar();
		perro.sacarPaseo();
	}
	
	private static void mostrarGato(Gato gato){
		
		System.out.println("=====PERRO=====");
		System.out.println(gato);
		gato.comer();
		gato.dormir();
		gato.hacerRuido();
		imprimirObediencia(gato.getNombre(), gato.hacerCaso());
		gato.vacunar();
		gato.toseBolaPelo();
	}
	
	private static void imprimirObediencia(String nombre, boolean obedece) {
		System.out.println(nombre+(obedece ? "hace caso." : "no hace caso"));
	}
	
	private static void demostrarPolimorfismoVivir(Vivir[] animales){
		System.out.println("====POLIMORFISMO Vivir[]=====");
		for(Vivir animal : animales) {
			
			animal.hacerRuido();
			
		}
	}
	private static void demostrarPolimorfismoAnimalDomestico(AnimalDomestico[] animales){
		System.out.println("====POLIMORFISMO Animal[]=====");
		for(AnimalDomestico animal : animales) {
			
			imprimirObediencia(animal.getNombre(), animal.hacerCaso());;
			
		}
	}
}

