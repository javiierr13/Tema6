package act2Boletin;

import java.util.Random;

public class Monedero {

	private long ID;
	private double saldo;

	Random rand = new Random();

	public Monedero(double saldo) {
		ID = rand.nextLong(100000000000L, 1000000000000L);
		this.saldo = saldo;

	}

	public Monedero() {
		ID = rand.nextLong(100000000000L, 1000000000000L);
		this.saldo = 0;
	}

	public long getID() {
		return ID;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double cantidad) {
		if (cantidad <= 0.0) {
			throw new IllegalArgumentException("La cantidad a ingresar debe ser positiva. ");
		}
		this.saldo += cantidad;
	}

	public void gastar(double cantidad) {
		this.saldo -= cantidad;
	}
	
	public static void transferencia(Monedero emisor, Monedero receptor, int cantidad) {
		emisor.saldo -= cantidad;
		receptor.saldo +=cantidad;
	}

	public void mostrarInfo() {
		System.out.println("ID: " + ID);
		System.out.println("Saldo: " + saldo);
	}
	


}
