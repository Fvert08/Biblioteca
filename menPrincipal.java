import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menPrincipal extends JFrame {
    private JPanel panel;

    public menPrincipal() {
        setTitle("Ejemplo Multiples Botones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Crea label cabecera Menú
        JLabel labelMenú =  new JLabel("Menú", SwingConstants.CENTER);
        labelMenú.setFont(new Font("Arial", Font.PLAIN, 20));

        // Crear los botones
        JButton buttonRegistrar = new JButton("Registrar");
        JButton buttonBuscar = new JButton("Buscar");
        JButton buttonModificarHabilitar = new JButton("Modificar / Habilitar");
        JButton buttonEliminarDeshabilitar = new JButton("Eliminar / Deshabilitar");
        JButton buttonSalir = new JButton("Salir");

        // Añadir label
        panel.add(labelMenú);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

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
        labelMenú.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonRegistrar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonBuscar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonModificarHabilitar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonEliminarDeshabilitar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonSalir.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Crear un ActionListener para todos los botones
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source instanceof JButton) {
                    JButton button = (JButton) source;
                    String buttonText = button.getText();
                    // Usar switch para manejar diferentes botones
                    switch (buttonText) {
                        case "Registrar":
                            mostrarPantallaRegistro();
                            break;
                        case "Buscar":
                            System.out.println("Buscar");
                            break;
                        case "Modificar / Habilitar":
                            System.out.println("Modificar / Habilitar");
                            break;
                        case "Eliminar / Deshabilitar":
                            System.out.println("Eliminar / Deshabilitar");
                            break;
                        case "Salir":
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Botón no reconocido");
                            break;
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

        getContentPane().add(panel);
        setVisible(true);
    }

    private void mostrarPantallaRegistro() {
        // Limpiar el panel
        panel.removeAll();

        // Crear y añadir el nuevo label al panel
        JLabel label = new JLabel("Pantalla registros", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.setLayout(new BorderLayout()); // Cambiar layout para centrar el label
        panel.add(label, BorderLayout.CENTER);

        // Refrescar el panel para mostrar los cambios
        panel.revalidate();
        panel.repaint();
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> new menPrincipal());
    }
}
