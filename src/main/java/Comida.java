/**
 * Esta clase representa una comida de la cafetería.
 *
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */
public class Comida extends Producto {

    private boolean esCaliente;
    private String racion;

    /**
     * Constructor: Crea una nueva comida.
     *
     * @param nombre     nombre de la comida
     * @param precio     precio en euros
     * @param categoria  categoría a la que pertenece
     * @param esCaliente indica si la comida es un plato caliente o no
     * @param racion     tamaño de la comida (tapa, media ración, entera)
     */
    public Comida(String nombre, double precio, String categoria, boolean esCaliente, String racion) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
        this.racion = racion;
    }

    /**
     * Devuelve si la comida se sirve caliente.
     *
     * @return {@code true} si es caliente, {@code false} si es fría
     */
    public boolean isEsCaliente() {
        return esCaliente;
    }

    /**
     * Devuelve si la comida se sirve caliente.
     *
     * @param esCaliente {@code true} si es caliente, {@code false} si es fría
     */
    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }
    /**
     * Devuelve el tamaño de la ración.
     * @return el tamaño de la ración (tapa, media ración, entera)
     */
    public String getRacion() {
        return racion;
    }
    /**
     * Cambia el tamaño de la ración.
     * @param racion el nuevo tamaño de la ración (tapa, media ración, entera)
     */
    public void setRacion(String racion) {
        this.racion = racion;
    }

    /**
     * Devuelve la información de la comida, incluyendo si es caliente o no y el tamaño.
     *
     * @return texto con los datos del producto, tamaño y si es caliente.
     */

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " -- Tamaño: " + racion + " -- Caliente: " + (esCaliente ? "Sí" : "No");
    }

}