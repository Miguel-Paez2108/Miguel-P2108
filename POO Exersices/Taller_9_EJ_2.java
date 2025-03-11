// Taller_9_EJ_2: Clase Pez con Interfaces Nadador y Respirador

// Definiendo las interfaces
interface Nadador {
    void nadar();
}

interface Respirador {
    void respirar();
}

// Implementación de la clase Pez
class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }
    
    @Override
    public void respirar() {
        System.out.println("El pez está respirando bajo el agua.");
    }
}

// Clase de prueba para instanciar un objeto de Pez
public class Taller_9_EJ_2 {
    public static void main(String[] args) {
        Pez miPez = new Pez();
        miPez.nadar();
        miPez.respirar();
    }
}
