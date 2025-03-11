// Clase CuentaBancaria con encapsulamiento
class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + tipoCuenta + " - Saldo: " + saldo);
    }
}

// Clase de prueba
public class Taller_4_EJ_5 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", 5000, "Ahorros");
        cuenta.mostrarDetalles();

        // Intento de acceso directo a numeroCuenta (provocará error si se descomenta)
        // System.out.println(cuenta.numeroCuenta); 
    }
}
