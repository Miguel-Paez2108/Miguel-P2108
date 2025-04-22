package Taller_6;
import javax.swing.*;

public class Ejercicio3 extends JFrame {
    JTextField txtNumero1, txtNumero2;
    JButton btnCalcular;

    public Ejercicio3() {
        setTitle("División y Resto");
        setLayout(null);
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(30, 30, 150, 30);
        add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(200, 30, 150, 30);
        add(txtNumero2);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 80, 120, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> {
            try {
                int numero1 = Integer.parseInt(txtNumero1.getText());
                int numero2 = Integer.parseInt(txtNumero2.getText());

                if (numero1 < 0 || numero1 > 100 || numero2 < 0 || numero2 > 100) {
                    throw new FueraDeRangoException("Los números deben estar entre 0 y 100.");
                }

                int mayor = Math.max(numero1, numero2);
                int menor = Math.min(numero1, numero2);

                if (menor == 0) {
                    throw new ArithmeticException("No se puede dividir por cero.");
                }

                int division = mayor / menor;
                int resto = mayor % menor;

                JOptionPane.showMessageDialog(this,
                        "El resultado de la división es: " + division +
                        "\nEl resto es: " + resto);

            } catch (FueraDeRangoException ex) {
                JOptionPane.showMessageDialog(this, "⚠️ Error: " + ex.getMessage());
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(this, "⚠️ Error aritmético: " + ex.getMessage());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "⚠️ Debe ingresar números válidos.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "⚠️ Ocurrió un error: " + ex.getClass().getName() + "\nMensaje: " + ex.getMessage());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio3();
    }
}

// Clase personalizada de excepción
class FueraDeRangoException extends Exception {
    public FueraDeRangoException(String mensaje) {
        super(mensaje);
    }
}

