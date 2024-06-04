public class Copia {
    // Atributos
    private int id;
    private String estado;
    private String idOrigen;
    private String tipo;

    // Constructor
    public Copia(int id, String estado, String idOrigen, String tipo) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(String idOrigen) {
        this.idOrigen = idOrigen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    // Método toString
     @Override
    public String toString() {
         return id + "," + estado + "," + idOrigen + "," + tipo;
     }

}

