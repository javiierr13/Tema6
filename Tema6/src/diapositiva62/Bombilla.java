package diapositiva62;

public class Bombilla {

	private boolean estado;

	static boolean interruptorGeneral = false;

	public Bombilla() {
		this.estado = false;
	}

	public void verEstado() {
		if (estado && interruptorGeneral) {
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

	public static void interruptorGeneral() {
		if (Bombilla.interruptorGeneral == false) {
			Bombilla.interruptorGeneral = true;
		} else {
			Bombilla.interruptorGeneral = false;
		}
	}

}
