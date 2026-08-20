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
    private double[] descuentos;

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
        this.descuentos = new double[productos.length];


    }

    /**
     * Añade un producto al ticket, en la primera posición libre del array.
     * El producto entra sin aplicar ningún descuento, para rebajarlo hay que usar
     * * {@link #aplicarDescuentoProducto(Producto, double)}.
     * Si el ticket ya ha alcanzado su capacidad máxima el producto no se añade
     * y se muestra un aviso por pantalla.
     *
     * @param producto producto que se quiere añadir; puede ser cualquier subclase
     *                 de Producto, como Bebida o Comida
     */
    public void agregarProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            descuentos[contadorProductos] = 0;
            contadorProductos += 1;
        } else {
            System.out.println("Ha introducido demasiados productos para este ticket.");
        }

    }

    /**
     * Aplica un porcentaje de descuento a un producto concreto del ticket.
     * El precio del producto no se modifica: el descuento queda registrado en el
     * ticket y se refleja al calcular el total. Si el producto no forma parte del
     * ticket se muestra un aviso y no se aplica nada.
     *
     * @param producto   producto del ticket al que se le aplica el descuento
     * @param porcentaje porcentaje de descuento a aplicar (de 0 a 100)
     */

    public void aplicarDescuentoProducto(Producto producto, double porcentaje) {
        for (int i = 0; i < contadorProductos; i++) {
            if (productos[i] == producto) {
                descuentos[i] = porcentaje;
            }
            return;

        }
        System.out.println("El producto indicado no está en el ticket");
    }

    /**
     * Calcula el importe total del ticket, aplicando a cada producto el descuento
     * que tenga registrado en este ticket.
     *
     * @return la suma de los precios ya rebajados, o 0 si el ticket está vacío
     */

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {

            total += productos[i].aplicarDescuento(descuentos[i]);

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
            texto += (i + 1) + ". " + productos[i].mostrarInfo();

            if (descuentos[i] > 0){
                texto += " -- Descuento " + String.format("%.0f", descuentos[i]) + "% -> "
                        + String.format("%.2f", productos[i].aplicarDescuento(descuentos[i])) + " €";

            }
            texto += "\n";
        }
        texto += "\nTotal: " + String.format("%.2f", calcularTotal()) + " €";

        return texto;
    }

}
