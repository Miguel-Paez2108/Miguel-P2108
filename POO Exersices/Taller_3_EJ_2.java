// Paquete vehiculos (simulado, no es necesario declararlo en un solo archivo)
class Vehiculo {
    String tipo; // Acceso de paquete (default)

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}

// Paquete vehiculos (simulado, herencia)
class Moto extends Vehiculo {
    public Moto(String tipo) {
        super(tipo);
    }

    public void acelerar() {
        System.out.println("La moto está acelerando.");
    }
}

// Paquete prueba (simulado)
public class Taller_3_EJ_2 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Automóvil");
        Moto moto = new Moto("Motocicleta");

        vehiculo.mostrarTipo();
        moto.mostrarTipo();
        moto.acelerar();
        
        // Intentar acceder a los miembros de Vehiculo y Moto
        // System.out.println(moto.tipo); // Descomentar esto dará error si se accede desde otro paquete
    }
}
