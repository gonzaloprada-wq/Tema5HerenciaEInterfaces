package EjAnalisis1;

import java.util.Objects;

public class Vehiculo implements Conducible {

	protected String marca;

	protected String modelo;

	protected String color;

	protected String matricula;

	protected boolean encendido;

	protected int velocidad = 0;

	protected int marchas;

	public Vehiculo(String marca, String modelo, String color, String matricula, Boolean encendido, int velocidad,
			int marchas) {
		setMarca(marca);
		setModelo(modelo);		
		setColor(color);
		setMatricula(matricula);
		setEncendido(encendido);
		setVelocidad(0);
		setMarchas(1);
	}

	@Override
	public void arrancarMotor() {

		setEncendido(true);

	}

	@Override
	public void pararMotor() {

		setEncendido(false);

		setVelocidad(0);

		setMarchas(1);

	}

	@Override
	public void subirMarcha() {

		if (getMarchas() == 1 && getVelocidad() >= 30) {

			setMarchas(2);

		} else if (getMarchas() == 2 && getVelocidad() >= 50) {

			setMarchas(3);

		} else if (getMarchas() == 3 && getVelocidad() >= 70) {

			setMarchas(4);

		} else if (getMarchas() == 4 && getVelocidad() >= 100) {

			setMarchas(5);

		}

	}

	@Override
	public void bajarMarcha() {

		if (getMarchas() == 5 && getVelocidad() <= 100) {

			setMarchas(4);

		} else if (getMarchas() == 4 && getVelocidad() <= 70) {

			setMarchas(3);

		} else if (getMarchas() == 3 && getVelocidad() <= 50) {

			setMarchas(2);

		} else if (getMarchas() == 2 && getVelocidad() <= 30) {

			setMarchas(1);

		}

	}

	@Override
	public void acelerar(int velocidadIngresada) {

		if (getEncendido()) {

			if (velocidadIngresada <= getVelocidad()) {

				System.out.println("Ya estas en esa velocidad! ");

			} else {

				for (int i = getVelocidad(); i <= velocidadIngresada; i++) {

					setVelocidad(i);

					subirMarcha();

					System.out.println("La velocidad actual de tu vehiculo es: " + getVelocidad() + " con la marcha "
							+ getMarchas()+"\n");

				}

			}

		} else {

			System.out.println("ERROR--Motor apagado, enciendalo para aceledar!");

		}

	}


	@Override
	public void mantenerVelocidad(int tiempo) {

		for(int i=tiempo; i>0; i--) {
			
			System.out.println("Tu velocidad actual sera "+getVelocidad()+" Segundos restantes: "+i);
			
		}
		
	}

	@Override
	public void frenarHastaParar() {
	
		if(getEncendido()) {
			
			for(int i=getVelocidad(); i>=0; i--) {
				
				setVelocidad(i);
				
				bajarMarcha();
				

				System.out.println("La velocidad actual de tu vehiculo es: " + getVelocidad() + " con la marcha "
						+ getMarchas()+"\n");
				
				
			}
			
			setEncendido(false);
			
		}else{
			
			System.out.println("ERROR--El motor ya esta apagado!");
			
		}
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Boolean getEncendido() {
		return encendido;
	}

	public void setEncendido(Boolean encendido) {
		this.encendido = encendido;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		if (marchas <= 0) {

			marchas = 0;

		}

		if (marchas > 5) {

			marchas = 5;

		}

		this.marchas = marchas;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula
				+ ", encendido=" + encendido + ", velocidad=" + velocidad + ", marchas=" + marchas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, encendido, marca, marchas, matricula, modelo, velocidad);
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean esIgual=false;
		
		Vehiculo nuevoVehiculo = (Vehiculo) obj;
		
		if(this.matricula.equals(nuevoVehiculo.getMatricula())){
			
			esIgual=true;
			
		}
		
		return esIgual;
	}
	
}
