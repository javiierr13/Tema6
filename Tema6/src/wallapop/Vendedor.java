package wallapop;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

	private String nombre;
	private List<Producto> venta;
	private List<Producto> vendidos;

	public Vendedor(String nombre) {
		this.nombre = nombre;
		this.venta = new ArrayList<Producto>();
		this.vendidos = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getVenta() {
		return venta;
	}

	public void setVenta(List<Producto> venta) {
		this.venta = venta;
	}

	public List<Producto> getVendidos() {
		return vendidos;
	}

	public void setVendidos(List<Producto> vendidos) {
		this.vendidos = vendidos;
	}

	// METODOS LISTA VENTA
	public void addProductoVenta(Producto pVenta) {
		if (pVenta == null) {
			throw new IllegalArgumentException("El Producto no puede ser null. ");
		}

		for (Producto prod : this.venta) {
			if (pVenta.getCodProducto() == prod.getCodProducto()) {
				throw new IllegalArgumentException("El producto ya esta añadido");
			}

		}
		this.venta.add(pVenta);

	}

	public void removeProductoVenta(int i) {

		if (i < 0 || i >= this.venta.size()) {
			throw new IllegalArgumentException("No hay prducto en la posición indicada. ");
		}
		this.venta.remove(i);
	}

	public void removeProductoVenta(Producto pVenta) {
		if (pVenta == null) {
			throw new IllegalArgumentException("El Producto no puede ser null. ");
		}
		boolean esta = false;
		for (Producto prod : this.venta) {
			if (prod.getCodProducto() == pVenta.getCodProducto()) {
				esta = true;
			}
		}
		if (!esta) {
			throw new IllegalArgumentException("El producto no está en la lista. ");

		}
		this.venta.remove(pVenta);
	}

	// METODOS LISTA VENDIDOS
	public void addProductoVendidos(Producto pVendidos) {
		if (pVendidos == null) {
			throw new IllegalArgumentException("El Producto no puede ser null. ");
		}

		for (Producto prod : this.vendidos) {
			if (pVendidos.getCodProducto() == prod.getCodProducto()) {
				throw new IllegalArgumentException("El producto ya esta añadido");
			}

		}
		this.vendidos.add(pVendidos);

	}

	public void removeProductoVendidos(int i) {

		if (i < 0 || i >= this.vendidos.size()) {
			throw new IllegalArgumentException("No hay prducto en la posición indicada. ");
		}
		this.vendidos.remove(i);
	}

	public void removeProductoVendidos(Producto pVendidos) {
		if (pVendidos == null) {
			throw new IllegalArgumentException("El Producto no puede ser null. ");
		}
		boolean esta = false;
		for (Producto prod : this.vendidos) {
			if (prod.getCodProducto() == pVendidos.getCodProducto()) {
				esta = true;
			}
		}
		if (!esta) {
			throw new IllegalArgumentException("El producto no está en la lista. ");

		}
		this.vendidos.remove(pVendidos);
	}

}
