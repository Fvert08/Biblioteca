public class Multa {
    // Atributos
    private int id;
    private int idPrestamo;
    private int diaRetraso;
    private String fechaEntrega;
    private String estado;

    // Constructor
    public Multa(int id, int idPrestamo, int diaRetraso, String fechaEntrega, String estado) {
        this.id = id;
        this.idPrestamo = idPrestamo;
        this.diaRetraso = diaRetraso;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getDiaRetraso() {
        return diaRetraso;
    }

    public void setDiaRetraso(int diaRetraso) {
        this.diaRetraso = diaRetraso;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return id + "," + idPrestamo + "," + diaRetraso + "," + fechaEntrega + "," + estado;
    }
}
