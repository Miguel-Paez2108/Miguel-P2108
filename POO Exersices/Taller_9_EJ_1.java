// Taller_9_EJ_1: Clase Ave con Interfaces Volador y Cantante

// Definiendo las interfaces
interface Volador {
    void volar();
}

interface Cantante {
    void cantar();
}

// Implementación de la clase Ave
class Ave implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("El ave está volando.");
    }
    
    @Override
    public void cantar() {
        System.out.println("El ave está cantando.");
    }
}

// Clase de prueba para instanciar un objeto de Ave
public class Taller_9_EJ_1 {
    public static void main(String[] args) {
        Ave miAve = new Ave();
        miAve.volar();
        miAve.cantar();
    }
}


// Taller_9_EJ_3: Implementación Incorrecta de Múltiples Interfaces

// Intentando implementar una interfaz sin definir sus métodos
interface Incorrecta {
    void metodoObligatorio();
}

// Esta clase generará un error de compilación porque no implementa el método obligatorio
// class ClaseIncorrecta implements Incorrecta {
// }

// Implementando interfaces en una clase sin relación lógica
class Automovil implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("El automóvil no debería volar, esto es ilógico.");
    }
    
    @Override
    public void cantar() {
        System.out.println("El automóvil no canta, esto es una mala práctica.");
    }
}

