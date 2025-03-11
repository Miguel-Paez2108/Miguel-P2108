// Clase Coche con propiedades privadas y método para acelerar
class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("Nueva velocidad máxima: " + velocidadMaxima);
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }
}

// Clase de prueba
public class Taller_4_EJ_2 {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180);
        
        // Intento de acceso directo (provocará error si se descomenta)
        // System.out.println(coche.velocidadMaxima);
        
        coche.acelerar(20);
    }
}
