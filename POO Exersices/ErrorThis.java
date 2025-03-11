public class ErrorThis {
    private String mensaje = "Hola, soy un mensaje";

    public static void mostrarMensaje() {
        // Esto generará un error porque `this` no puede ser usado en un método estático
        System.out.println(this.mensaje);
    }

    public static void main(String[] args) {
        mostrarMensaje(); // Provocará un error
    }
}
