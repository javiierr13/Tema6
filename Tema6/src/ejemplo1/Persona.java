package ejemplo1;

public class Persona {

	String nombre;
	int edad;
	double estatura;

	void saludar() {
		System.out.println("Hola, me llamo " + nombre);
	}

	void cumplirAnios() {
		edad++;
	}

	//crecer va a estar sobrecagado
	void crecer() {
		estatura++;
	}

	void crecer(double incremento) {
		estatura += incremento;
	}

}
