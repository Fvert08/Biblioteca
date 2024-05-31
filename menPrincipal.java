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
        setTitle("Menu registros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE; // No llenar horizontalmente, permitir centrado
        gbc.insets = new Insets(5, 5, 5, 5); // Margen entre componentes
        gbc.anchor = GridBagConstraints.CENTER; // Centrar los componentes

        // Título
        JLabel labelTitulo = new JLabel("Registrar", SwingConstants.CENTER);
        labelTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        add(labelTitulo, gbc);

        // Primera etiqueta y botones
        JLabel label1 = new JLabel("Escritos", SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        add(label1, gbc);

        JButton button1_1 = new JButton("Libros");
        JButton button1_2 = new JButton("Tesis");
        JButton button1_3 = new JButton("Articulos");
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        add(button1_1, gbc);
        gbc.gridx = 1;
        add(button1_2, gbc);
        gbc.gridx = 2;
        add(button1_3, gbc);

        // Segunda etiqueta y botones
        JLabel label2 = new JLabel("Copias", SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        add(label2, gbc);

        JButton button2_1 = new JButton("Copia");
        JButton button2_2 = new JButton("Prestamo");
        JButton button2_3 = new JButton("Multa");
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        add(button2_1, gbc);
        gbc.gridx = 1;
        add(button2_2, gbc);
        gbc.gridx = 2;
        add(button2_3, gbc);

        // Tercera etiqueta y botones
        JLabel label3 = new JLabel("Datos", SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        add(label3, gbc);

        JButton button3_1 = new JButton("Autor");
        JButton button3_2 = new JButton("Lector");
        JButton button3_3 = new JButton("Categoria");
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        add(button3_1, gbc);
        gbc.gridx = 1;
        add(button3_2, gbc);
        gbc.gridx = 2;
        add(button3_3, gbc);

        // Botón final
        JButton buttonFinal = new JButton("Volver");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 3;
        add(buttonFinal, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> new menPrincipal());
    }
}
