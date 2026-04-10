package InterfacesEj1;

public class Socio implements Comparable{

	private static final Socio Object = null;

	private int id;
	
	private String nombre;
	
	private int edad;
	
	
	
	
	public Socio(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public int compareTo(Object o) {

		Socio otroSocio=(Socio) o;	
		
		return Integer.compare(this.id, otroSocio.id);
		
	}
	
}


