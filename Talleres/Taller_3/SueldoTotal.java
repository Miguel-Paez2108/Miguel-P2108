package Taller_3;
import javax.swing.*;
import java.awt.event.*;

public class SueldoTotal extends JFrame {
    JTextField txtSueldoBase = new JTextField();
    JTextField txtMeses = new JTextField();
    JButton btnCalcular = new JButton("Calcular");
    JLabel etiResultado = new JLabel("Resultado: ");

    public SueldoTotal() {
        setLayout(null);
        setTitle("Sueldo Total");
        setSize(300, 250);

        txtSueldoBase.setBounds(50, 30, 200, 25);
        txtMeses.setBounds(50, 60, 200, 25);
        btnCalcular.setBounds(50, 100, 200, 30);
        etiResultado.setBounds(50, 150, 200, 30);

        add(txtSueldoBase);
        add(txtMeses);
        add(btnCalcular);
        add(etiResultado);

        btnCalcular.addActionListener(e -> {
            try {
                double sueldoBase = Double.parseDouble(txtSueldoBase.getText());
                int meses = Integer.parseInt(txtMeses.getText());
                String pass = JOptionPane.showInputDialog("Ingrese la contraseña:");

                if (pass != null && pass.equals("1234")) {
                    double total = (sueldoBase - (sueldoBase * 0.10)) * meses;
                    etiResultado.setText("Resultado: " + total);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese valores válidos");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SueldoTotal().setVisible(true);
    }
}
