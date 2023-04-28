package version2;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private int vecesComprado;

    public Cliente(String nombre, String apellido, String direccion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.vecesComprado = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public int getVecesComprado() {
        return vecesComprado;
    }

    public void comprar() {
        vecesComprado++;
    }
}
