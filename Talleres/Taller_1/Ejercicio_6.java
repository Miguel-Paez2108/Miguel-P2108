package Taller_1;  // Cambié el nombre del paquete para que coincida con tu carpeta

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio_6 extends JFrame implements ActionListener, MouseListener {
    JLabel etiNombre;
    JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;
    int etiquetaAncho = 100, etiquetaAlto = 30;

    public Ejercicio_6() {  // Cambié el nombre del constructor a Ejercicio_6
        setTitle("Ejercicio 6");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiNombre = new JLabel("Tu Nombre", SwingConstants.CENTER);
        etiNombre.setOpaque(true);
        etiNombre.setBackground(Color.CYAN);
        etiNombre.setBounds(150, 150, etiquetaAncho, etiquetaAlto);

        btnEsquina = new JButton("Esquina");
        btnCentro = new JButton("Centro");
        btnAgrandar = new JButton("Agrandar");
        btnAchicar = new JButton("Achicar");

        btnEsquina.setBounds(20, 300, 100, 30);
        btnCentro.setBounds(130, 300, 100, 30);
        btnAgrandar.setBounds(240, 300, 100, 30);
        btnAchicar.setBounds(130, 340, 100, 30);

        add(etiNombre);
        add(btnEsquina);
        add(btnCentro);
        add(btnAgrandar);
        add(btnAchicar);

        btnEsquina.addActionListener(this);
        btnCentro.addActionListener(this);
        btnAgrandar.addActionListener(this);
        btnAchicar.addActionListener(this);

        btnEsquina.addMouseListener(this);
        btnCentro.addMouseListener(this);
        btnAgrandar.addMouseListener(this);
        btnAchicar.addMouseListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEsquina) {
            etiNombre.setLocation(0, 0);
        } else if (e.getSource() == btnCentro) {
            etiNombre.setLocation(getWidth() / 2 - etiquetaAncho / 2, getHeight() / 2 - etiquetaAlto / 2 - 50);
        } else if (e.getSource() == btnAgrandar) {
            etiquetaAncho += 20;
            etiquetaAlto += 10;
            etiNombre.setSize(etiquetaAncho, etiquetaAlto);
        } else if (e.getSource() == btnAchicar) {
            etiquetaAncho = Math.max(40, etiquetaAncho - 20);
            etiquetaAlto = Math.max(20, etiquetaAlto - 10);
            etiNombre.setSize(etiquetaAncho, etiquetaAlto);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setSize(120, 40);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setSize(100, 30);
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new Ejercicio_6();  // Cambié el nombre de la clase en la llamada
    }
}


