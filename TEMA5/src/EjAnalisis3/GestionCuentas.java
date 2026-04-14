package EjAnalisis3;

import java.util.ArrayList;

public class GestionCuentas {

	static ArrayList<CuentaBancaria> listaCuentasBancarias = new ArrayList<CuentaBancaria>();

	public GestionCuentas() {

	}

	public static ArrayList<CuentaBancaria> getListaCuentasBancarias() {
		return listaCuentasBancarias;
	}

	public static boolean buscarCuenta(int numero) {

		boolean repetida = false;

		for (CuentaBancaria actual : listaCuentasBancarias) {

			if (actual.getNumeroCuenta() == numero) {

				repetida = true;

			}

		}

		return repetida;
	}

	public static boolean añadirCuenta(CuentaBancaria nueva){
		
		boolean haSidoCreada=false;
		
		if(!buscarCuenta(nueva.getNumeroCuenta())) {
			
			 getListaCuentasBancarias().add(nueva);
			 
			 haSidoCreada=true;
			 
			
		}
		
		return haSidoCreada;
	}

	public static boolean eliminarCuenta(int numero) {
		
		boolean eliminada=false;
		
		for (CuentaBancaria actual : listaCuentasBancarias) {

			if (actual.getNumeroCuenta() == numero) {

				getListaCuentasBancarias().remove(actual);
				
				eliminada=true;
				
				break;

			}

		}
		
		return eliminada;
		
	}
}
