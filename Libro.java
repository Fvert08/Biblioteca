import java.util.List;

public class Libro {
    // Atributos
    private int id;
    private String genero;
    private String titulo;
    private int edicion;
    private int anoPublicacion;
    private String editorial;
    private String autor;
    private int estado;
    private List<String> idioma;
    private int copias;
    private int categoria;

    // Constructor
    public Libro(int id, String genero, String titulo, int edicion, int anoPublicacion, String editorial, String autor, int estado, List<String> idioma, int copias, int categoria) {
        this.id = id;
        this.genero = genero;
        this.titulo = titulo;
        this.edicion = edicion;
        this.anoPublicacion = anoPublicacion;
        this.editorial = editorial;
        this.autor = autor;
        this.estado = estado;
        this.idioma = idioma;
        this.copias = copias;
        this.categoria = categoria;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

}
