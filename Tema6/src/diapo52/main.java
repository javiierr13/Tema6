package diapo52;

public class main {

	public static void main(String[] args) {

		Pizza p1 = new Pizza("MEDIANA", "MARGARITA");
		Pizza p2 = new Pizza("FAMILIAR", "PEPA");
		Pizza p3 = new Pizza("FAMILIAR", "CUATROQUESOS");
		
		p1.servir();

		System.out.println(Pizza.getPedidas());
		System.out.println(Pizza.getServidas());

	}

}
