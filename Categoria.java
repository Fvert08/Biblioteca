public class Categoria {
    // Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private int idCategoriaPrincipal;

    // Constructor
    public Categoria(int id, String nombre, String descripcion, int idCategoriaPrincipal) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idCategoriaPrincipal = idCategoriaPrincipal;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdCategoriaPrincipal() {
        return idCategoriaPrincipal;
    }

    public void setIdCategoriaPrincipal(int idCategoriaPrincipal) {
        this.idCategoriaPrincipal = idCategoriaPrincipal;
    }
}