// Clase Persona con atributos private y default
class Persona {
    private String nombre;
    int edad; // Acceso de paquete

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

// Clase de prueba en el mismo paquete
public class Taller_3_EJ_3 {
    public static void main(String[] args) {
        Persona p = new Persona();
        
        // Acceso permitido
        p.edad = 25;

        // Intento de acceso directo a "nombre" (provocará error si se descomenta)
        // p.nombre = "Juan";
        
        p.setNombre("Juan");
        System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.edad);
    }
}
