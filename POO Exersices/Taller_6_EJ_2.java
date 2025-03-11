public class Taller_6_EJ_2 {
    public static void main(String[] args) {
        System.out.println("Suma: " + Matematicas.sumar(5, 3));
        System.out.println("Resta: " + Matematicas.restar(10, 4));
        System.out.println("Multiplicación: " + Matematicas.multiplicar(6, 7));
        System.out.println("División: " + Matematicas.dividir(20, 4));
    }
}

class Matematicas {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }
        return a / b;
    }
}
