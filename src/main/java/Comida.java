/**
 * Esta clase representa una comida de la cafetería.
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

    // Getters y setters


    public boolean isEsCaliente() {
        return esCaliente;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    public String getRacion() {
        return racion;
    }

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