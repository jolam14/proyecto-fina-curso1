package version2;

import java.math.BigDecimal;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public BigDecimal getPrecio() {
        return producto.getPrecio().multiply(new BigDecimal(cantidad));
    }

    @Override
    public String toString() {
        return cantidad + " x " + producto.getNombre() + " (" + producto.getSku() + ")";
    }

	public BigDecimal subtotal() {
		// TODO Auto-generated method stub
		return null;
	}
}
