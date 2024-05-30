import javax.swing.*;
import java.awt.*;

public class menPrincipal extends JFrame {
    public menPrincipal() {
        // Configurar el marco
        setTitle("Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear un panel con BoxLayout para disponer los botones verticalmente
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // Crear label menú sobre los botones
        JLabel label = new JLabel("Menú");
        Font fuente = new Font("Arial", Font.PLAIN, 20);
        label.setFont(fuente);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        // Crear y añadir los botones al panel
            //Boton Registrar
        JButton buttonRegistrar = new JButton("Registrar");
        buttonRegistrar.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar 
        panel.add(buttonRegistrar);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Añadir un espacio entre los botones
        // Añadir el panel al marco
        add(panel);
        
        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> new menPrincipal());
    }
}
