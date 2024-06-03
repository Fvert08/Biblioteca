public class Libro {
    // Atributos
    private int id;
    private String titulo;
    private String edicion;
    private String anoPublicacion;
    private String editorial;
    private String autor;
    private String estado;
    private String idioma;
    private int copias;
    private String categoria;

    // Constructor
    public Libro(int id,String titulo, String edicion, String anoPublicacion, String editorial, String autor, String estado, String idioma, int copias, String categoria) {
        this.id = id;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(String anoPublicacion) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return id + "," + titulo + "," + edicion + "," + anoPublicacion + "," + 
               editorial + "," + autor + "," + estado + "," + idioma + "," + copias + "," + categoria;
    }
}
