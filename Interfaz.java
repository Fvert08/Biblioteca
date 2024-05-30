import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Interfaz extends JFrame {
    public Interfaz() {
        // Crear el marco
        setTitle("Ejemplo de JTable");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Definir los nombres de las columnas
        String[] columnNames = {"Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5"};

        // Crear el modelo de la tabla con los nombres de las columnas
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        // Crear la tabla con el modelo de datos
        JTable table = new JTable(tableModel);

        // Añadir algunas filas de ejemplo
        tableModel.addRow(new Object[]{"Dato 1-1", "Dato 1-2", "Dato 1-3", "Dato 1-4", "Dato 1-5"});
        tableModel.addRow(new Object[]{"Dato 2-1", "Dato 2-2", "Dato 2-3", "Dato 2-4", "Dato 2-5"});
        tableModel.addRow(new Object[]{"Dato 3-1", "Dato 3-2", "Dato 3-3", "Dato 3-4", "Dato 3-5"});

        // Crear un JScrollPane y añadir la tabla a él
        JScrollPane scrollPane = new JScrollPane(table);

        // Añadir el JScrollPane al marco
        add(scrollPane, BorderLayout.CENTER);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> new Interfaz());
    }
}
