// Clase Utilidades con métodos públicos para operaciones matemáticas
class Utilidades {
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
    }
}

// Clase de prueba
public class Taller_4_EJ_6 {
    public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.suma(10, 5));
        System.out.println("Resta: " + Utilidades.resta(10, 5));
        System.out.println("Multiplicación: " + Utilidades.multiplicacion(10, 5));
        System.out.println("División: " + Utilidades.division(10, 5));
    }
}
