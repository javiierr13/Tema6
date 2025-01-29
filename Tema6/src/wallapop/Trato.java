package wallapop;

import java.util.List;

public class Trato {

	private Comprador comprador;
	private Vendedor vendedor;
	private Producto producto;
	private List<Producto> disponibles;

	public Trato(Comprador comprador, Vendedor vendedor, Producto producto) {
		if (comprador.getDineroDisponible() < producto.getPrecio()) {
			throw new IllegalArgumentException("El comprador no tiene dinero suficiente");
		}

		for (Producto p : vendedor.getVenta()) {
			if (p.getCodProducto() == producto.getCodProducto()) {
				this.producto = producto;
			}
		}

		this.comprador = comprador;
		this.vendedor = vendedor;

	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
