// Clase base Persona
class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

// Clase derivada Estudiante
class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }
}

// Clase derivada Profesor
class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor.");
    }
}

// Clase de prueba
public class Taller_3_EJ_4 {
    public static void main(String[] args) {
        Persona p = new Persona();
        Persona e = new Estudiante();
        Persona prof = new Profesor();

        p.presentarse();
        e.presentarse();
        prof.presentarse();
    }
}

