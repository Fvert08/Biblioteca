public class Lector {
    // Atributos
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String estado;
    private int librosPrestados;

    // Constructor
    public Lector(int id, String nombre, String telefono, String direccion, String estado, int librosPrestados) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.librosPrestados = librosPrestados;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    public String toString() {
        return id + "," + nombre + "," + telefono + "," + direccion + "," + estado + "," + librosPrestados;
    }
}
