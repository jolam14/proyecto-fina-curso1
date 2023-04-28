package version2;

import java.math.BigDecimal;
public class DescuentoPorcentajeConTope extends Descuento {
    private BigDecimal tope;

    public DescuentoPorcentajeConTope(BigDecimal porcentaje, BigDecimal tope) {
        super(porcentaje);
        this.tope = tope;
    }

    @Override
    public BigDecimal calcularDescuento1(BigDecimal precio) throws Exception {
        if (precio.compareTo(BigDecimal.ZERO) <= 0) {
            throw new Exception("El precio debe ser mayor a cero");
        }
        BigDecimal descuento = precio.multiply(getDescripcion()).divide(new BigDecimal("100"));
        if (descuento.compareTo(tope) > 0) {
            return tope;
        } else {
            return descuento;
        }
    }
    @Override
    public BigDecimal calcularDescuento(BigDecimal precio) throws Exception {
        BigDecimal descuento = super.calcularDescuento1(precio);
        System.out.println("Descuento aplicado: " + descuento);
        return descuento;
    }

    }

