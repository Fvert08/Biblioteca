import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuPrincipal extends JFrame {
    private JPanel panel;

    public menuPrincipal() {
        // Configurar el JFrame principal
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 260);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        getContentPane().add(panel);

        // Mostrar la pantalla principal
        mostrarMenuPrincipal();

        setVisible(true);
    }

    private void mostrarMenuPrincipal() {
        setTitle("Menu principal");
        // Limpiar el panel y restablecer el layout original
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        setSize(300, 260);

        // Crea label cabecera Menú
        JLabel labelMenú = new JLabel("Menú", SwingConstants.CENTER);
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

        // Actualizar el panel
        panel.revalidate();
        panel.repaint();
    }

    public void mostrarPantallaRegistro() {
        setTitle("Menu registros");
        // Limpiar el panel y establecer un nuevo layout
        panel.removeAll();
        panel.setLayout(new GridBagLayout());
        setSize(330, 310);

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
        panel.add(labelTitulo, gbc);

        // Primera etiqueta y botones
        JLabel label1 = new JLabel("Escritos", SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        panel.add(label1, gbc);

        JButton buttonRegistrarLibro = new JButton("Libros");
        JButton buttonRegistrarTesis = new JButton("Tesis");
        JButton buttonRegistrarArticulo = new JButton("Articulo");
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(buttonRegistrarLibro, gbc);
        gbc.gridx = 1;
        panel.add(buttonRegistrarTesis, gbc);
        gbc.gridx = 2;
        panel.add(buttonRegistrarArticulo, gbc);

        // Segunda etiqueta y botones
        JLabel labelCopias = new JLabel("Copias", SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        panel.add(labelCopias, gbc);

        JButton buttonRegistrarCopia = new JButton("Copia");
        JButton buttonRegistrarPrestamo = new JButton("Prestamo");
        JButton buttonRegistrarMulta = new JButton("Multa");
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(buttonRegistrarCopia, gbc);
        gbc.gridx = 1;
        panel.add(buttonRegistrarPrestamo, gbc);
        gbc.gridx = 2;
        panel.add(buttonRegistrarMulta, gbc);

        // Tercera etiqueta y botones
        JLabel labelDatos = new JLabel("Datos", SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        panel.add(labelDatos, gbc);

        JButton buttonRegistrarAutor = new JButton("Autor");
        JButton buttonRegistrarLector = new JButton("Lector");
        JButton buttonRegistrarCategoria = new JButton("Categoria");
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(buttonRegistrarAutor, gbc);
        gbc.gridx = 1;
        panel.add(buttonRegistrarLector, gbc);
        gbc.gridx = 2;
        panel.add(buttonRegistrarCategoria, gbc);

        // Botón final
        JButton buttonRegistroVolver = new JButton("Volver");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 3;
        panel.add(buttonRegistroVolver, gbc);

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
                        case "Libros":
                            mostrarFormularioRegistroLibros();
                            break;
                        case "Tesis":
                            System.out.println("Registrar tesis");
                            break;
                        case "Articulo":
                            System.out.println("Registrar articulo");
                            break;
                        case "Copia":
                            System.out.println("Registrar copia");
                            break;
                        case "Prestamo":
                            System.out.println("Registrar prestamo");
                            break;
                        case "Multa":
                            System.out.println("Registrar multa");
                            break;
                        case "Autor":
                            System.out.println("Registrar autor");
                            break;
                        case "Lector":
                            System.out.println("Registrar lector");
                            break;
                        case "Categoria":
                            mostrarFormularioCategoria();
                            break;
                        case "Volver":
                            mostrarMenuPrincipal();
                            break;
                        default:
                            System.out.println("Botón no reconocido");
                            break;
                    }
                }
            }
        };

        // Añadir el ActionListener a los botones de escritos
        buttonRegistrarLibro.addActionListener(listener);
        buttonRegistrarTesis.addActionListener(listener);
        buttonRegistrarArticulo.addActionListener(listener);

        // Añadir el ActionListener a los botones de copias
        buttonRegistrarCopia.addActionListener(listener);
        buttonRegistrarPrestamo.addActionListener(listener);
        buttonRegistrarMulta.addActionListener(listener);

        // Añadir el ActionListener a los botones de datos
        buttonRegistrarAutor.addActionListener(listener);
        buttonRegistrarLector.addActionListener(listener);
        buttonRegistrarCategoria.addActionListener(listener);

        // Añadir el ActionListener al botón de volver
        buttonRegistroVolver.addActionListener(listener);

        // Actualizar el panel
        panel.revalidate();
        panel.repaint();
    }
    public void mostrarFormularioRegistroLibros() {
        //Cambiar el nombre de la ventana
        setTitle("Registrar libro");
        //Limpiar el panel y establecer un nuevo layout
        panel.removeAll();
        panel.setLayout(new GridBagLayout());
        setSize(400, 500);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Título
        JLabel labelMenuTitulo = new JLabel("Registrar", SwingConstants.CENTER);
        labelMenuTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(labelMenuTitulo, gbc);

        // Crear etiquetas y campos de texto
        JLabel labelID = new JLabel("ID:");
        JTextField textID = new JTextField(20);
        textID.setEditable(false);  // No editable

        JLabel labelGenero = new JLabel("Genero:");
        JTextField textGenero = new JTextField(20);

        JLabel labelTitulo = new JLabel("Titulo:");
        JTextField textTitulo = new JTextField(20);

        JLabel labelEdicion = new JLabel("Edicion:");
        JTextField textEdicion = new JTextField(20);

        JLabel labelAnioPublicacion = new JLabel("Año Publicación:");
        JTextField textAnioPublicacion = new JTextField(20);

        JLabel labelEditorial = new JLabel("Editorial:");
        JTextField textEditorial = new JTextField(20);

        JLabel labelAutor = new JLabel("Autor:");
        JComboBox<String> comboAutor  = new JComboBox<>(new String[] {"Autor 1", "Autor 2", "Autor 3"});

        JLabel labelEstado = new JLabel("Estado:");
        JTextField textEstado = new JTextField(20);

        JLabel labelIdioma = new JLabel("Idioma:");
        JTextField textIdioma = new JTextField(20);

        JLabel labelCopias = new JLabel("Copias:");
        JTextField textCopias = new JTextField(20);

        JLabel labelCategoria = new JLabel("Categoria:");
        JComboBox<String> comboCategoria = new JComboBox<>(new String[] {"Categoria 1", "Categoria 2", "Categoria 3"});

        // Añadir componentes al panel
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelID, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textID, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelGenero, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(textGenero, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelTitulo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(textTitulo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(labelEdicion, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(textEdicion, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(labelAnioPublicacion, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(textAnioPublicacion, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(labelEditorial, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(textEditorial, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(labelAutor, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(comboAutor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(labelEstado, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        panel.add(textEstado, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(labelIdioma, gbc);

        gbc.gridx = 1;
        gbc.gridy = 9;
        panel.add(textIdioma, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        panel.add(labelCopias, gbc);

        gbc.gridx = 1;
        gbc.gridy = 10;
        panel.add(textCopias, gbc);

        gbc.gridx = 0;
        gbc.gridy = 11;
        panel.add(labelCategoria, gbc);

        gbc.gridx = 1;
        gbc.gridy = 11;
        panel.add(comboCategoria, gbc);

        // Botón para guardar
        JButton buttonGuardar = new JButton("Guardar");
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonGuardar, gbc);

        // Botón para volver
        JButton buttonVolver = new JButton("Volver");
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonVolver, gbc);

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
                        case "Guardar":
                            System.out.println("Guardar datos");
                            break;
                        case "Volver":
                            mostrarPantallaRegistro();
                            break;
                        default:
                            System.out.println("Botón no reconocido");
                            break;
                    }
                }
            }
        };

        // Añadir el ActionListener a los botones
        buttonGuardar.addActionListener(listener);
        buttonVolver.addActionListener(listener);

        // Actualizar el panel
        panel.revalidate();
        panel.repaint();
    }
    public void mostrarFormularioCategoria() {
        //Cambiar el nombre de la ventana
        setTitle("Registrar categoria");
        // Limpiar el panel y establecer un nuevo layout
        panel.removeAll();
        panel.setLayout(new GridBagLayout());
        setSize(400, 300);
    
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
    
        // Título
        JLabel labelMenuTitulo = new JLabel("Registrar Categoría", SwingConstants.CENTER);
        labelMenuTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(labelMenuTitulo, gbc);
    
        // Crear etiquetas y campos de texto
        JLabel labelID = new JLabel("ID:");
        JTextField textID = new JTextField(20);
        textID.setEditable(false);  // No editable
    
        JLabel labelNombre = new JLabel("Nombre:");
        JTextField textNombre = new JTextField(20);
    
        JLabel labelDescripcion = new JLabel("Descripción:");
        JTextField textDescripcion = new JTextField(20);
    
        JLabel labelIDCategoriaPrincipal = new JLabel("Categoría Principal:");
        JComboBox<String> comboCategoriaPrincipal  = new JComboBox<>(new String[] {"Categoria 1", "Categoria 2", "Categoria 3"});
    
        // Añadir componentes al panel
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelID, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textID, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelNombre, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(textNombre, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelDescripcion, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(textDescripcion, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(labelIDCategoriaPrincipal, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(comboCategoriaPrincipal, gbc);
    
        // Botón para guardar
        JButton buttonGuardar = new JButton("Guardar");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonGuardar, gbc);
    
        // Botón para volver
        JButton buttonVolver = new JButton("Volver");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonVolver, gbc);
    
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
                        case "Guardar":
                            System.out.println("Guardar datos");
                            break;
                        case "Volver":
                            mostrarPantallaRegistro();
                            break;
                        default:
                            System.out.println("Botón no reconocido");
                            break;
                    }
                }
            }
        };
    
        // Añadir el ActionListener a los botones
        buttonGuardar.addActionListener(listener);
        buttonVolver.addActionListener(listener);
    
        // Actualizar el panel
        panel.revalidate();
        panel.repaint();
    }
    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> new menuPrincipal());
    }
}
