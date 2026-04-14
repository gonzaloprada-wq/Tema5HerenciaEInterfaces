package EjAnalisis3;

import java.util.ArrayList;
import java.util.Objects;

public abstract class CuentaBancaria {

	protected int numeroCuenta;

	protected double saldo;

	protected ArrayList<Titular> listaTitulares = new ArrayList<>();

	public CuentaBancaria(int numeroCuenta, double saldo, Titular primerTitular) {
		setNumeroCuenta(numeroCuenta);;
		setSaldo(saldo);;
		getListaTitulares().add(primerTitular);
	
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

	public ArrayList<Titular> getListaTitulares() {
		return listaTitulares;
	}

	public void setListaTitulares(ArrayList<Titular> listaTitulares) {
		this.listaTitulares = listaTitulares;
	}

	public abstract void ingresarSaldo(double saldo);

	public abstract void retirarSaldo(double saldo);

	public void añadirTitular(Titular nuevoTitular) {

		boolean estaEnLista = false;

		if (getListaTitulares().size() < 3) {

			for (Titular actual : getListaTitulares()) {
				if (nuevoTitular.equals(actual)) {

					estaEnLista = true;

				}
			}

			if (!estaEnLista) {
				getListaTitulares().add(nuevoTitular);
			} else {

				System.out.println("ERROR! Este titular se encuentra en la lista");

			}
		} else {

			System.out
					.println("ERROR! Maximo 3 titulares, si quieres añadir un nuevo titular deberar borrar uno antes.");

		}

	}

	public void borrarTitular(String dniTitular) {

		boolean estaEnLista = false;

		if(getListaTitulares().size()!=1) {
		for (Titular actual : getListaTitulares()) {

			if (actual.getDni().equals(dniTitular)) {

				estaEnLista = true;

				getListaTitulares().remove(actual);

				break;
			}

		}

		if (estaEnLista) {

			System.out.println("Eliminado Correctamente");

		}else {
			
			System.out.println("ERROR! Dicho DNI no esta listado");
			
		}
		}else {
			
			System.out.println("ERROR! No puedes tener 0 titulares");
			
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaTitulares, numeroCuenta, saldo);
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(listaTitulares, other.listaTitulares) && numeroCuenta == other.numeroCuenta
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", listaTitulares="
				+ listaTitulares + "]";
	}
	
}
