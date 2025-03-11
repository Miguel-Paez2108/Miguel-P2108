// Implementación incorrecta con protected
class Banco {
    protected double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }
}

// Implementación correcta con encapsulamiento
class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}

// Clase de prueba
public class Taller_5_EJ_3 {
    public static void main(String[] args) {
        BancoSeguro cuenta = new BancoSeguro(1000);
        cuenta.depositar(500);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        cuenta.retirar(300);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
    }
}
