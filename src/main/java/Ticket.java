/**
 * Esta clase representa un ticket que se imprime en la cafetería
 *
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */

public class Ticket {

    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private int contadorProductos;

    /**
     * Constructor: Crea un ticket nuevo vacío y con capacidad para 10 productos
     *
     * @param cliente  persona a la que se atiende en la cafetería
     * @param camarero empleado que está atendiendo
     */
    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[10];
        this.contadorProductos = 0;

    }

    /**
     * Añade un producto al ticket, en la primera posición libre del array.
     * Si el ticket ya ha alcanzado su capacidad máxima el producto no se añade
     * y se muestra un aviso por pantalla.
     *
     * @param producto producto que se quiere añadir; puede ser cualquier subclase
     *                 de Producto, como Bebida o Comida
     */
    public void agregarProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos += 1;
        } else {
            System.out.println("Ha introducido demasiados productos para este ticket.");
        }

    }

    /**
     * Calcula el importe total del ticket sumando el precio de todos los productos.
     *
     * @return la suma de los precios de los productos añadidos, o 0 si el ticket está vacío
     */
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();

        }

        return total;
    }

    /**
     * Genera el detalle completo del ticket: cliente, camarero, productos y total.
     *
     * @return texto del ticket listo para imprimir
     */

    public String mostrarTicket() {
        String texto = "----- CAFETERÍA JAVA ----- \n\n";
        texto += "Cliente: " + cliente.mostrarInfo() + "\n";
        texto += "Camarero: " + camarero.mostrarInfo() + "\n\n";
        texto += "Consumición:\n";

        for (int i = 0; i < contadorProductos; i++) {
            texto += (i + 1) + ". " + productos[i].mostrarInfo() + "\n";
        }
        texto += "\nTotal: " + calcularTotal() + " €";

        return texto;
    }

}
