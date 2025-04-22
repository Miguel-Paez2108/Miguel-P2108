package Taller_3;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio_2 extends JFrame {
    JTextField txtA = new JTextField();
    JTextField txtB = new JTextField();
    JButton btnDivision = new JButton("Calcular División");
    JLabel etiResultado = new JLabel("Resultado: ");

    public Ejercicio_2() {
        setLayout(null);
        setTitle("División");
        setSize(300, 250);

        txtA.setBounds(50, 30, 200, 25);
        txtB.setBounds(50, 60, 200, 25);
        btnDivision.setBounds(50, 100, 200, 30);
        etiResultado.setBounds(50, 150, 200, 30);

        add(txtA);
        add(txtB);
        add(btnDivision);
        add(etiResultado);

        btnDivision.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());

                if (a < 0 || b < 0) {
                    JOptionPane.showMessageDialog(null, "No se permiten valores negativos");
                } else if (b == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
                } else {
                    double resultado = a / b;
                    etiResultado.setText("Resultado: " + resultado);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ejercicio_2().setVisible(true);
    }
}
