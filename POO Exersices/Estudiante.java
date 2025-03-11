public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Desconocido", 18); // Llama al otro constructor con valores predeterminados
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Carlos", 21);

        e1.mostrarEstudiante();
        e2.mostrarEstudiante();
    }
}
