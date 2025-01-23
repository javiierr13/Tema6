package act1Boletin;

public class Main {

	public static void main(String[] args) {

		Tarea t1 = new Tarea(5);
		Tarea t2 = new Tarea(26);
		Tarea t3 = new Tarea(1);

		Persona p1 = new Persona("Pepe", "Madroñal", 123);
		Persona p2 = new Persona("Lola", "Sanchez", 456);

		t1.mostrarInfo();
		t2.mostrarInfo();
		t3.mostrarInfo();
		
		

		t1.resolver(p1, "No tenia nada");
		t3.resolver(p2, "Formateado");
		
		

		t1.mostrarInfo();
		t2.mostrarInfo();
		t3.mostrarInfo();
	}
}

