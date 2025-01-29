package wallapop;

import wallapop.enumerados.TipoProducto;

public class Producto {

	private static int codProducto;
	private String nombre;
	private double precio;
	private TipoProducto estado;
	private int contador = 1;

	public Producto(String nombre, double precio, TipoProducto estado) {
		this.codProducto = contador++;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estado;

	}

	public static int getCodProducto() {
		return codProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return this.estado.toString();
	}

	public void setEstado(String estado) {
		this.estado = TipoProducto.valueOf(estado);
	}

}
