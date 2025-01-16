package diapo52;

public class Pizza {

	// atributos
	private TamanoPizza tamano;
	private TipoPizza tipo;
	private EstadoPizza estado;

	// atributos estaticos
	private static int pedidas = 0;
	private static int servidas = 0;

	// constructores
	public Pizza(String tamano, String tipo) {
		setTamano(tamano);
		setTipo(tipo);
		this.estado = EstadoPizza.PEDIDA;
		pedidas++;
	}

	// getters y setters
	public String getTamano() {
		return this.tamano.toString();
	}

	public void setTamano(String tamano) {
		this.tamano = TamanoPizza.valueOf(tamano);
	}

	public String getTipo() {
		return this.tipo.toString();
	}

	public void setTipo(String tipo) {
		this.tipo = TipoPizza.valueOf(tipo);
	}

	public String getEstado() {
		return this.estado.toString();
	}

//esto lo comentamos ya que al pedir la pizza automaticamente se pone solo en pedida
//	public void setEstado(String estado) {
//		this.estado = EstadoPizza.valueOf(estado);
//	}

	// getters y setters estaticos
	public static int getPedidas() {
		return pedidas;
	}

	public static int getServidas() {
		return servidas;
	}

	// metodos
	public void servir() {
		if (this.estado.equals(EstadoPizza.SERVIDA)) {
			throw new IllegalArgumentException("La pizza ya estaba servida ");
		}
		this.estado = EstadoPizza.SERVIDA;
		servidas++;
	}

}
