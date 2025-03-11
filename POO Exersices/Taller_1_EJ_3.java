public class Taller_1_EJ_3 {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Taller_1_EJ_3() {
        this("Desconocido", 18, "Sin asignar");
    }

    // Constructor con dos parámetros
    public Taller_1_EJ_3(String nombre, int edad) {
        this(nombre, edad, "General");
    }

    // Constructor con tres parámetros usando this()
    public Taller_1_EJ_3(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    // Método para mostrar detalles
    public String toString() {
        return "Estudiante: " + nombre + " | Edad: " + edad + " | Curso: " + curso;
    }

    public static void main(String[] args) {
        Taller_1_EJ_3 estudiante1 = new Taller_1_EJ_3();
        Taller_1_EJ_3 estudiante2 = new Taller_1_EJ_3("Carlos", 21);
        Taller_1_EJ_3 estudiante3 = new Taller_1_EJ_3("María", 19, "Matemáticas");

        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
    }
}
