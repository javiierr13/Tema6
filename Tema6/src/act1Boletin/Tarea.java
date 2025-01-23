package act1Boletin;

import java.time.LocalDate;

public class Tarea {

	private int codigoTarea;
	private int numOrdenador;
	private Estado estado;
	private Persona persona;
	private LocalDate fecha;
	private String info;

	static private int contador = 1;

	public Tarea(int numOrdenador) {
		this.codigoTarea = contador++;
		this.estado = Estado.PENDIENTE;
		setNumOrdenador(numOrdenador);
	}

	public int getCodigoTarea() {
		return codigoTarea;
	}

	public int getNumOrdenador() {
		return numOrdenador;
	}

	public void setNumOrdenador(int numOrdenador) {
		if (this.estado.equals(Estado.RESUELTA)) {
			throw new IllegalArgumentException("NO SE PUEDE");
		}
		this.numOrdenador = numOrdenador;
	}

	public Persona getPersona() {
		return persona;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getEstado() {
		return this.estado.toString();
	}

	public void resolver(Persona persona, String info) {
		this.persona = persona;
		this.fecha = LocalDate.now();
		this.estado = Estado.RESUELTA;
	}

	public void mostrarInfo() {
		System.out.println("Codigo Tarea: " + codigoTarea);
		System.out.println("Numero Ordenador: " + numOrdenador);
		System.out.println("Estado: " + estado);
		System.out.println("Fecha: " + LocalDate.now());
	}

}
