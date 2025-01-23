package act2Boletin;

public class Main {

	public static void main(String[] args) {

		Monedero m1 = new Monedero(1000);
		Monedero m2 = new Monedero(-50);
		Monedero m3 = new Monedero();

		m1.mostrarInfo();
		m2.mostrarInfo();
		m3.mostrarInfo();

		System.out.println("");

		m1.ingresar(50);
		m2.ingresar(150);
		m3.gastar(300);

		System.out.println("");

		m1.mostrarInfo();
		m2.mostrarInfo();
		m3.mostrarInfo();
		
		System.out.println("");


		Monedero.transferencia(m2, m3, 25);
		m2.mostrarInfo();
		m3.mostrarInfo();

	}

}
