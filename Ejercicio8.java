import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {

        // Crear ventana
        JFrame ventana = new JFrame();

        ventana.setTitle("Componentes Swing");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        // Etiqueta
        JLabel etiqueta = new JLabel("Ingrese su nombre:");
        etiqueta.setBounds(50, 50, 150, 30);

        // Caja de texto
        JTextField texto = new JTextField();
        texto.setBounds(180, 50, 150, 30);

        // Botón
        JButton boton = new JButton("Saludar");
        boton.setBounds(130, 120, 120, 40);

        // Evento del botón
        boton.addActionListener(e -> {
            String nombre = texto.getText();

            JOptionPane.showMessageDialog(
                null,
                "Hola " + nombre
            );
        });

        // Agregar componentes
        ventana.add(etiqueta);
        ventana.add(texto);
        ventana.add(boton);

        // Mostrar ventana
        ventana.setVisible(true);
    }
}