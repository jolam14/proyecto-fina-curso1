package proyectofinal;

public abstract class Descuento {
    private double montoDescuento;
    protected boolean esPorcentaje;
    private boolean esFijo;

    public Descuento(double montoDescuento, boolean esPorcentaje, boolean esFijo) {
        this.montoDescuento = montoDescuento;
        this.esPorcentaje = esPorcentaje;
        this.esFijo = esFijo;
  
	}

	public double getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(double montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public boolean isEsPorcentaje() {
        return esPorcentaje;
    }

    public void setEsPorcentaje(boolean esPorcentaje) {
        this.esPorcentaje = esPorcentaje;
    }

    public boolean isEsFijo() {
        return esFijo;
    }

    public void setEsFijo(boolean esFijo) {
        this.esFijo = esFijo;
    }

    public abstract double calcularDescuento(double precioTotal);
}
