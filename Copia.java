public class Copia {
    // Atributos
<<<<<<< HEAD
    private int id;
=======
    private String id;
>>>>>>> bfa1e60993a4909af22605bbecfdd4bd8d434af5
    private String estado;
    private String idOrigen;
    private String tipo;

    // Constructor
<<<<<<< HEAD
    public Copia(int id, String estado, String idOrigen, String tipo) {
=======
    public Copia(String id, String estado, String idOrigen, String tipo) {
>>>>>>> bfa1e60993a4909af22605bbecfdd4bd8d434af5
        this.id = id;
        this.estado = estado;
        this.idOrigen = idOrigen;
        this.tipo = tipo;
    }

    // Métodos getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

