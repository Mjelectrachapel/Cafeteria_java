import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias de la clase Ticket.
 *
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */
class TicketTest {

    private Ticket ticket;
    private Producto cafe;
    private Producto zumo;
    private Producto bocadillo;

    /**
     * Crea un ticket nuevo antes de cada test
     */
    @BeforeEach
    void inicializar() {
        Cliente cliente = new Cliente("Ana López", "652345678");
        Camarero camarero = new Camarero("Carlos", "C01");
        ticket = new Ticket(cliente, camarero);

        cafe = new Bebida("Café", 1.80, "calientes", "grande");
        zumo = new Bebida("Zumo", 2.20, "frías", "mediano");
        bocadillo = new Comida("Bocadillo", 3.50, "bocadillos", false, "montadito");

    }

    /**
     * Elimina ese producto después de cada test
     */
    @AfterEach
    void limpiar() {
        ticket = null;
    }

    /**
     * Caso: El ticket está vacío y el total no suma nada, devuelve 0.
     */
    @Test
    void calcularTotalTicketVacioDevuelveCero() {
        double total = ticket.calcularTotal();
        assertEquals(0.0, total, 0.001);

    }

    /**
     * Caso positivo: el total suma los precios de todos los productos añadidos.
     */
    @Test
    void calcularTotalTicketTresProductosSumaSusPrecios() {
        ticket.agregarProducto(cafe);
        ticket.agregarProducto(zumo);
        ticket.agregarProducto(bocadillo);

        double total = ticket.calcularTotal();

        assertEquals(7.50, total, 0.001);

    }

    /**
     * Caso positivo: el total suma los precios de todos los productos añadidos y a uno de ellos le aplica el descuento
     * que queda reflejado en el total.
     */

    @Test
    void calcularTotalTicketConDescuentoElTotalReflejaRebaja() {
        ticket.agregarProducto(cafe);
        ticket.agregarProducto(zumo);
        ticket.agregarProducto(bocadillo);
        ticket.aplicarDescuentoProducto(cafe, 10);

        double total = ticket.calcularTotal();

        assertEquals(7.32, total, 0.001);

    }

    /**
     * Caso negativo: Se aplica el descuento a un producto que no está en el ticket,
     * el total es el mismo que sin descuentos.
     */

    @Test
    void calcularTotalDescuentoEnProductoAusenteNoCambiaTotal() {

        ticket.agregarProducto(zumo);
        ticket.aplicarDescuentoProducto(cafe, 10);

        double total = ticket.calcularTotal();

        assertEquals(2.2, total, 0.001);


    }
}