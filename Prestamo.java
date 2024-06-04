

public class Prestamo {
    // Atributos
    private int id;
    private String Tipo;
    private String idLibro;
    private String idLector;
    private int diasPrestamo;
    private String fechaPrestamo;
    private String fechaEntrega;

    // Constructor
    public Prestamo(int id, String Tipo, String idLibro, String idLector, int diasPrestamo, String fechaPrestamo, String fechaEntrega) {
        this.id = id;
        this.Tipo=Tipo;
        this.idLibro = idLibro;
        this.idLector = idLector;
        this.diasPrestamo = diasPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
    }

    // Métodos getters y setters
    public String getTipo() {
        return Tipo;
    }

    public void setId(String Tipo) {
        this.Tipo = Tipo;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getIdLector() {
        return idLector;
    }

    public void setIdLector(String idLector) {
        this.idLector = idLector;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public String toString() {
        return id + "," + Tipo + "," + idLibro + "," + idLector + "," + diasPrestamo + "," + fechaPrestamo + "," + fechaEntrega;
    }
}
