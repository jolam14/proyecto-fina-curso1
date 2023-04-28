package version2;

import java.math.BigDecimal;

public abstract class Descuento {
    private BigDecimal descripcion;

    public Descuento(BigDecimal porcentaje) {
        this.descripcion = porcentaje;
    }

    public abstract BigDecimal calcularDescuento(BigDecimal precio) throws Exception;

    public BigDecimal getDescripcion() {
        return descripcion;
    }

	public BigDecimal calcularDescuento1(BigDecimal precio) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal calcularDescuento(Carrito precio) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
