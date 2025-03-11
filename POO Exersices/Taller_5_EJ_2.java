// Clase Vehículo con propiedades protected
class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca);
    }
}

// Subclase Moto que hereda de Vehículo
class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}

// Clase de prueba
public class Taller_5_EJ_2 {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Motocicleta", "Yamaha", 150);
        miMoto.mostrarInformacion();
    }
}
