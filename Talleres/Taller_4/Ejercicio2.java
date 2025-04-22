package Taller_4;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio2 extends JFrame {
    JTextField txtFrase, txtSubcadena;
    JLabel lblInicio, lblFin, lblAntes, lblDespues;
    JButton btnAnalizar;

    public Ejercicio2() {
        setTitle("Ejercicio 2");
        setSize(500, 350);
        setLayout(null);

        txtFrase = new JTextField();
        txtFrase.setBounds(20, 20, 440, 25);
        add(txtFrase);

        txtSubcadena = new JTextField();
        txtSubcadena.setBounds(20, 60, 200, 25);
        add(txtSubcadena);

        btnAnalizar = new JButton("Analizar");
        btnAnalizar.setBounds(250, 60, 100, 25);
        add(btnAnalizar);

        lblInicio = new JLabel("Posición inicial: ");
        lblInicio.setBounds(20, 100, 450, 20);
        add(lblInicio);

        lblFin = new JLabel("Posición final: ");
        lblFin.setBounds(20, 130, 450, 20);
        add(lblFin);

        lblAntes = new JLabel("Texto anterior: ");
        lblAntes.setBounds(20, 160, 450, 20);
        add(lblAntes);

        lblDespues = new JLabel("Texto posterior: ");
        lblDespues.setBounds(20, 190, 450, 20);
        add(lblDespues);

        btnAnalizar.addActionListener(e -> {
            String frase = txtFrase.getText();
            String palabra = txtSubcadena.getText();

            int inicio = frase.indexOf(palabra);
            int fin = frase.lastIndexOf(palabra);

            if (inicio == -1) {
                JOptionPane.showMessageDialog(null, "La palabra no se encuentra en la frase.");
                lblInicio.setText("Posición inicial: ");
                lblFin.setText("Posición final: ");
                lblAntes.setText("Texto anterior: ");
                lblDespues.setText("Texto posterior: ");
            } else {
                lblInicio.setText("Posición inicial: " + inicio);
                lblFin.setText("Posición final: " + fin);
                lblAntes.setText("Texto anterior: " + frase.substring(0, inicio));
                lblDespues.setText("Texto posterior: " + frase.substring(fin + palabra.length()));
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}
