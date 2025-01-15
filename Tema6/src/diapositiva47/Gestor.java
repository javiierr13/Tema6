package diapositiva47;

public class Gestor {

	// Atributos
	private String nombre;
	private String telefono;
	private double importeMaximo;

	// Constructores
	public Gestor(String nombre, String telefono) {
		setNombre(nombre);
		this.telefono = telefono;
		this.importeMaximo = 10000.0;
	}

	public Gestor(String nombre, String telefono, double importeMaximo) {
		setNombre(nombre);
		this.telefono = telefono;
		this.importeMaximo = importeMaximo;
	}

	// Get(leer) y Set(modificar)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede ser nulo, vacío o en blanco. ");
		}
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public double getImporteMaximo() {
		return importeMaximo;
	}

	public void setImporteMaximo(double importeMaximo) {
		if (this.importeMaximo < 100.0) {
			throw new IllegalArgumentException("El minimo debe ser de 100€. ");
		}
		this.importeMaximo = importeMaximo;
	}

}
