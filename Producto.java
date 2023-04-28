package version2;

import java.math.BigDecimal;

public class Producto {
    private String codigo;
    private String sku;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;

    public Producto(String codigo, String sku, String nombre, String descripcion, BigDecimal precio) {
        this.codigo = codigo;
        this.sku = sku;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " (" + sku + ")";
    }
}
