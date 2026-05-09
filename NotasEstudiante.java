import javax.swing.*;
import java.awt.event.*;

public class NotasEstudiante extends JFrame {

    JTextField n1, n2, n3, n4, n5;
    JLabel promedio, desviacion, mayor, menor;
    JButton calcular;

    public NotasEstudiante() {

        setTitle("Notas del Estudiante");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel t1 = new JLabel("Nota 1:");
        t1.setBounds(50, 30, 100, 30);
        add(t1);

        n1 = new JTextField();
        n1.setBounds(150, 30, 100, 30);
        add(n1);

        JLabel t2 = new JLabel("Nota 2:");
        t2.setBounds(50, 70, 100, 30);
        add(t2);

        n2 = new JTextField();
        n2.setBounds(150, 70, 100, 30);
        add(n2);

        JLabel t3 = new JLabel("Nota 3:");
        t3.setBounds(50, 110, 100, 30);
        add(t3);

        n3 = new JTextField();
        n3.setBounds(150, 110, 100, 30);
        add(n3);

        JLabel t4 = new JLabel("Nota 4:");
        t4.setBounds(50, 150, 100, 30);
        add(t4);

        n4 = new JTextField();
        n4.setBounds(150, 150, 100, 30);
        add(n4);

        JLabel t5 = new JLabel("Nota 5:");
        t5.setBounds(50, 190, 100, 30);
        add(t5);

        n5 = new JTextField();
        n5.setBounds(150, 190, 100, 30);
        add(n5);

        calcular = new JButton("Calcular");
        calcular.setBounds(150, 240, 120, 40);
        add(calcular);

        promedio = new JLabel("Promedio:");
        promedio.setBounds(50, 300, 300, 20);
        add(promedio);

        desviacion = new JLabel("Desviación estándar:");
        desviacion.setBounds(50, 320, 300, 20);
        add(desviacion);

        mayor = new JLabel("Nota mayor:");
        mayor.setBounds(50, 340, 300, 20);
        add(mayor);

        menor = new JLabel("Nota menor:");
        menor.setBounds(50, 360, 300, 20);
        add(menor);

        calcular.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double nota1 = Double.parseDouble(n1.getText());
                double nota2 = Double.parseDouble(n2.getText());
                double nota3 = Double.parseDouble(n3.getText());
                double nota4 = Double.parseDouble(n4.getText());
                double nota5 = Double.parseDouble(n5.getText());

                double[] notas = {nota1, nota2, nota3, nota4, nota5};

                double suma = 0;

                for (double nota : notas) {
                    suma += nota;
                }

                double prom = suma / notas.length;

                double sumaDesv = 0;

                for (double nota : notas) {
                    sumaDesv += Math.pow(nota - prom, 2);
                }

                double desv = Math.sqrt(sumaDesv / notas.length);

                double notaMayor = notas[0];
                double notaMenor = notas[0];

                for (double nota : notas) {

                    if (nota > notaMayor) {
                        notaMayor = nota;
                    }

                    if (nota < notaMenor) {
                        notaMenor = nota;
                    }
                }

                promedio.setText("Promedio: " + prom);
                desviacion.setText("Desviación estándar: " + desv);
                mayor.setText("Nota mayor: " + notaMayor);
                menor.setText("Nota menor: " + notaMenor);
            }
        });
    }

    public static void main(String[] args) {

        NotasEstudiante ventana = new NotasEstudiante();
        ventana.setVisible(true);
    }
}