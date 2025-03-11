public class Taller_1_EJ_1 {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto
    public Taller_1_EJ_1() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.numeroPaginas = 100;
    }

    // Constructor parametrizado
    public Taller_1_EJ_1(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar detalles
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas;
    }

    public static void main(String[] args) {
        Taller_1_EJ_1 libro1 = new Taller_1_EJ_1();
        Taller_1_EJ_1 libro2 = new Taller_1_EJ_1("Cien años de soledad", "Gabriel García Márquez", 417);

        System.out.println(libro1);
        System.out.println(libro2);
    }
}
