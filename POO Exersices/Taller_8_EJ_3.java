class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}

class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}

public class Taller_8_EJ_3 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 3000);
        Gerente gerente = new Gerente("Ana", 5000, "Ventas");

        empleado.mostrarDetalles();
        System.out.println();
        gerente.mostrarDetalles();
    }
}
