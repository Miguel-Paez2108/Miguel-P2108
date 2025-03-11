class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Matrícula: " + matricula);
    }
}

public class Taller_8_EJ_2 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 20, "A12345");
        estudiante.mostrarInfo();
    }
}
