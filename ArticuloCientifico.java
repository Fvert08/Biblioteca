public class ArticuloCientifico {
    // Atributos
    private String titulo;
    private int doi;
    private String editor;
    private String fechaPublicacion;
    private String  periodicidad;
    private int numeroVolumen;
    private String campoInteres;
    private String estado;

    // Constructor
    public ArticuloCientifico(String titulo, int doi, String editor, String fechaPublicacion, String periodicidad, int numeroVolumen, String campoInteres, String estado) {
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

    public String  getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String  periodicidad) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }    
    // Método toString
    @Override
    public String toString() {
        return titulo + "," + doi + "," + editor + "," + fechaPublicacion + "," +  periodicidad + "," + numeroVolumen + "," + campoInteres + "," + estado;
    }
}
