import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
                columnNames = new String[]{"ID", "Titulo", "Edición", "Año publicación", "Editorial", "Autor", "Estado", "Idioma", "Categoria"};
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
    public static int contarRegistros(String archivo) {
        // Contador para el número de registros
        int contador = 0;
        // Lista para almacenar los números de registros presentes
        List<Integer> numerosRegistros = new ArrayList<>();
        
        // Leer el archivo y contar los registros
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contador++;
                String[] partes = linea.split(",");
                if (partes.length > 0) {
                    try {
                        int numeroRegistro = Integer.parseInt(partes[0].trim());
                        numerosRegistros.add(numeroRegistro);
                    } catch (NumberFormatException e) {
                        // Ignorar líneas que no comiencen con un número válido
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Verificar si el siguiente número está presente en los registros
        int siguienteNumero = contador + 1;
        while (numerosRegistros.contains(siguienteNumero)) {
            siguienteNumero++;
        }
        
        // Devolver el siguiente número disponible
        return siguienteNumero;
    }
    public static void cargarListaDesdeArchivo(JComboBox<String> comboBox, String nombreArchivo, int posicion) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length > posicion) {
                    String nombreAutor = partes[posicion];
                    comboBox.addItem(nombreAutor);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Método para manejar el registro del archivo basado en el índice de la fila
    public static void cargarListaDesdeArchivoCopias(JComboBox<String> comboBox, String nombreArchivo, int posicion) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Copias.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length > posicion) {
                    
                    String nombreAutor = partes[posicion];
                    if (nombreArchivo.equals( partes[3])) {
                        comboBox.addItem(nombreAutor);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void manejarRegistro(JTable tabla, String archivo, int indiceAEliminar) {
        boolean esLibrosOLectores = archivo.equals("Libros.txt") || archivo.equals("Lectores.txt");
    
        // Leer el contenido del archivo y almacenarlo en una lista
        List<String> registros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int currentIndex = 0;
            while ((linea = reader.readLine()) != null) {
                if (esLibrosOLectores && currentIndex == indiceAEliminar) {
                    String[] partes = linea.split(",");
                    for (int i = 0; i < partes.length; i++) {
                        if ("Habilitado".equals(partes[i])) {
                            partes[i] = "Inhabilitado";
                            linea = String.join(",", partes);
                            break;
                        }
                    }
                    registros.add(linea);
                } else if (!esLibrosOLectores && currentIndex != indiceAEliminar) {
                    registros.add(linea);
                } else if (esLibrosOLectores) {
                    registros.add(linea);
                }
                currentIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        // Escribir el contenido actualizado de nuevo en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (String registro : registros) {
                writer.write(registro);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        // Si es "Libros.txt" o "Lectores.txt", actualizar la tabla para reflejar el cambio de estado
        if (esLibrosOLectores) {
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            int estadoColumnIndex = model.findColumn("Estado");
            model.setValueAt("Inhabilitado", indiceAEliminar, estadoColumnIndex);
        } else {
            // Eliminar la fila de la tabla
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.removeRow(indiceAEliminar);
        }
    }
   
    public static void editarRegistro(int indiceTabla, JTable tabla, String archivo) {
        // Leer el contenido del archivo y almacenarlo en una lista
        List<String> registros = new ArrayList<>();
        boolean registroCambiado = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int currentIndex = 0;
            while ((linea = reader.readLine()) != null) {
                if (currentIndex == indiceTabla) {
                    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                    int columnCount = model.getColumnCount();
                    StringBuilder registroNuevo = new StringBuilder();
                    for (int i = 0; i < columnCount; i++) {
                        Object valor = model.getValueAt(indiceTabla, i);
                        registroNuevo.append(valor);
                        if (i < columnCount - 1) {
                            registroNuevo.append(",");
                        }
                        // Verificar si el registro ha cambiado
                        if (!valor.equals(linea.split(",")[i])) {
                            registroCambiado = true;
                        }
                    }
                    linea = registroNuevo.toString();
                    // Actualizar valores en la tabla
                    String[] partes = linea.split(",");
                    for (int i = 0; i < columnCount; i++) {
                        model.setValueAt(partes[i], indiceTabla, i);
                    }
                }
                registros.add(linea);
                currentIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        // Si no se cambió ningún registro, establecer el estado en "Habilitado"
        if (!registroCambiado) {
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            int estadoColumnIndex = model.findColumn("Estado");
            model.setValueAt("Habilitado", indiceTabla, estadoColumnIndex);
            // Actualizar el registro en la lista de registros
            String[] partes = registros.get(indiceTabla).split(",");
            partes[estadoColumnIndex] = "Habilitado";
            registros.set(indiceTabla, String.join(",", partes));
        }
    
        // Escribir el contenido actualizado de nuevo en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (String registro : registros) {
                writer.write(registro);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   
 
}
