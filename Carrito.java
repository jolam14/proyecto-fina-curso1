package proyectofinal;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    public List<ItemCarrito> items;
    public double subtotal;
    public double descuento;
    public double total;

    public Carrito() {
        this.items = new ArrayList<ItemCarrito>();
        this.subtotal = 0;
        this.descuento = 0;
        this.total = 0;
    }

    public void agregarItem(ItemCarrito item) {
        this.items.add(item);
        this.actualizarTotales();
    }

    public void eliminarItem(int indice) {
        this.items.remove(indice);
        this.actualizarTotales();
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }

    private void actualizarTotales() {
        this.subtotal = 0;
        for (ItemCarrito item : items) {
            this.subtotal += item.getSubtotal();
        }
        this.descuento = this.subtotal >= 100 ? 0.1 * this.subtotal : 0;
        this.total = this.subtotal - this.descuento;
    }
}