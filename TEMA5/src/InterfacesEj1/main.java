package InterfacesEj1;

public class main {

	public static void main(String[] args) {

		Socio socio1=new Socio(1,"Pablo",30);
		Socio socio2=new Socio(6,"Elena",39);
		Socio socio3=new Socio(5,"Jesus",70);
		Socio socio4=new Socio(2,"Pepe",10);
		Socio socio5=new Socio(19,"Juan",30);
		
		comparar(socio1, socio2);
		comparar(socio5, socio2);
		comparar(socio3, socio2);
	}

	public static void comparar(Socio socio1, Socio socio2){
		
		System.out.println(socio1.compareTo(socio2));
		
		
	}
	
}
