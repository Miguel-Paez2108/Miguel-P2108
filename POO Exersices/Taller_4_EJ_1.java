// Clase Estudiante con propiedades privadas y métodos get/set con validaciones
class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor a 0.");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 5) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("La nota debe estar entre 0 y 5.");
        }
    }
}

// Clase de prueba
public class Taller_4_EJ_1 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos", 16, 4.5);
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());
    }
}
