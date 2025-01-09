package cuentaCorriente_diapo28;

import java.lang.ProcessHandle.Info;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente a1 = new CuentaCorriente("20099102T", "Javier");
		// aqui creamos la cuenta a saldo 0

		CuentaCorriente b2 = new CuentaCorriente("10098102R", "Jesus", 1000);
		// aqui creamos la cuenta con el saldo 1000 metido por parametros

		b2.SacarDinero(50);
		a1.IngresarDinero(100);
		
		a1.InfoCuenta();
		b2.InfoCuenta();
		
	}
}

