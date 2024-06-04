

public class MenuClases {
        public static void main(String[] args) {
        // Crear un lector
        Lector lector = new Lector(1, "Juan", "123456789", "Calle Principal 123","Normal" , 0);

        // Mostrar información
        System.out.println("Información del lector:");
        System.out.println("ID: " + lector.getId());
        System.out.println("Nombre: " + lector.getNombre());
        System.out.println("Teléfono: " + lector.getTelefono());
        System.out.println("Dirección: " + lector.getDireccion());
        System.out.println("Estado: " + lector.getEstado());
        System.out.println("Libros Prestados: " + lector.getLibrosPrestados());
        



    }
}
