// Clase Producto con acceso de paquete (default)
class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio + ", Stock: " + stock);
    }
}

// Clase de prueba dentro del mismo paquete
public class Taller_3_EJ_1 {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 1500.00, 5);
        p.mostrarInfo();
    }
}
