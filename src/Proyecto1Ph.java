 
import javax.swing.*; //Se usan para crear interfaces graficas(ventanas, botones,formularios)
import java.awt.*; //Se usa para manejar el diseño, colores, fuentes y eventos en interfaces gráficas
import java.awt.event.ActionEvent; //Acción del usuario en una interfaz gráfica
                                   //Sirve para saber cuándo ocurre una acción y responder a ella
import java.awt.event.ActionListener; //Sirve para detectar acciones del usuario en una interfaz gráfica.
                                       //Cuando se realiza clic en un boton
                                      

public class Proyecto1Ph extends JFrame {

    // Atributos del formulario
    private JTextField Cedulaa;
    private JTextField Nombree;
    private JTextField Apellidos;
    private JTextField Direccion;
    private JTextField Email;
    private JTextField Telefono;
    private JButton Aceptarr;

    // Constructor
    public Proyecto1Ph() {
        setTitle("Formulario Proyecto1Ph");
        setSize(400, 250); //Es un método de la clase swing que permite visualizar la ventana
        //ancho y alto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Indic que debe hcer la vnetada, en este caso
        //  dice que termine completamente la ejecución cuando se cierre la ventana.
        setLocationRelativeTo(null); // Centrar ventana

        // Crear panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 6, 10, 10));

        // Componentes
        JLabel pnlNombre = new JLabel("Nombre:");
        Nombree = new JTextField();

        JLabel pnlCedula = new JLabel("Cédula:");
        Cedulaa = new JTextField();

        JLabel pnlApellidos=new JLabel("Apellido");
        Apellidos=new JTextField();

        JLabel pnlDireccion=new JLabel("Direccion");
        Direccion=new JTextField();
        
        JLabel pnlEmail=new JLabel("Email");
        Email=new JTextField();

         JLabel pnlTelefono=new JLabel("Telefono");
        Telefono=new JTextField();

        Aceptarr = new JButton("Aceptar");
        
        // Acción del botón
        Aceptarr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = Nombree.getText();
                String cedula = Cedulaa.getText();
                String apellido=Apellidos.getText();
                String direccion=Direccion.getText();
                String email=Email.getText();
                String telefono=Telefono.getText();
        

    JOptionPane.showMessageDialog(
        null,
        "Nombre: " + nombre +
        "\nCédula: " + cedula +
        "\nApellido: " + apellido +
        "\nDirección: " + direccion +
        "\nEmail: " + email +
        "\nTeléfono: " + telefono
);
            }
        });

        // Agregar al panel
        panel.add(pnlNombre);
        panel.add(Nombree);
        panel.add(pnlCedula);
        panel.add(Cedulaa);
        panel.add(pnlApellidos);
        panel.add(Apellidos);
        panel.add(pnlDireccion);
        panel.add(Direccion);
        panel.add(pnlEmail);
        panel.add(Email);
        panel.add(pnlTelefono);
        panel.add(Telefono);
        
        panel.add(new JLabel(""));
        panel.add(Aceptarr);

        // Panel al JFrame
        add(panel);
        
    }

        public static void main(String[] args) {
        new Proyecto1Ph().setVisible(true);
    }
}


