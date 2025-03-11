// Clase base con método final
class Animal {
    public final void sonido() {
        System.out.println("Este animal hace un sonido.");
    }
}

// Clase derivada intentando sobrescribir un método final (provocará error)
class Perro extends Animal {
    // @Override  // Esto causará un error de compilación
    public void sonido() {
        System.out.println("El perro ladra.");
    }
}

// Clase de prueba
public class Taller_3_EJ_6 {
    public static void main(String[] args) {
        Perro p = new Perro();
        p.sonido();
    }
}
