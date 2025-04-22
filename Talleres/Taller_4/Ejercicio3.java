package Taller_4;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio3 extends JFrame {
    JTextField txtFrase, txtPalabra1, txtPalabra2, txtPalabra3, txtPalabra4;
    JLabel lblIgual, lblEmpieza, lblTermina, lblContiene;
    JButton btnAnalizar;

    public Ejercicio3() {
        setTitle("Ejercicio 3");
        setSize(500, 400);
        setLayout(null);

        txtFrase = new JTextField();
        txtFrase.setBounds(20, 20, 440, 25);
        add(txtFrase);

        txtPalabra1 = new JTextField();
        txtPalabra1.setBounds(20, 60, 200, 25);
        add(txtPalabra1);

        txtPalabra2 = new JTextField();
        txtPalabra2.setBounds(20, 100, 200, 25);
        add(txtPalabra2);

        txtPalabra3 = new JTextField();
        txtPalabra3.setBounds(20, 140, 200, 25);
        add(txtPalabra3);

        txtPalabra4 = new JTextField();
        txtPalabra4.setBounds(20, 180, 200, 25);
        add(txtPalabra4);

        btnAnalizar = new JButton("Analizar");
        btnAnalizar.setBounds(250, 100, 100, 30);
        add(btnAnalizar);

        lblIgual = new JLabel("¿Frase igual a palabra 1?");
        lblIgual.setBounds(20, 230, 450, 20);
        add(lblIgual);

        lblEmpieza = new JLabel("¿Frase empieza con palabra 2?");
        lblEmpieza.setBounds(20, 260, 450, 20);
        add(lblEmpieza);

        lblTermina = new JLabel("¿Frase termina con palabra 3?");
        lblTermina.setBounds(20, 290, 450, 20);
        add(lblTermina);

        lblContiene = new JLabel("¿Palabra 4 contenida?");
        lblContiene.setBounds(20, 320, 450, 20);
        add(lblContiene);

        btnAnalizar.addActionListener(e -> {
            String frase = txtFrase.getText();
            String p1 = txtPalabra1.getText();
            String p2 = txtPalabra2.getText();
            String p3 = txtPalabra3.getText();
            String p4 = txtPalabra4.getText();

            lblIgual.setText("¿Frase igual a palabra 1? " + frase.equals(p1));
            lblEmpieza.setText("¿Frase empieza con palabra 2? " + frase.startsWith(p2));
            lblTermina.setText("¿Frase termina con palabra 3? " + frase.endsWith(p3));

            if (frase.contains(p4)) {
                int pos = frase.indexOf(p4);
                lblContiene.setText("¿Palabra 4 contenida? Sí, en la posición " + pos);
            } else {
                lblContiene.setText("¿Palabra 4 contenida? No");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio3();
    }
}
