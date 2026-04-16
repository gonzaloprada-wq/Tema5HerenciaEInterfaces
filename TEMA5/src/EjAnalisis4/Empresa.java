package EjAnalisis4;

public class Empresa extends Contacto {


	private String paginaWeb;

	public Empresa(String nombre, int telefono, String paginaWeb) {
		super(nombre, telefono);
		setPaginaWeb(paginaWeb);
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	@Override
	public String toString() {
		return "Contacto tipo Empresa [nombre=" + nombre + ", telefono=" + telefono + ",pagina web: "+getPaginaWeb()+"]";
	}
	
	
	
}
