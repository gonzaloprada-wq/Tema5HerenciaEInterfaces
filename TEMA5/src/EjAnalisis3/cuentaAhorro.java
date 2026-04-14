package EjAnalisis3;

public class cuentaAhorro extends CuentaBancaria{

	private double cuotaMantenimiento;
	
	private double interesAnual;
	
	
	
	public cuentaAhorro(int numeroCuenta, double saldo, Titular primerTitular, double cuotaMantenimiento,
		double interesAnual) {
		super(numeroCuenta, saldo, primerTitular);
		this.cuotaMantenimiento = cuotaMantenimiento;
		this.interesAnual = interesAnual;
	}

	
	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}


	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}


	public double getInteresAnual() {
		return interesAnual;
	}


	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}


	@Override
	public void ingresarSaldo(double saldo) {
		
	}

	@Override
	public void retirarSaldo(double saldo) {
		
	}

}
