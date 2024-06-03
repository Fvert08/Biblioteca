import java.util.List;

public class Tesis {
    // Atributos

    private String nombreAutores;
    private String institucionAcademica;
    private String fechaInvestigacion;
    private String fechaPresentacion;
    private String campoEstudio;
    private String  estado;
    private int paginas;

    // Constructor
    public Tesis(String nombreAutores, String institucionAcademica, String fechaInvestigacion, String fechaPresentacion, String campoEstudio, String  estado, int paginas) {
        this.nombreAutores = nombreAutores;
        this.institucionAcademica = institucionAcademica;
        this.fechaInvestigacion = fechaInvestigacion;
        this.fechaPresentacion = fechaPresentacion;
        this.campoEstudio = campoEstudio;
        this.estado = estado;
        this.paginas = paginas;
    }

    // Métodos getters y setters
    public String getNombreAutores() {
        return nombreAutores;
    }

    public void setNombreAutores(String nombreAutores) {
        this.nombreAutores = nombreAutores;
    }

    public String getInstitucionAcademica() {
        return institucionAcademica;
    }

    public void setInstitucionAcademica(String institucionAcademica) {
        this.institucionAcademica = institucionAcademica;
    }

    public String getFechaInvestigacion() {
        return fechaInvestigacion;
    }

    public void setFechaInvestigacion(String fechaInvestigacion) {
        this.fechaInvestigacion = fechaInvestigacion;
    }

    public String getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(String fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public String getCampoEstudio() {
        return campoEstudio;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.campoEstudio = campoEstudio;
    }

    public String  getEstado() {
        return estado;
    }

    public void setEstado(String  estado) {
        this.estado = estado;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String toString() {
        return nombreAutores + "," + institucionAcademica + "," + fechaInvestigacion + "," + fechaInvestigacion + "," + fechaPresentacion + ","+ campoEstudio + "," + estado + "," + paginas;
    }
}
