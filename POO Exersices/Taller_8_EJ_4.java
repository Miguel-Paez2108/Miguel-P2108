class ClaseBase {
    private int atributoPrivado = 10;

    public int getAtributoPrivado() {
        return atributoPrivado;
    }
}

class ClaseDerivada extends ClaseBase {
    public void mostrarAtributo() {
        // System.out.println("Atributo privado: " + atributoPrivado); // ERROR
        System.out.println("Atributo privado (acceso a través de método): " + getAtributoPrivado());
    }
}

public class Taller_8_EJ_4 {
    public static void main(String[] args) {
        ClaseDerivada obj = new ClaseDerivada();
        obj.mostrarAtributo();
    }
}
