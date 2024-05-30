public class ArticuloCientifico {
    // Atributos
    private String titulo;
    private int doi;
    private String editor;
    private String fechaPublicacion;
    private int periodicidad;
    private int numeroVolumen;
    private String campoInteres;
    private int estado;

    // Constructor
    public ArticuloCientifico(String titulo, int doi, String editor, String fechaPublicacion, int periodicidad, int numeroVolumen, String campoInteres, int estado) {
        this.titulo = titulo;
        this.doi = doi;
        this.editor = editor;
        this.fechaPublicacion = fechaPublicacion;
        this.periodicidad = periodicidad;
        this.numeroVolumen = numeroVolumen;
        this.campoInteres = campoInteres;
        this.estado = estado;
    }

    // Métodos getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDoi() {
        return doi;
    }

    public void setDoi(int doi) {
        this.doi = doi;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }

    public int getNumeroVolumen() {
        return numeroVolumen;
    }

    public void setNumeroVolumen(int numeroVolumen) {
        this.numeroVolumen = numeroVolumen;
    }

    public String getCampoInteres() {
        return campoInteres;
    }

    public void setCampoInteres(String campoInteres) {
        this.campoInteres = campoInteres;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
