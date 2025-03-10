import java.util.*;

// Clase Cliente
class Cliente {
    private String nombre;
    private String apellidos;
    private String NIF;
    private String direccion;
    private List<LineaTelefonica> lineas = new ArrayList<>();

    public Cliente(String nombre, String apellidos, String NIF, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = direccion;
    }

    public void agregarLinea(LineaTelefonica linea) {
        lineas.add(linea);
    }

    public List<LineaTelefonica> getLineas() {
        return lineas;
    }
}

// Clase LineaTelefonica
class LineaTelefonica {
    private String numeroTelefono;
    private TipoLinea tipo;
    private Cliente cliente;
    private List<ServicioAdicional> servicios = new ArrayList<>();
    private List<Llamada> llamadas = new ArrayList<>();

    public LineaTelefonica(String numeroTelefono, TipoLinea tipo, Cliente cliente) {
        this.numeroTelefono = numeroTelefono;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public void agregarServicio(ServicioAdicional servicio) {
        servicios.add(servicio);
    }

    public void registrarLlamada(Llamada llamada) {
        llamadas.add(llamada);
    }

    public List<Llamada> getLlamadas() {
        return llamadas;
    }
}

// Enum TipoLinea
enum TipoLinea {
    BASICA, ADSL, RDSI
}

// Clase ServicioAdicional
class ServicioAdicional {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double costo;

    public ServicioAdicional(String codigo, String nombre, String descripcion, double costo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
}

// Clase Llamada
class Llamada {
    private String numeroDestino;
    private Date fecha;
    private int duracion;
    private double costo;
    private AmbitoLlamada ambito;

    public Llamada(String numeroDestino, Date fecha, int duracion, double costo, AmbitoLlamada ambito) {
        this.numeroDestino = numeroDestino;
        this.fecha = fecha;
        this.duracion = duracion;
        this.costo = costo;
        this.ambito = ambito;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getCosto() {
        return costo;
    }
}

// Enum AmbitoLlamada
enum AmbitoLlamada {
    PROVINCIAL, INTERPROVINCIAL, INTERNACIONAL
}

// Clase Facturacion
class Facturacion {
    public double calcularCosto(Llamada llamada, PlanDescuento descuento) {
        double costoBase = llamada.getDuracion() * llamada.getCosto();
        return costoBase * (1 - descuento.getDescuento());
    }
}

// Clase PlanDescuento
class PlanDescuento {
    private double descuento;

    public PlanDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}

// Clase Factura
class Factura {
    private Cliente cliente;
    private double total;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.total = 0;
    }

    public void calcularTotal(Facturacion facturacion, PlanDescuento descuento) {
        for (LineaTelefonica linea : cliente.getLineas()) {
            for (Llamada llamada : linea.getLlamadas()) {
                total += facturacion.calcularCosto(llamada, descuento);
            }
        }
    }

    public double getTotal() {
        return total;
    }
}

// Clase Principal (Main)
public class Exersice_37 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("José", "Páez", "12345678X", "Cartagena");
        LineaTelefonica linea1 = new LineaTelefonica("3001234567", TipoLinea.BASICA, cliente1);
        cliente1.agregarLinea(linea1);

        Llamada llamada1 = new Llamada("3109876543", new Date(), 10, 0.5, AmbitoLlamada.PROVINCIAL);
        linea1.registrarLlamada(llamada1);

        PlanDescuento plan = new PlanDescuento(0.1); // 10% de descuento
        Facturacion facturacion = new Facturacion();
        Factura factura = new Factura(cliente1);
        
        factura.calcularTotal(facturacion, plan);
        System.out.println("El total de la factura es: $" + factura.getTotal());
    }
}

