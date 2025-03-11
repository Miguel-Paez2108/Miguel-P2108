// Clase base Vehiculo
class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase derivada Bicicleta
class Bicicleta extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("La bicicleta se está moviendo pedaleando.");
    }
}

// Clase de prueba
public class Taller_3_EJ_5 {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        Vehiculo b = new Bicicleta();

        v.moverse();
        b.moverse();
    }
}
