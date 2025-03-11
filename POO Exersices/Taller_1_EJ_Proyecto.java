import java.util.Scanner;

public class Taller_1_EJ_Proyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de un Libro
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea
        Taller_1_EJ_1 libro = new Taller_1_EJ_1(titulo, autor, paginas);

        // Creación de una Cuenta Bancaria
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir la línea
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        Taller_1_EJ_2 cuenta = new Taller_1_EJ_2(numeroCuenta, saldo, tipoCuenta);

        // Creación de un Estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea
        System.out.print("Ingrese el curso: ");
        String curso = scanner.nextLine();
        Taller_1_EJ_3 estudiante = new Taller_1_EJ_3(nombre, edad, curso);

        // Mostrar detalles de los objetos
        System.out.println("\nDetalles de los objetos creados:");
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

        scanner.close();
    }
}
