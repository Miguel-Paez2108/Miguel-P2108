public class Taller_6_EJ_1 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Focus");

        Coche.mostrarContadorCoches();
    }
}

class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0; // Atributo estático

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Se incrementa cada vez que se crea un objeto
    }

    public static void mostrarContadorCoches() {
        System.out.println("Número total de coches creados: " + contadorCoches);
    }
}
