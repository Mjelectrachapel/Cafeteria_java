import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias de la clase Producto
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */

class ProductoTest {

    private Producto cafe;
    /**
     * Crea un producto nuevo antes de cada test
     */
    @BeforeEach
    void inicializar(){
        cafe = new Producto("Café", 1.80,"calientes");
    }
    /**
     * Elimina ese producto después de cada test
     */
    @AfterEach
    void limpiar(){
        cafe = null;
    }

    /**
     * Caso positivo: un descuento válido devuelve el precio del producto rebajado
     */
    @Test
    void aplicarDescuentoValidoDevuelvePrecioRebajado(){
        double resultado = cafe.aplicarDescuento(10);
        assertEquals(1.62,resultado,0.001);
    }
    /**
     * Caso negativo: un descuento por encima del máximo avisa de que no es un descuento válido
     * y devuelve el precio original
     */
    @Test
    void aplicarDescuentoInvalidoPorEncimaDevuelvePrecioOriginal(){
        double resultado = cafe.aplicarDescuento(150);
        assertEquals(1.80,resultado,0.001);
    }
    /**
     * Caso negativo: un descuento por debajo del mínimo avisa de que no es un descuento válido
     * y devuelve el precio original
     */
    @Test
    void aplicarDescuentoInvalidoPorDebajoDevuelvePrecioOriginal(){
        double resultado = cafe.aplicarDescuento(-10);
        assertEquals(1.80,resultado,0.001);
    }


}