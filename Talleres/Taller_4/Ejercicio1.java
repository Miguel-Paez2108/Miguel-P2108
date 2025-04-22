package Taller_4;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio1 extends JFrame {
    JTextField txtFrase;
    JLabel lblMayusculas, lblMinusculas, lblCaracteres, lblSinEspacios;
    JButton btnAnalizar;

    public Ejercicio1() {
        setTitle("Ejercicio 1");
        setSize(400, 300);
        setLayout(null);

        txtFrase = new JTextField();
        txtFrase.setBounds(20, 20, 340, 25);
        add(txtFrase);

        btnAnalizar = new JButton("Analizar");
        btnAnalizar.setBounds(130, 60, 120, 25);
        add(btnAnalizar);

        lblMayusculas = new JLabel("Mayúsculas: ");
        lblMayusculas.setBounds(20, 100, 350, 20);
        add(lblMayusculas);

        lblMinusculas = new JLabel("Minúsculas: ");
        lblMinusculas.setBounds(20, 130, 350, 20);
        add(lblMinusculas);

        lblCaracteres = new JLabel("Caracteres: ");
        lblCaracteres.setBounds(20, 160, 350, 20);
        add(lblCaracteres);

        lblSinEspacios = new JLabel("Sin espacios: ");
        lblSinEspacios.setBounds(20, 190, 350, 20);
        add(lblSinEspacios);

        btnAnalizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String frase = txtFrase.getText();
                if (frase.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese una frase.");
                } else {
                    lblMayusculas.setText("Mayúsculas: " + frase.toUpperCase());
                    lblMinusculas.setText("Minúsculas: " + frase.toLowerCase());
                    lblCaracteres.setText("Caracteres: " + frase.length());
                    lblSinEspacios.setText("Sin espacios: " + frase.replace(" ", "").length());
                }
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio1();
    }
}

