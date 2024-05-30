public class Copia {
    // Atributos
    private int id;
    private int estado;
    private int idOrigen;
    private int tipo;

    // Constructor
    public Copia(int id, int estado, int idOrigen, int tipo) {
        this.id = id;
        this.estado = estado;
        this.idOrigen = idOrigen;
        this.tipo = tipo;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(int idOrigen) {
        this.idOrigen = idOrigen;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}

