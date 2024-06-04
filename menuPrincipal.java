import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
        setSize(250, 200);

        // Crea label cabecera Menú
        JLabel labelMenú = new JLabel("Menú", SwingConstants.CENTER);
        labelMenú.setFont(new Font("Arial", Font.PLAIN, 20));

        // Crear los botones
        JButton buttonRegistrar = new JButton("Registrar");
        JButton buttonGestionar = new JButton("Gestionar registros");
        JButton buttonSalir = new JButton("Salir");

        // Añadir label
        panel.add(labelMenú);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Añadir los botones al panel
        panel.add(buttonRegistrar);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(buttonGestionar);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(buttonSalir);

        // Centrar los botones y label
        labelMenú.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonRegistrar.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonGestionar.setAlignmentX(Component.CENTER_ALIGNMENT);
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
                        case "Gestionar registros":
                            mostrarPantallaGestionar();
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
        buttonGestionar.addActionListener(listener);
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
                            mostrarFormularioTesis();
                            break;
                        case "Articulo":
                            mostrarFormularioArticulo();
                            break;
                        case "Copia":
                            mostrarFormularioCopia();
                            break;
                        case "Prestamo":
                            mostrarFormularioPrestamo();
                            break;
                        case "Multa":
                            mostrarFormularioMulta();
                            break;
                        case "Autor":
                            mostrarFormularioAutor();
                            break;
                        case "Lector":
                            mostrarFormularioLector();
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

    //Formulario para registrar libros
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
        textID.setText(String.valueOf(gestionTxt.contarRegistros("Libros.txt")));
        textID.setEditable(false);  // No editable

        

        JLabel labelTitulo = new JLabel("Titulo:");
        JTextField textTitulo = new JTextField(20);

        JLabel labelEdicion = new JLabel("Edicion:");
        JTextField textEdicion = new JTextField(20);

        JLabel labelAnioPublicacion = new JLabel("Año Publicación:");
        JTextField textAnioPublicacion = new JTextField(20);

        JLabel labelEditorial = new JLabel("Editorial:");
        JTextField textEditorial = new JTextField(20);

        JLabel labelAutor = new JLabel("Autor:");
        JComboBox<String> comboAutor  = new JComboBox<>();
        gestionTxt.cargarListaDesdeArchivo(comboAutor, "Autores.txt", 0);
        JLabel labelEstado = new JLabel("Estado:");
        JComboBox<String> comboEstado  = new JComboBox<>(new String[] {"Habilitado", "Inhabilitado"});

        JLabel labelIdioma = new JLabel("Idioma:");
        JTextField textIdioma = new JTextField(20);

        JLabel labelCategoria = new JLabel("Categoria:");
        JComboBox<String> comboCategoria = new JComboBox<>();
        gestionTxt.cargarListaDesdeArchivo(comboCategoria, "Categorias.txt", 1);

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
        panel.add(labelTitulo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(textTitulo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelEdicion, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(textEdicion, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(labelAnioPublicacion, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(textAnioPublicacion, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(labelEditorial, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(textEditorial, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(labelAutor, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(comboAutor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(labelEstado, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(comboEstado, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(labelIdioma, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        panel.add(textIdioma, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(labelCategoria, gbc);

        gbc.gridx = 1;
        gbc.gridy = 9;
        panel.add(comboCategoria, gbc);

        // Botón para guardar
        JButton buttonGuardar = new JButton("Guardar");
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonGuardar, gbc);

        // Botón para volver
        JButton buttonVolver = new JButton("Volver");
        gbc.gridx = 0;
        gbc.gridy = 11;
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
                        int id = Integer.parseInt(textID.getText());
                        String titulo = textTitulo.getText();
                        String edicion = textEdicion.getText();
                        String aniopublicion = textAnioPublicacion.getText();
                        String editorial = textEditorial.getText();
                        String autor = (String)comboAutor.getSelectedItem();
                        String estado = (String)comboEstado.getSelectedItem();
                        String idioma = textIdioma.getText();
                        String categoria =  (String) comboCategoria.getSelectedItem();
                        Libro libro = new Libro(id, titulo, edicion, aniopublicion, editorial, autor, estado, idioma, categoria);
                        gestionTxt.escribirObjeto(libro, "Libros.txt");
                        // Se crea la copia del libro automaticamente
                        int IDcopia = gestionTxt.contarRegistros("Copias.txt"); 
                        Copia copia = new Copia(IDcopia, "en biblioteca", titulo, "Libro");
                        gestionTxt.escribirObjeto(copia, "Copias.txt");
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

    // Formulario para registrar categoria
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
        textID.setText(String.valueOf(gestionTxt.contarRegistros("Categorias.txt")));
        textID.setEditable(false);  // No editable
    
        JLabel labelNombre = new JLabel("Nombre:");
        JTextField textNombre = new JTextField(20);
    
        JLabel labelDescripcion = new JLabel("Descripción:");
        JTextField textDescripcion = new JTextField(20);
    
        JLabel labelIDCategoriaPrincipal = new JLabel("Categoría Principal:");
        JComboBox<String> comboCategoriaPrincipal  = new JComboBox<>();
        gestionTxt.cargarListaDesdeArchivo(comboCategoriaPrincipal, "Categorias.txt", 1);
    
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
                           // Obtener los valores de los campos de entrada
                            int id = Integer.parseInt(textID.getText());
                            String nombre = textNombre.getText();
                            String descripcion = textDescripcion.getText();
                            String categoriaPricipal =  (String) comboCategoriaPrincipal.getSelectedItem();
                            // Crear una instancia de la clase Categoria con los valores proporcionados
                            Categoria categoria = new Categoria(id, nombre, descripcion, categoriaPricipal);
                            // Llamar al método escribirCategoria de la clase gestionTxt para guardar la categoria en el archivo
                            gestionTxt.escribirObjeto(categoria, "categorias.txt");
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

    //Formulario para registar Autor
    public void mostrarFormularioAutor() {
        // Limpiar el panel y establecer un nuevo layout
        panel.removeAll();
        panel.setLayout(new GridBagLayout());
        setSize(400, 300);
    
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
    
        // Título
        JLabel labelMenuTitulo = new JLabel("Registrar Autor", SwingConstants.CENTER);
        labelMenuTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(labelMenuTitulo, gbc);
    
        // Crear etiquetas y campos de texto
        JLabel labelNombre = new JLabel("Nombre:");
        JTextField textNombre = new JTextField(20);
    
        JLabel labelNacionalidad = new JLabel("Nacionalidad:");
        JTextField textNacionalidad = new JTextField(20);
    
        JLabel labelFechaNacimiento = new JLabel("Fecha de Nacimiento:");
        JTextField textFechaNacimiento = new JTextField(20);
    
        JLabel labelLibrosAsociados = new JLabel("Libros Asociados:");
        JTextField textLibrosAsociados = new JTextField(20);
        //textLibrosAsociados.setEditable(false);
        // Añadir componentes al panel
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelNombre, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textNombre, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelNacionalidad, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(textNacionalidad, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelFechaNacimiento, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(textFechaNacimiento, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(labelLibrosAsociados, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(textLibrosAsociados, gbc);
    
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
                             // Obtener los valores de los campos de entrada
                            String nombre = textNombre.getText();
                            String nacionalidad = textNacionalidad.getText();
                            String fechaNacimiento = textFechaNacimiento.getText();
                            int librosAsociados = Integer.parseInt(textLibrosAsociados.getText());
                            
                            // Crear una instancia de la clase Autor con los valores proporcionados
                            Autor autor = new Autor(nombre, nacionalidad, fechaNacimiento, librosAsociados);
                            // Llamar al método escribirAutor de la clase gestionTxt para guardar el autor en el archivo
                            gestionTxt.escribirObjeto(autor, "Autores.txt" );
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
    
        // Añadir ActionListener a los botones
        buttonGuardar.addActionListener(listener);
        buttonVolver.addActionListener(listener);
    
        // Actualizar el panel
        panel.revalidate();
        panel.repaint();
    }

    // Formulario para registrar tesis
    public void mostrarFormularioTesis() {
        // Limpiar el panel y establecer un nuevo layout
        panel.removeAll();
        panel.setLayout(new GridBagLayout());
        setSize(400, 400);
    
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
    
        // Título
        JLabel labelMenuTitulo = new JLabel("Registrar Tesis", SwingConstants.CENTER);
        labelMenuTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(labelMenuTitulo, gbc);
    
        // Crear etiquetas y campos de texto
        JLabel labelID = new JLabel("ID:");
        JTextField textID = new JTextField(20);
        textID.setText(String.valueOf(gestionTxt.contarRegistros("Tesis.txt")));
        textID.setEditable(false);  // No editable
    
        JLabel labelNombreAutores = new JLabel("Nombre de Autores:");
        JComboBox<String> comboNombreAutores  = new JComboBox<>();
        gestionTxt.cargarListaDesdeArchivo(comboNombreAutores, "Autores.txt", 0);


        JLabel labelInstitucionAcademica = new JLabel("Institución Académica:");
        JTextField textInstitucionAcademica = new JTextField(20);
    
        JLabel labelFechaInvestigacion = new JLabel("Fecha de Investigación:");
        JTextField textFechaInvestigacion = new JTextField(20);
    
        JLabel labelFechaPresentacion = new JLabel("Fecha de Presentación:");
        JTextField textFechaPresentacion = new JTextField(20);
    
        JLabel labelCampoEstudio = new JLabel("Campo de Estudio:");
        JTextField textCampoEstudio = new JTextField(20);
    
        JLabel labelEstado = new JLabel("Estado:");
        JComboBox<String> comboEstado  = new JComboBox<>(new String[] {"Disponible", "Prestado en biblioteca", "En revisión", "En reparación", "No disponible"});

        JLabel labelPaginas = new JLabel("Páginas:");
        JTextField textPaginas = new JTextField(20);
    
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
        panel.add(labelNombreAutores, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(comboNombreAutores, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelInstitucionAcademica, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(textInstitucionAcademica, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(labelFechaInvestigacion, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(textFechaInvestigacion, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(labelFechaPresentacion, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(textFechaPresentacion, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(labelCampoEstudio, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(textCampoEstudio, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(labelEstado, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(comboEstado, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(labelPaginas, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 8;
        panel.add(textPaginas, gbc);
    
        // Botón para guardar
        JButton buttonGuardar = new JButton("Guardar");
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonGuardar, gbc);
    
        // Botón para volver
        JButton buttonVolver = new JButton("Volver");
        gbc.gridx = 0;
        gbc.gridy = 10;
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
                        String nombreAutores = (String)comboNombreAutores.getSelectedItem();
                        String institucionAcademica = textInstitucionAcademica.getText();
                        String fechaInvestigacion = textFechaInvestigacion.getText();
                        String fechaPresentacion = textFechaPresentacion.getText();
                        String campoEstudio = textCampoEstudio.getText();
                        String estado = (String)comboEstado.getSelectedItem();
                        int paginas = Integer.parseInt(textPaginas.getText());
                        Tesis tesis= new Tesis(nombreAutores, institucionAcademica, fechaInvestigacion, fechaPresentacion, campoEstudio, estado, paginas);
                        gestionTxt.escribirObjeto(tesis, "Tesis.txt");
                        // Se crea la copia del libro automaticamente
                        int IDcopia = gestionTxt.contarRegistros("Copias.txt"); 
                        Copia copia = new Copia(IDcopia, "en biblioteca", nombreAutores, "Tesis");
                        gestionTxt.escribirObjeto(copia, "Copias.txt");
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
    
        // Añadir ActionListener a los botones
        buttonGuardar.addActionListener(listener);
        buttonVolver.addActionListener(listener);
    
        // Actualizar el panel
        panel.revalidate();
        panel.repaint();
    }

    //Formulario para registrar articulo cientifico
    public void mostrarFormularioArticulo() {
        // Limpiar el panel y establecer un nuevo layout
        panel.removeAll();
        panel.setLayout(new GridBagLayout());
        setSize(400, 400);
    
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
    
        // Título
        JLabel labelMenuTitulo = new JLabel("Registrar Artículo", SwingConstants.CENTER);
        labelMenuTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(labelMenuTitulo, gbc);
    
        // Crear etiquetas y campos de texto
        JLabel labelDOI = new JLabel("DOI:");
        JTextField textDOI = new JTextField(20);
        textDOI.setText(String.valueOf(gestionTxt.contarRegistros("Articulos.txt")));
        textDOI.setEditable(false);  // No editable
    
        JLabel labelTitulo = new JLabel("Título:");
        JTextField textTitulo = new JTextField(20);
    
        JLabel labelEditor = new JLabel("Editor:");
        JTextField textEditor = new JTextField(20);
    
        JLabel labelFechaPublicacion = new JLabel("Fecha de Publicación:");
        JTextField textFechaPublicacion = new JTextField(20);
    
        JLabel labelPeriodicidad = new JLabel("Periodicidad:");
        JComboBox<String> comboPeriodicidad = new JComboBox<>(new String[] {"Semanal", "Mensual"});
    
        JLabel labelNumeroVolumen = new JLabel("Número de Volumen:");
        JTextField textNumeroVolumen = new JTextField(20);
    
        JLabel labelCampoInteres = new JLabel("Campo de Interés:");
        JTextField textCampoInteres = new JTextField(20);
    
        JLabel labelEstado = new JLabel("Estado:");
        JComboBox<String> comboEstado = new JComboBox<>(new String[] {"Disponible", "Prestado en biblioteca", "En revisión", "En reparación", "No disponible"});
    
        // Añadir componentes al panel
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelDOI, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textDOI, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelTitulo, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(textTitulo, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelEditor, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(textEditor, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(labelFechaPublicacion, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(textFechaPublicacion, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(labelPeriodicidad, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(comboPeriodicidad, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(labelNumeroVolumen, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(textNumeroVolumen, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(labelCampoInteres, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(textCampoInteres, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(labelEstado, gbc);
    
        gbc.gridx = 1;
        gbc.gridy = 8;
        panel.add(comboEstado, gbc);
    
        // Botón para guardar
        JButton buttonGuardar = new JButton("Guardar");
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonGuardar, gbc);
    
        // Botón para volver
        JButton buttonVolver = new JButton("Volver");
        gbc.gridx = 0;
        gbc.gridy = 10;
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
                            String titulo = textTitulo.getText();
                            int doi = Integer.parseInt(textDOI.getText());
                            String editor = textEditor.getText();
                            String fechaPublicacion = textFechaPublicacion.getText();
                            String periodicidad = (String)comboPeriodicidad.getSelectedItem();
                            int numeroVolumen = Integer.parseInt(textNumeroVolumen.getText());
                            String campoInteres = textCampoInteres.getText();
                            String estado = (String)comboEstado.getSelectedItem();
                            ArticuloCientifico articuloCientifico= new ArticuloCientifico(titulo, doi, editor, fechaPublicacion, periodicidad, numeroVolumen, campoInteres, estado);
                            gestionTxt.escribirObjeto(articuloCientifico, "Articulos.txt");
                            // Se crea la copia del libro automaticamente
                            int IDcopia = gestionTxt.contarRegistros("Copias.txt"); 
                            Copia copia = new Copia(IDcopia, "en biblioteca", titulo, "Articulo");
                            gestionTxt.escribirObjeto(copia, "Copias.txt");
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
    
        // Añadir ActionListener a los botones
        buttonGuardar.addActionListener(listener);
        buttonVolver.addActionListener(listener);
    
        // Actualizar el panel
        panel.revalidate();
        panel.repaint();
    }

    //Formulario para registrar lectro
    public void mostrarFormularioLector() {
    // Limpiar el panel y establecer un nuevo layout
    panel.removeAll();
    panel.setLayout(new GridBagLayout());
    setSize(400, 350);

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.anchor = GridBagConstraints.WEST;

    // Título
    JLabel labelMenuTitulo = new JLabel("Registrar Lector", SwingConstants.CENTER);
    labelMenuTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    panel.add(labelMenuTitulo, gbc);

    // Crear etiquetas y campos de texto
    JLabel labelID = new JLabel("ID:");
    JTextField textID = new JTextField(20);
    textID.setText(String.valueOf(gestionTxt.contarRegistros("Lectores.txt")));
    textID.setEditable(false);  // No editable

    JLabel labelNombre = new JLabel("Nombre:");
    JTextField textNombre = new JTextField(20);

    JLabel labelTelefono = new JLabel("Teléfono:");
    JTextField textTelefono = new JTextField(20);

    JLabel labelDireccion = new JLabel("Dirección:");
    JTextField textDireccion = new JTextField(20);

    JLabel labelEstado = new JLabel("Estado:");
    JComboBox<String> comboEstado = new JComboBox<>(new String[] {"Normal", "Sancionado", "Suspendido"});

    JLabel labelLibrosPrestados = new JLabel("Libros Prestados:");
    JTextField textLibrosPrestados = new JTextField(20);

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
    panel.add(labelTelefono, gbc);

    gbc.gridx = 1;
    gbc.gridy = 3;
    panel.add(textTelefono, gbc);

    gbc.gridx = 0;
    gbc.gridy = 4;
    panel.add(labelDireccion, gbc);

    gbc.gridx = 1;
    gbc.gridy = 4;
    panel.add(textDireccion, gbc);

    gbc.gridx = 0;
    gbc.gridy = 5;
    panel.add(labelEstado, gbc);

    gbc.gridx = 1;
    gbc.gridy = 5;
    panel.add(comboEstado, gbc);

    gbc.gridx = 0;
    gbc.gridy = 6;
    panel.add(labelLibrosPrestados, gbc);

    gbc.gridx = 1;
    gbc.gridy = 6;
    panel.add(textLibrosPrestados, gbc);

    // Botón para guardar
    JButton buttonGuardar = new JButton("Guardar");
    gbc.gridx = 0;
    gbc.gridy = 7;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    panel.add(buttonGuardar, gbc);

    // Botón para volver
    JButton buttonVolver = new JButton("Volver");
    gbc.gridx = 0;
    gbc.gridy = 8;
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
                        int id = Integer.parseInt(textID.getText());
                        String nombre = textNombre.getText();
                        String telefono = textTelefono.getText();
                        String direccion = textDireccion.getText();
                        String estado =  (String) comboEstado.getSelectedItem(); // Aquí necesitas convertir el índice en el valor correcto
                        int librosPrestados = Integer.parseInt(textLibrosPrestados.getText());
                        Lector lector = new Lector(id, nombre, telefono, direccion, estado, librosPrestados);
                        gestionTxt.escribirObjeto(lector, "lectores.txt");
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

    // Añadir ActionListener a los botones
    buttonGuardar.addActionListener(listener);
    buttonVolver.addActionListener(listener);

    // Actualizar el panel
    panel.revalidate();
    panel.repaint();
} 

    //Formulario para registrar copia
    public void mostrarFormularioCopia() {
        // Limpiar el panel y establecer un nuevo layout
        panel.removeAll();
        panel.setLayout(new GridBagLayout());
        setSize(400, 300);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Título
        JLabel labelMenuTitulo = new JLabel("Registrar Copia", SwingConstants.CENTER);
        labelMenuTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(labelMenuTitulo, gbc);

        // Crear etiquetas y campos de texto
        JLabel labelID = new JLabel("ID:");
        JTextField textID = new JTextField(20);
        textID.setText(String.valueOf(gestionTxt.contarRegistros("Copias.txt")));
        textID.setEditable(false);  // No editable

        JLabel labelEstado = new JLabel("Estado:");
        JComboBox<String> comboEstado = new JComboBox<>(new String[] {"en biblioteca", "prestada", "con retraso", "en reparación"});

        JLabel labelTipo = new JLabel("Tipo:");
        JComboBox<String> comboTipo = new JComboBox<>(new String[] {"Tesis", "Libro", "Articulo científico"});

        JLabel labelIDOrigen = new JLabel("ID Origen:");
        JComboBox<String> comboIDOrigen = new JComboBox<>();

        // Agregar un ActionListener al JComboBox comboTipo
        comboTipo.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Limpiar el JComboBox comboIDOrigen
            comboIDOrigen.removeAllItems();

            // Obtener el ítem seleccionado en comboTipo
            String seleccionado = (String) comboTipo.getSelectedItem();

            // Actualizar el contenido de comboIDOrigen según la opción seleccionada en comboTipo
            switch (seleccionado) {
                case "Tesis":
                    gestionTxt.cargarListaDesdeArchivo(comboIDOrigen, "Tesis.txt", 0);
                    break;
                case "Articulo científico":
                    gestionTxt.cargarListaDesdeArchivo(comboIDOrigen, "Articulos.txt", 0);
                    break;
                case "Libro":
                    gestionTxt.cargarListaDesdeArchivo(comboIDOrigen, "Libros.txt", 1);
                    break;
                default:
                    System.out.println("Tipo de recurso no reconocido");
                    break;
            }
        }
    });

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
        panel.add(labelEstado, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(comboEstado, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(labelIDOrigen, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(comboIDOrigen, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelTipo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(comboTipo, gbc);

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
                            int id = Integer.parseInt(textID.getText());
                            String estado = (String)comboEstado.getSelectedItem();
                            String idOrigen = (String)comboIDOrigen.getSelectedItem();
                            String tipo = (String)comboTipo.getSelectedItem();
                            Copia copia = new Copia(id, estado, idOrigen, tipo) ;
                            gestionTxt.escribirObjeto(copia, "Copias.txt");
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

        // Añadir ActionListener a los botones
        buttonGuardar.addActionListener(listener);
        buttonVolver.addActionListener(listener);

        // Actualizar el panel
        panel.revalidate();
        panel.repaint();
}
    
    //Formulario para registrar prestamo
    public void mostrarFormularioPrestamo() {
    // Limpiar el panel y establecer un nuevo layout
    panel.removeAll();
    panel.setLayout(new GridBagLayout());
    setSize(400, 500);

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.anchor = GridBagConstraints.WEST;

    // Título
    JLabel labelMenuTitulo = new JLabel("Registrar Préstamo", SwingConstants.CENTER);
    labelMenuTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    panel.add(labelMenuTitulo, gbc);

    // Crear etiquetas y campos de texto
    JLabel labelID = new JLabel("ID:");
    JTextField textID = new JTextField(20);
    textID.setText(String.valueOf(gestionTxt.contarRegistros("Prestamos.txt")));
    textID.setEditable(false);  // No editable

    JLabel labelTipo = new JLabel("Tipo:");
    JComboBox<String> comboTipo = new JComboBox<>(new String[] {"Libro", "Tesis", "Articulo científico"});

    JLabel labelIDEscrito = new JLabel("ID Escrito:");
    JComboBox<String> comboIDEscrito = new JComboBox<>(new String[] {"idLibro1", "idLibro2"});

    JLabel labelIDLector = new JLabel("ID Lector:");
    JComboBox<String> comboIDLector = new JComboBox<>(new String[] {"idLector1", "idLector2"});

    JLabel labelDiasPrestamo = new JLabel("Días Préstamo:");
    JTextField textDiasPrestamo = new JTextField(20);

    JLabel labelFechaPrestamo = new JLabel("Fecha Préstamo:");
    JTextField textFechaPrestamo = new JTextField(20);

    JLabel labelFechaEntrega = new JLabel("Fecha Entrega:");
    JTextField textFechaEntrega = new JTextField(20);

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
    panel.add(labelTipo, gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;
    panel.add(comboTipo, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    panel.add(labelIDEscrito, gbc);

    gbc.gridx = 1;
    gbc.gridy = 3;
    panel.add(comboIDEscrito, gbc);

    gbc.gridx = 0;
    gbc.gridy = 4;
    panel.add(labelIDLector, gbc);

    gbc.gridx = 1;
    gbc.gridy = 4;
    panel.add(comboIDLector, gbc);

    gbc.gridx = 0;
    gbc.gridy = 5;
    panel.add(labelDiasPrestamo, gbc);

    gbc.gridx = 1;
    gbc.gridy = 5;
    panel.add(textDiasPrestamo, gbc);

    gbc.gridx = 0;
    gbc.gridy = 6;
    panel.add(labelFechaPrestamo, gbc);

    gbc.gridx = 1;
    gbc.gridy = 6;
    panel.add(textFechaPrestamo, gbc);

    gbc.gridx = 0;
    gbc.gridy = 7;
    panel.add(labelFechaEntrega, gbc);

    gbc.gridx = 1;
    gbc.gridy = 7;
    panel.add(textFechaEntrega, gbc);

    // Botón para guardar
    JButton buttonGuardar = new JButton("Guardar");
    gbc.gridx = 0;
    gbc.gridy = 8;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    panel.add(buttonGuardar, gbc);

    // Botón para volver
    JButton buttonVolver = new JButton("Volver");
    gbc.gridx = 0;
    gbc.gridy = 9;
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
                        System.out.println("Guardar datos del préstamo");
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

    // Añadir ActionListener a los botones
    buttonGuardar.addActionListener(listener);
    buttonVolver.addActionListener(listener);

    // Actualizar el panel
    panel.revalidate();
    panel.repaint();
}
    
    //Formulario para registrar multa
    public void mostrarFormularioMulta() {
    // Limpiar el panel y establecer un nuevo layout
    panel.removeAll();
    panel.setLayout(new GridBagLayout());
    setSize(400, 350);

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.anchor = GridBagConstraints.WEST;

    // Título
    JLabel labelMenuTitulo = new JLabel("Registrar Multa", SwingConstants.CENTER);
    labelMenuTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    panel.add(labelMenuTitulo, gbc);

    // Crear etiquetas y campos de texto
    JLabel labelID = new JLabel("ID:");
    JTextField textID = new JTextField(20);
    textID.setText(String.valueOf(gestionTxt.contarRegistros("Multas.txt")));
    textID.setEditable(false);  // No editable

    JLabel labelIDPrestamo = new JLabel("ID Préstamo:");
    JComboBox<String> comboIDPrestamo = new JComboBox<>(new String[] {"idPrestamo1", "idPrestamo2"});

    JLabel labelDiaRetraso = new JLabel("Día Retraso:");
    JTextField textDiaRetraso = new JTextField(20);
    textDiaRetraso.setEditable(false);    

    JLabel labelFechaEntrega = new JLabel("Fecha Entrega:");
    JTextField textFechaEntrega = new JTextField(20);
    textFechaEntrega.setEditable(false);

    JLabel labelEstado = new JLabel("Estado:");
    JComboBox<String> comboEstado = new JComboBox<>(new String[] {"Activa", "Inactiva"});
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
    panel.add(labelIDPrestamo, gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;
    panel.add(comboIDPrestamo, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    panel.add(labelDiaRetraso, gbc);

    gbc.gridx = 1;
    gbc.gridy = 3;
    panel.add(textDiaRetraso, gbc);

    gbc.gridx = 0;
    gbc.gridy = 4;
    panel.add(labelFechaEntrega, gbc);

    gbc.gridx = 1;
    gbc.gridy = 4;
    panel.add(textFechaEntrega, gbc);

    gbc.gridx = 0;
    gbc.gridy = 5;
    panel.add(labelEstado, gbc);

    gbc.gridx = 1;
    gbc.gridy = 5;
    panel.add(comboEstado, gbc);

    // Botón para guardar
    JButton buttonGuardar = new JButton("Guardar");
    gbc.gridx = 0;
    gbc.gridy = 6;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    panel.add(buttonGuardar, gbc);

    // Botón para volver
    JButton buttonVolver = new JButton("Volver");
    gbc.gridx = 0;
    gbc.gridy = 7;
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
                        System.out.println("Guardar datos de la multa");
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

    // Añadir ActionListener a los botones
    buttonGuardar.addActionListener(listener);
    buttonVolver.addActionListener(listener);

    // Actualizar el panel
    panel.revalidate();
    panel.repaint();
}

    //Menu gestionar registros
    public void mostrarPantallaGestionar() {
        panel.removeAll();
        panel.setLayout(new GridBagLayout());
        setSize(800, 400);
        // Limpiar el panel y establecer un nuevo layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Título
        JLabel labelTitulo = new JLabel("Gestionar", SwingConstants.CENTER);
        labelTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        
        panel.add(labelTitulo, gbc);

        // Etiqueta "Seleccione el tipo"
        JLabel labelSeleccioneTipo = new JLabel("Seleccione el tipo:");
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelSeleccioneTipo, gbc);

        // ComboBox con las opciones
        JComboBox<String> comboTipo = new JComboBox<>(new String[]{"Libros", "Tesis", "Articulos", "Copias", "Prestamos", "Multas", "Autores", "Lectores", "Categorias"});
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(comboTipo, gbc);

        // Botón "Buscar"
        JButton buttonBuscar = new JButton("Buscar");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(buttonBuscar, gbc);
        
        
        // Tabla para mostrar resultados
    String[] columnNames = {};
    Object[][] data = {
        {}
    };
    JTable table = new JTable(data, columnNames);
    JScrollPane scrollPane = new JScrollPane(table);
    gbc.gridx = 0;
    gbc.gridy = 4;
    gbc.gridwidth = 2;
    gbc.gridheight = 5;  // Ajuste de altura
    gbc.fill = GridBagConstraints.BOTH;  // Permitir expansión en ambos sentidos
    gbc.weightx = 1.0;  // Distribución horizontal del espacio
    gbc.weighty = 1.0;  // Distribución vertical del espacio
    panel.add(scrollPane, gbc);


        // Botón Volver
        JButton buttonVolver = new JButton("Volver");
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.weightx = 0.0;  // Distribución horizontal del espacio
        gbc.weighty = 0.0;
        panel.add(buttonVolver, gbc);

        // Botón "Editar / Habilitar"
        JButton buttonEditar = new JButton("Editar / Habilitar");
        gbc.gridx = 1;
        gbc.gridy = 9;
        panel.add(buttonEditar, gbc);

        // Botón "Eliminar / Habilitar"
        JButton buttonEliminar = new JButton("Eliminar / Deshabilitar");
        gbc.gridx = 1;
        gbc.gridy = 10;
        panel.add(buttonEliminar, gbc);

       // Crear un ActionListener para todos los botones
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof JButton) {
                JButton button = (JButton) source;
                String buttonText = button.getText();
                // Usar switch para manejar diferentes botones
                String estado ="";
                String nombreArchivo = "";
                int selectedRow =0;
                switch (buttonText) {
                    case "Editar / Habilitar":
                        estado = (String) comboTipo.getSelectedItem();
                        // Agregar ".txt" al nombre del archivo
                        nombreArchivo = estado + ".txt";
                        selectedRow = table.getSelectedRow();
                        if (selectedRow != -1) {   
                            gestionTxt.editarRegistro(selectedRow, table, nombreArchivo);
                        }
                        break;
                    case "Eliminar / Deshabilitar":
                         // Obtener el valor seleccionado del comboTipo y convertirlo a cadena
                         estado = (String) comboTipo.getSelectedItem();
                         // Agregar ".txt" al nombre del archivo
                         nombreArchivo = estado + ".txt";
                        selectedRow = table.getSelectedRow();
                        if (selectedRow != -1) {
                            // Llamar al método para eliminar el registro del archivo
                            gestionTxt.manejarRegistro (table, nombreArchivo, selectedRow);
                            // Eliminar la fila de la tabla
                            //((DefaultTableModel) table.getModel()).removeRow(selectedRow);
                        }
                        break;
                    case "Buscar":
                         // Obtener el valor seleccionado del comboTipo y convertirlo a cadena
                        estado = (String) comboTipo.getSelectedItem();
                        // Agregar ".txt" al nombre del archivo
                        nombreArchivo = estado + ".txt";
                        // Llamar al método llenarTabla con el nombre del archivo modificado
                        gestionTxt.llenarTabla(table, nombreArchivo);
                        
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
    // Añadir ActionListener a los botones
    buttonVolver.addActionListener(listener);
    buttonBuscar.addActionListener(listener);
    buttonEditar.addActionListener(listener);
    buttonEliminar.addActionListener(listener);

    // Añadir el panel al frame
    add(panel);
    setVisible(true);
    }
    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> new menuPrincipal());
    }
}
