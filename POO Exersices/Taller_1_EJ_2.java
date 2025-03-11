public class Taller_1_EJ_2 {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public Taller_1_EJ_2() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // Constructor con dos parámetros
    public Taller_1_EJ_2(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor con tres parámetros
    public Taller_1_EJ_2(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para mostrar detalles
    public String toString() {
        return "Cuenta: " + numeroCuenta + " | Saldo: $" + saldo + " | Tipo: " + tipoCuenta;
    }

    public static void main(String[] args) {
        Taller_1_EJ_2 cuenta1 = new Taller_1_EJ_2();
        Taller_1_EJ_2 cuenta2 = new Taller_1_EJ_2("123456", "Corriente");
        Taller_1_EJ_2 cuenta3 = new Taller_1_EJ_2("789101", 2500.75, "Ahorros");

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
}
