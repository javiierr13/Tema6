package diapositiva53;

public class RadioFM {

	private double frecuencia;

	public RadioFM(double frecuenciaInicial) {
		if (frecuenciaInicial < 80) {
			frecuencia = 80;
		} else if (frecuenciaInicial > 108) {
			frecuencia = 108;
		} else {
			frecuencia = frecuenciaInicial;
		}
	}

	public RadioFM() {
		this(80);
	}

	public double down() {
		frecuencia -= 0.5;
		comprobarRango();

		return (frecuencia);
	}

	public double up() {
		frecuencia += 0.5;
		comprobarRango();

		return (frecuencia);
	}

	public void display() {
		System.out.println("Sintonizando: " + frecuencia + " MHz");
	}

	private void comprobarRango() {
		if (frecuencia < 80) {
			frecuencia = 108;
		} else if (frecuencia > 108) {
			frecuencia = 80;
		}
	}
}
