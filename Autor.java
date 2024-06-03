public class Autor {
    // Atributos
    private String nombre;
    private String nacionalidad;
    private String fechaNacimiento;
    private int librosAsociados;

    // Constructor
    public Autor(String nombre, String nacionalidad, String fechaNacimiento, int librosAsociados) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.librosAsociados = librosAsociados;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getLibrosAsociados() {
        return librosAsociados;
    }

    public void setLibrosAsociados(int librosAsociados) {
        this.librosAsociados = librosAsociados;
    }
    public String toString() {
        return nombre + "," + nacionalidad + "," + fechaNacimiento + "," + librosAsociados;
    }
}
