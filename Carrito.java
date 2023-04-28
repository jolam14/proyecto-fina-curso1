package version2;

import java.math.BigDecimal;

public class Carrito {
    private BigDecimal precio = new BigDecimal("5");

    public Carrito(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal aplicarDescuentos(Descuento... descuentos) throws Exception {
        BigDecimal descuentoTotal = BigDecimal.ZERO;
        for (Descuento descuento : descuentos) {
            descuentoTotal = descuentoTotal.add(descuento.calcularDescuento(precio));
        }
        return precio.subtract(descuentoTotal);
    }
}
