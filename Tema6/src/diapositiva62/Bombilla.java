package diapositiva62;

public class Bombilla {

	private boolean estado;

	private static boolean general = false;

	public Bombilla() {
		this.estado = false;
	}

	public void verEstado() {
		if (estado && general) {
			System.out.println("Encendida");
		} else {
			System.out.println("Apagada");
		}
	}

	public void interruptor() {
		if (estado == true) {
			estado = false;
		} else {
			estado = true;
		}
	}

}
