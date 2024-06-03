import java.time.LocalDate;

public class MenuClases {
        public static void main(String[] args) {
        // Crear un lector
        Lector lector = new Lector(1, "Juan", "123456789", "Calle Principal 123","Normal" , 0);
        
        // Crear un préstamo
        LocalDate fechaPrestamo = LocalDate.now();
        LocalDate fechaEntrega = fechaPrestamo.plusDays(14); // Suponiendo un préstamo de 14 días
        Prestamo prestamo = new Prestamo(1, 1, lector.getId(), 14, fechaPrestamo, fechaEntrega);
        
        // Crear una multa
        LocalDate fechaEntregaReal = LocalDate.now().plusDays(2); // Suponiendo que la entrega real tiene 2 días de retraso
        Multa multa = new Multa(1, prestamo.getId(), 2, fechaEntregaReal.toString(), "Pendiente");

        // Mostrar información
        System.out.println("Información del lector:");
        System.out.println("ID: " + lector.getId());
        System.out.println("Nombre: " + lector.getNombre());
        System.out.println("Teléfono: " + lector.getTelefono());
        System.out.println("Dirección: " + lector.getDireccion());
        System.out.println("Estado: " + lector.getEstado());
        System.out.println("Libros Prestados: " + lector.getLibrosPrestados());
        
        System.out.println("\nInformación del préstamo:");
        System.out.println("ID: " + prestamo.getId());
        System.out.println("ID Libro: " + prestamo.getIdLibro());
        System.out.println("ID Lector: " + prestamo.getIdLector());
        System.out.println("Días de préstamo: " + prestamo.getDiasPrestamo());
        System.out.println("Fecha de préstamo: " + prestamo.getFechaPrestamo());
        System.out.println("Fecha de entrega: " + prestamo.getFechaEntrega());

        System.out.println("\nInformación de la multa:");
        System.out.println("ID: " + multa.getId());
        System.out.println("ID Prestamo: " + multa.getIdPrestamo());
        System.out.println("Días de retraso: " + multa.getDiaRetraso());
        System.out.println("Fecha de entrega: " + multa.getFechaEntrega());
        System.out.println("Estado: " + multa.getEstado());
    }
}
