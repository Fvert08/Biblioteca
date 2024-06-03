import java.io.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class gestionTxt {
    public static void escribirLector(Lector lector, String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(lector.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String leerLectores(String archivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea); // Agregar la línea al contenido acumulado
                contenido.append("\n"); // Agregar un salto de línea entre cada línea
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenido.toString(); // Devolver el contenido acumulado como una sola cadena
    }
    public static void llenarTabla(JTable tabla, String archivo) {
        // Crear el modelo de tabla
        DefaultTableModel modelo = new DefaultTableModel();
    
        // Definir los nombres de las columnas directamente dentro del método
        String[] columnNames = {"ID", "Nombre", "Telefono", "Direccion", "Estado", "Libros prestados"};
        modelo.setColumnIdentifiers(columnNames);
    
        // Leer los datos del archivo y agregarlos al modelo de tabla
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Dividir la línea en partes separadas por comas (u otro delimitador, según tu archivo)
                String[] partes = linea.split(","); // Cambia la coma por el delimitador de tu archivo si es necesario
    
                // Agregar las partes como una fila en el modelo de tabla
                modelo.addRow(partes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        // Asignar el modelo de tabla a la tabla
        tabla.setModel(modelo);
    }
}
