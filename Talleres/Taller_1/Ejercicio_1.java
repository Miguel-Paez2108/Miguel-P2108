package Taller_1;  // Asegúrate de que coincida con tu carpeta

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio_1 extends JFrame {
    JLabel etiNombre, etiCiudad;
    JButton btnOcultarNombre, btnVisuNombre, btnOcultarCiudad, btnVisuCiudad;

    public Ejercicio_1() {
        setLayout(null);
        setTitle("Ejercicio 1");
        setSize(400, 300);

        etiNombre = new JLabel("Tu Nombre");
        etiNombre.setBounds(50, 30, 150, 20);
        add(etiNombre);

        etiCiudad = new JLabel("Tu Ciudad");
        etiCiudad.setBounds(50, 60, 150, 20);
        add(etiCiudad);

        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnOcultarNombre.setBounds(50, 100, 150, 25);
        add(btnOcultarNombre);

        btnVisuNombre = new JButton("Visualizar Nombre");
        btnVisuNombre.setBounds(210, 100, 150, 25);
        add(btnVisuNombre);

        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnOcultarCiudad.setBounds(50, 140, 150, 25);
        add(btnOcultarCiudad);

        btnVisuCiudad = new JButton("Visualizar Ciudad");
        btnVisuCiudad.setBounds(210, 140, 150, 25);
        add(btnVisuCiudad);

        // Eventos
        btnOcultarNombre.addActionListener(e -> etiNombre.setVisible(false));
        btnVisuNombre.addActionListener(e -> etiNombre.setVisible(true));
        btnOcultarCiudad.addActionListener(e -> etiCiudad.setVisible(false));
        btnVisuCiudad.addActionListener(e -> etiCiudad.setVisible(true));
    }

    public static void main(String[] args) {
        new Ejercicio_1().setVisible(true);
    }
}

