package EjAnalisis1;

public class Turismo extends Vehiculo{

	private int numeroPlazas;
	
	enum tiposDeUso{
		
		PROFESIONAL, PARTICULAR
		
	};
	
	private tiposDeUso tipoUso;
	
	public Turismo(String marca, String modelo, String color, String matricula, Boolean encendido, int velocidad,
			int marchas) {
		super(marca, modelo, color, matricula, encendido, velocidad, marchas);

		setNumeroPlazas(1);
		
		
	}

	public Turismo(String marca, String modelo, String color, String matricula, Boolean encendido, int velocidad,
			int marchas, int numeroPlazas, int tipoUso) {
		super(marca, modelo, color, matricula, encendido, velocidad, marchas);

		this.numeroPlazas=numeroPlazas;
		
		setTipoUso(tipoUso);
		
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		
		if(numeroPlazas<1) {
			
			numeroPlazas=1;
			
		}
		
		this.numeroPlazas = numeroPlazas;
	}

	public String getTipoUso() {
		return tipoUso.name();
	}

	
	public void setTipoUso(int tipoUso) {
			
		if(tipoUso==0) {
			
			this.tipoUso=tiposDeUso.PROFESIONAL;
			
		}else {
			
			this.tipoUso=tiposDeUso.PARTICULAR;
		}
	
	}

	@Override
	public String toString() {
		return  super.toString()+"Turismo [numeroPlazas=" + numeroPlazas + ", tipoUso=" + tipoUso + "]";
	}
	
	
	
}
