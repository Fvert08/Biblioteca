import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menPrincipal extends JFrame {
    public menPrincipal() {
        JFrame frame = new JFrame("Ejemplo Multiples Botones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // Crea label cabecera Menú
        JLabel labelMenú =  new JLabel("Menú");
        // Crear los botones
        JButton buttonRegistrar = new JButton("Registrar");
        JButton buttonBuscar = new JButton("Buscar");
        JButton buttonModificarHabilitar = new JButton("Modificar / Habilitar");
        JButton buttonEliminarDeshabilitar = new JButton("Eliminar / Deshabilitar");
        JButton buttonSalir = new JButton("Salir");
        //Añadir label
        panel.add(labelMenú);
        panel.add (Box.createRigidArea(new Dimension(0, 10)));
        // Añadir los botones al panel
        panel.add(buttonRegistrar);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(buttonBuscar);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(buttonModificarHabilitar);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(buttonEliminarDeshabilitar);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(buttonSalir);
        // Centrar los botones y label
        buttonRegistrar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonBuscar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonModificarHabilitar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonEliminarDeshabilitar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelMenú.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Centrar label y dar formato
        Font fuenteMenu = new Font ("Arial", Font.PLAIN,20);
        labelMenú.setFont(fuenteMenu);
        // Crear un ActionListener para todos los botones
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source instanceof JButton) {
                    JButton button = (JButton) source;
                    String buttonText = button.getText();
                    if ("Salir".equals(buttonText)) {
                        System.exit(0); // Cerrar el programa
                    } else {
                        System.out.println(buttonText);
                    }
                }
            }
        };

        // Añadir el ActionListener a todos los botones
        buttonRegistrar.addActionListener(listener);
        buttonBuscar.addActionListener(listener);
        buttonModificarHabilitar.addActionListener(listener);
        buttonEliminarDeshabilitar.addActionListener(listener);
        buttonSalir.addActionListener(listener);

        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> new menPrincipal());
    }
}
