// Clase Empleado con nombre público y salario con encapsulación
class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }
}

// Clase de prueba
public class Taller_4_EJ_4 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 3000);
        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Salario: " + empleado.getSalario());
        
        empleado.setSalario(3500);
        System.out.println("Nuevo Salario: " + empleado.getSalario());
    }
}
