package proyectofinal;

public class DescuentoPorcentajeConTope extends Descuento {

    private double tope;

    public DescuentoPorcentajeConTope(double montoDescuento, boolean esPorcentaje, double tope) {
        super(montoDescuento, esPorcentaje, false);
        this.tope = tope;
    }

    public double calcularDescuento(double precioTotal) {
        double descuento = 0;
        if (esPorcentaje) {
            descuento = precioTotal * calcularDescuento(0) / 100;
        } else {
            descuento = getMontoDescuento();
        }
        if (descuento > tope) {
            descuento = tope;
        }
        return descuento;
    }

}