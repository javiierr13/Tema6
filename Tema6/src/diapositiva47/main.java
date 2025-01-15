package diapositiva47;

public class main {

	public static void main(String[] args) {
		CuentaCorriente.setNombreBanco("BBVA");

		CuentaCorriente cc1 = new CuentaCorriente("46545645X", "Vladi");

		Gestor g1 = new Gestor("Manolo", "666 666 667");

		CuentaCorriente cc2 = new CuentaCorriente("12345678T", "Pepe", g1);

		cc1.mostrarInformacion();
		cc2.mostrarInformacion();

	}

}
