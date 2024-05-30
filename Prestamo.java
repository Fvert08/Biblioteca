import java.time.LocalDate;

public class Prestamo {
    // Atributos
    private int id;
    private int idLibro;
    private int idLector;
    private int diasPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;

    // Constructor
    public Prestamo(int id, int idLibro, int idLector, int diasPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega) {
        this.id = id;
        this.idLibro = idLibro;
        this.idLector = idLector;
        this.diasPrestamo = diasPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdLector() {
        return idLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
