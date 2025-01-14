package cuentaCorriente_diapo43;

public class CuentaCorriente {

	String DNI;
	public String nombre;
	private double saldo;

	public CuentaCorriente(String DNI, String nombre) {
		this.DNI = DNI;
		 this.nombre = nombre;
		this.saldo = 0.0;
	}
	// el constructor de arriba, crea una cuenta con el saldo a 0

	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	// el constructor de arriba, crea una cuenta con el saldo que le metamos por
	// parametros

	void IngresarDinero(double cantDinero) {
		this.saldo += cantDinero;
		System.out.println("Has ingresado " + cantDinero + "€ de la cuenta de " + nombre);
	}

	void SacarDinero(double cantDinero) {
		if (this.saldo > cantDinero) {
			this.saldo -= cantDinero;
			System.out.println("Has sacado " + cantDinero + "€ de la cuenta de " + nombre);
		} else {
			System.out.println("Saldo Insuficiente");
		}

	}

	void InfoCuenta() {
		System.out.println("Este es el DNI: " + DNI);
		System.out.println("Este es el Nombre: " + nombre);
		System.out.println("Este es el Saldo: " + saldo);

	}

}
