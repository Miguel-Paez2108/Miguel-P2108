public class Taller_6_EJ_3 {
    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.setNumero(10);
        Prueba.metodoStaticIncorrecto(); // Generará error si intenta acceder a un atributo no estático
    }
}

class Prueba {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método estático tratando de acceder a un atributo de instancia (ERROR)
    public static void metodoStaticIncorrecto() {
        // System.out.println("Número: " + numero); // ERROR: no se puede acceder a una variable de instancia desde un método estático
        System.out.println("Error: Un método estático no puede acceder a atributos no estáticos");
    }
}
