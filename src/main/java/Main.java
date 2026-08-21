
/**
 * Punto de entrada de la aplicación. Crea un ticket de ejemplo con un cliente,
 * un camarero y varios productos, le aplica un descuento y lo muestra por pantalla.
 *
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */

public class Main {
    /**
     * Ejecuta el programa de demostración de la cafetería.
     *
     * @param args argumentos de línea de comandos; no se utilizan
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana López", "652345678");
        Camarero camarero1 = new Camarero("Carlos", "C01");
        Bebida cafe = new Bebida("Café", 1.80, "calientes", "grande");
        Bebida zumo = new Bebida("Zumo", 2.20, "frías", "mediano");
        Comida bocadillo = new Comida("Bocadillo jamón", 3.50, "bocadillos", false, "montadito");
        Ticket ticket1 = new Ticket(cliente1, camarero1);
        ticket1.agregarProducto(cafe);
        ticket1.agregarProducto(zumo);
        ticket1.agregarProducto(bocadillo);
        int porcentajeDescuento = 10;

        ticket1.aplicarDescuentoProducto(cafe, porcentajeDescuento);

        System.out.println(ticket1.mostrarTicket());

        Descontable cafeDescontable = cafe;
        double ahorro = cafe.getPrecio() - cafeDescontable.aplicarDescuento(porcentajeDescuento);

        System.out.println("\nSe ha ahorrado " + String.format("%.2f", ahorro)
                + " € en el " + cafe.getNombre() + ".");


    }
}
