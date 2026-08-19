/**
 * Contrato para los productos a los que se les puede aplicar un descuento.
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */

public interface Descontable {

    /**
     * Calcula el precio del producto tras aplicar un descuento.
     *
     * @param porcentaje porcentaje de descuento a aplicar (de 0 a 100)
     * @return el precio ya rebajado
     */

    double aplicarDescuento(double porcentaje);

}
