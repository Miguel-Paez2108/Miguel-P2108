package Taller_5;
import javax.swing.*;

public class Ejercicio2 extends JFrame {
    JTextField txtDNI;
    JLabel lblDNI;
    JButton btnPrepararDNI;

    public Ejercicio2() {
        setTitle("Preparar DNI");
        setLayout(null);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtDNI = new JTextField();
        txtDNI.setBounds(30, 30, 300, 30);
        add(txtDNI);

        btnPrepararDNI = new JButton("Preparar DNI");
        btnPrepararDNI.setBounds(120, 70, 150, 30);
        add(btnPrepararDNI);

        lblDNI = new JLabel("DNI: ");
        lblDNI.setBounds(30, 120, 300, 30);
        add(lblDNI);

        btnPrepararDNI.addActionListener(e -> {
            String dni = txtDNI.getText();
            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor introduzca un DNI.");
                return;
            }

            String dniPreparado = dni.replaceAll("[^a-zA-Z0-9]", "");
            lblDNI.setText("DNI: " + dniPreparado);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}
