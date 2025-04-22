package Taller_1;  

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejercicio_7 extends JFrame implements ActionListener {

    JLabel etiTexto;
    JButton btnAzul, btnRojo, btnVerde;
    JButton btnFondoAzul, btnFondoRojo, btnFondoVerde;
    JButton btnTransparente, btnOpaca;

    public Ejercicio_7() {
        setTitle("Ejercicio 7 - Colores y Opacidad");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiTexto = new JLabel("Texto de ejemplo");
        etiTexto.setBounds(100, 20, 200, 30);
        etiTexto.setOpaque(true);
        etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
        add(etiTexto);

        btnAzul = new JButton("Azul");
        btnAzul.setBounds(20, 70, 100, 30);
        btnAzul.addActionListener(this);
        add(btnAzul);

        btnRojo = new JButton("Rojo");
        btnRojo.setBounds(140, 70, 100, 30);
        btnRojo.addActionListener(this);
        add(btnRojo);

        btnVerde = new JButton("Verde");
        btnVerde.setBounds(260, 70, 100, 30);
        btnVerde.addActionListener(this);
        add(btnVerde);

        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoAzul.setBounds(20, 120, 120, 30);
        btnFondoAzul.addActionListener(this);
        add(btnFondoAzul);

        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoRojo.setBounds(150, 120, 120, 30);
        btnFondoRojo.addActionListener(this);
        add(btnFondoRojo);

        btnFondoVerde = new JButton("Fondo Verde");
        btnFondoVerde.setBounds(280, 120, 120, 30);
        btnFondoVerde.addActionListener(this);
        add(btnFondoVerde);

        btnTransparente = new JButton("Transparente");
        btnTransparente.setBounds(80, 180, 120, 30);
        btnTransparente.addActionListener(this);
        add(btnTransparente);

        btnOpaca = new JButton("Opaca");
        btnOpaca.setBounds(220, 180, 100, 30);
        btnOpaca.addActionListener(this);
        add(btnOpaca);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAzul) {
            etiTexto.setForeground(Color.BLUE);
        } else if (e.getSource() == btnRojo) {
            etiTexto.setForeground(Color.RED);
        } else if (e.getSource() == btnVerde) {
            etiTexto.setForeground(Color.GREEN);
        } else if (e.getSource() == btnFondoAzul) {
            etiTexto.setBackground(Color.BLUE);
        } else if (e.getSource() == btnFondoRojo) {
            etiTexto.setBackground(Color.RED);
        } else if (e.getSource() == btnFondoVerde) {
            etiTexto.setBackground(Color.GREEN);
        } else if (e.getSource() == btnTransparente) {
            etiTexto.setOpaque(false);
            etiTexto.repaint();
        } else if (e.getSource() == btnOpaca) {
            etiTexto.setOpaque(true);
            etiTexto.repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio_7().setVisible(true);
        });
    }
}
