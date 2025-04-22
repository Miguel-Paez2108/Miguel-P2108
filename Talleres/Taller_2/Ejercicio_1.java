package Taller_2;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio_1 extends JFrame {
    JTextField txtUnidades = new JTextField();
    JTextField txtPrecio = new JTextField();
    JLabel etiTotalSinIva = new JLabel("Total sin IVA:");
    JLabel etiIva = new JLabel("IVA:");
    JLabel etiTotalMasIva = new JLabel("Total con IVA:");
    JButton btnCalcular = new JButton("Calcular");

    public Ejercicio_1() {
        setLayout(null);
        setTitle("Ejercicio 1");
        setSize(300, 250);

        txtUnidades.setBounds(20, 20, 100, 25);
        txtPrecio.setBounds(20, 60, 100, 25);
        btnCalcular.setBounds(20, 100, 100, 25);

        etiTotalSinIva.setBounds(20, 140, 200, 20);
        etiIva.setBounds(20, 160, 200, 20);
        etiTotalMasIva.setBounds(20, 180, 200, 20);

        add(txtUnidades);
        add(txtPrecio);
        add(btnCalcular);
        add(etiTotalSinIva);
        add(etiIva);
        add(etiTotalMasIva);

        btnCalcular.addActionListener(e -> {
            try {
                double unidades = Double.parseDouble(txtUnidades.getText());
                double precio = Double.parseDouble(txtPrecio.getText());
                double totalSinIva = unidades * precio;
                double iva = totalSinIva * 0.19;
                double totalConIva = totalSinIva + iva;

                etiTotalSinIva.setText(String.format("Total sin IVA: %.2f", totalSinIva));
                etiIva.setText(String.format("IVA: %.2f", iva));
                etiTotalMasIva.setText(String.format("Total con IVA: %.2f", totalConIva));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio_1();
    }
}
