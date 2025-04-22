package Taller_1;  // Asegúrate de que coincida con tu carpeta

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio_3 extends JFrame {  // Cambié el nombre de la clase a Ejercicio_3
    JTextField txtTexto;
    JLabel etiTexto;
    JButton btnVaciar;

    public Ejercicio_3() {  // Cambié el nombre del constructor a Ejercicio_3
        setLayout(null);
        setTitle("Ejercicio 3");
        setSize(400, 200);

        txtTexto = new JTextField();
        txtTexto.setBounds(50, 30, 200, 25);
        add(txtTexto);

        etiTexto = new JLabel("");
        etiTexto.setBounds(50, 70, 200, 25);
        add(etiTexto);

        btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(50, 110, 100, 25);
        add(btnVaciar);

        txtTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                etiTexto.setText(txtTexto.getText());
            }
        });

        btnVaciar.addActionListener(e -> {
            txtTexto.setText("");
            etiTexto.setText("");
        });
    }

    public static void main(String[] args) {
        new Ejercicio_3().setVisible(true);  // Cambié el nombre de la clase en la llamada
    }
}
