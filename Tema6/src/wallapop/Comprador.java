package wallapop;

import java.util.ArrayList;
import java.util.List;

public class Comprador {

	private String nombre;
	private List<Producto> comprados;
	private double dineroDisponible;

	public Comprador(String nombre) {
		this.nombre = nombre;
		this.dineroDisponible = 0.0;
		this.comprados = new ArrayList<Producto>();

	}

	public Comprador(String nombre, double dineroDisponible) {
		setNombre(nombre);
		this.dineroDisponible = dineroDisponible;
		this.comprados = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getComprados() {
		return comprados;
	}

	public void setComprados(List<Producto> comprados) {
		this.comprados = comprados;
	}

	public double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	public void addProducto(Producto p) {
		if (p == null) {
			throw new IllegalArgumentException("El Producto no puede ser null. ");
		}

		for (Producto prod : this.comprados) {
			if (p.getCodProducto() == prod.getCodProducto()) {
				throw new IllegalArgumentException("El producto ya esta añadido");
			}

		}
		this.comprados.add(p);

	}

	public void removeProducto(int i) {

		if (i < 0 || i >= this.comprados.size()) {
			throw new IllegalArgumentException("No hay prducto en la posición indicada. ");
		}
		this.comprados.remove(i);
	}

	public void removeProducto(Producto p) {
		if (p == null) {
			throw new IllegalArgumentException("El Producto no puede ser null. ");
		}
		boolean esta = false;
		for (Producto prod : this.comprados) {
			if (prod.getCodProducto() == p.getCodProducto()) {
				esta = true;
			}
		}
		if (!esta) {
			throw new IllegalArgumentException("El producto no está en la lista. ");

		}
		this.comprados.remove(p);
	}

}
