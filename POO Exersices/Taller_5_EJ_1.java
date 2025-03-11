// Clase Empleado con propiedades protected
class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}

// Clase Gerente que hereda de Empleado
class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
}

// Clase de prueba
public class Taller_5_EJ_1 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 5000, "Ventas");
        gerente.mostrarInformacion();
    }
}
