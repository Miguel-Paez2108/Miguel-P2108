abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}

class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}

class Vendedor extends Empleado {
    private double comision;
    private int ventas;

    public Vendedor(String nombre, double salarioBase, double comision, int ventas) {
        super(nombre, salarioBase);
        this.comision = comision;
        this.ventas = ventas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (comision * ventas);
    }
}

public class Taller_7_EJ_2 {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos", 3000, 1000);
        Empleado vendedor = new Vendedor("Ana", 1500, 50, 20);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
