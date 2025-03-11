// Clase con acceso incorrecto a una propiedad privada
class PruebaPrivada {
    private int datoPrivado = 10;
}

// Clase de prueba que intenta acceder directamente (provocará error)
public class Taller_4_EJ_3 {
    public static void main(String[] args) {
        PruebaPrivada obj = new PruebaPrivada();
        
        // Intento de acceso directo (provocará error de compilación)
        // System.out.println(obj.datoPrivado);
    }
}
