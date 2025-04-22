package Taller_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio_5 extends JFrame {
    JLabel etiPal1, etiPal2, etiPal3, etiPal4, etiOcultar;

    public Ejercicio_5() {
        setLayout(null);
        setTitle("Ejercicio 5");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiPal1 = new JLabel("Palabra 1");
        etiPal2 = new JLabel("Palabra 2");
        etiPal3 = new JLabel("Palabra 3");
        etiPal4 = new JLabel("Palabra 4");
        etiOcultar = new JLabel("Ocultar", SwingConstants.CENTER);

        etiPal1.setBounds(50, 50, 100, 30);
        etiPal2.setBounds(150, 50, 100, 30);
        etiPal3.setBounds(50, 100, 100, 30);
        etiPal4.setBounds(150, 100, 100, 30);
        etiOcultar.setBounds(100, 180, 200, 50);
        etiOcultar.setOpaque(true);
        etiOcultar.setBackground(Color.LIGHT_GRAY);
        etiOcultar.setFont(new Font("Arial", Font.BOLD, 16));

        add(etiPal1);
        add(etiPal2);
        add(etiPal3);
        add(etiPal4);
        add(etiOcultar);

        // Agregar MouseListener a la etiqueta Ocultar
        etiOcultar.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Ocultar las palabras cuando el mouse entra en la zona de la etiqueta Ocultar
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            public void mouseExited(MouseEvent e) {
                // Mostrar las palabras cuando el mouse sale de la zona de la etiqueta Ocultar
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio_5();
    }
}
