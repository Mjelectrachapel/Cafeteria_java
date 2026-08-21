/**
 * Esta clase representa cualquier producto genérico de la cafetería.
 *
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */

public class Producto implements Descontable {

    private String nombre;
    private double precio;
    private String categoria;

    /**
     * Constructor: Crea un producto nuevo
     *
     * @param nombre    nombre del producto
     * @param precio    precio en euros
     * @param categoria categoría a la que pertenece
     */

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Devuelve el nombre del producto.
     *
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del producto.
     *
     * @param nombre el nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return el precio en euros
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Cambia el precio del producto.
     *
     * @param precio el nuevo precio en euros
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la categoría del producto.
     *
     * @return la categoría a la que pertenece el producto
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Cambia la categoría del producto.
     *
     * @param categoria la nueva categoría del producto
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Devuelve la información del producto.
     *
     * @return texto con nombre, categoría y precio
     */

    public String mostrarInfo() {

        return nombre + " (" + categoria + ") -- " + String.format("%.2f", precio) + " €";
    }

    /**
     * Calcula el precio del producto tras aplicar un descuento.
     * Si el porcentaje no está entre 0 y 100 se considera inválido: genera
     * un aviso y devuelve el precio original sin modificar.
     *
     * @param porcentaje porcentaje de descuento a aplicar (de 0 a 100)
     * @return el precio rebajado, o el precio original si el porcentaje no es válido
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        if (porcentaje > 100 || porcentaje < 0) {
            System.out.println("Porcentaje no válido: " + porcentaje + "%. Se mantiene el precio original.");
            return precio;
        }

        return precio - (precio * porcentaje / 100);

    }

}