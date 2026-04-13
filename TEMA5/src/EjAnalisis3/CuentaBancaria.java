package EjAnalisis3;

public abstract class CuentaBancaria {

	protected int numeroCuenta;
	
	protected double saldo;
	
	protected int contadorTitulares;
	
	protected Titular[] listaTitulares = new Titular[3];

	public CuentaBancaria(int numeroCuenta, double saldo, int contadorTitulares, Titular[] listaTitulares) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.contadorTitulares = contadorTitulares;
		this.listaTitulares = listaTitulares;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getContadorTitulares() {
		return contadorTitulares;
	}

	public void setContadorTitulares(int contadorTitulares) {
		this.contadorTitulares = contadorTitulares;
	}

	public Titular[] getListaTitulares() {
		return listaTitulares;
	}

	public void setListaTitulares(Titular[] listaTitulares) {
		this.listaTitulares = listaTitulares;
	}
	
	public static void
	
	
}
