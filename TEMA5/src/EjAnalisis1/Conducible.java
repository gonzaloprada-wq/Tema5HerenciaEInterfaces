package EjAnalisis1;

public interface Conducible {

	void arrancarMotor();
	void pararMotor();
	void subirMarcha();
	void bajarMarcha();
	void acelerar(int velocidadIngresada);
	void mantenerVelocidad(int tiempo);
	void frenarHastaParar();
	
}
