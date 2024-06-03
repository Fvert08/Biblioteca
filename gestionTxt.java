import java.io.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class gestionTxt {
    public static <Clase> void escribirObjeto(Clase objeto, String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(objeto.toString() + "\n");
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
        String[] columnNames;
        switch (archivo) {
            case "Lectores.txt":
                columnNames = new String[]{"ID", "Nombre", "Telefono", "Direccion", "Estado", "Libros prestados"};
                break;
            case "Libros.txt":
                columnNames = new String[]{"ID", "Genero", "Titulo", "Edicion", "Año publicación", "Editorial", "Autor", "Estado", "Idioma", "Copias", "Categoria"};
                break;
            case "Tesis.txt":
                columnNames = new String[]{"ID", "Nombre autor", "Institución academica", "Fecha investigación", "Fecha presentación", "Campo estudio", "Estado", "Páginas"};
                break;
            case "Articulos.txt":
                columnNames = new String[]{"DOI", "Titulo", "Editor", "Fecha publicación", "Periodicidad", "Numero volumen", "Campo interés", "Estado"};
                break;
            case "Categorias.txt":
                columnNames = new String[]{"ID", "Nombre", "Descripción", "idcategoríaPrincipal"};
                break;
            case "Autores.txt":
                columnNames = new String[]{"Nombre", "Nacionalidad", "Fecha nacimiento", "Libros asociados"};
                break;
            case "Copias.txt":
                columnNames = new String[]{"ID", "Estado", "IDOrigen", "Tipo"};
                break;
            case "Prestamos.txt":
                columnNames = new String[]{"ID", "Tipo", "IDLibro", "IDLector", "Dias prestamo", "Fecha prestamo", "fechaEntrega"};
                break;
            case "Multas.txt":
                columnNames = new String[]{"ID", "ID prestamo", "Dia retraso", "Fecha entrega", "estado"};
                break;
            // Agrega más casos según sea necesario
            default:
                columnNames = new String[0]; // Columnas vacías si no se encuentra un caso coincidente
                break;
        }    
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
