abstract class PruebaAbstracta {
    public abstract void metodoAbstracto();

    // Método concreto en clase abstracta
    public void metodoConcreto() {
        System.out.println("Este es un método concreto en una clase abstracta.");
    }
}

public class Taller_7_EJ_3 {
    public static void main(String[] args) {
        // Intento incorrecto de instanciar una clase abstracta
        // PruebaAbstracta obj = new PruebaAbstracta();  // ERROR

        System.out.println("No se puede instanciar una clase abstracta directamente.");
    }
}
