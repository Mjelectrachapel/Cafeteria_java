/**
 * Esta clase representa cualquier producto genérico de la cafetería.
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */

public class Producto {

    private String nombre;
    private double precio;
    private String categoria;

    /**
     * Constructor: Crea un producto nuevo
     * @param nombre nombre del producto
     * @param precio precio en euros
     * @param categoria categoría a la que pertenece
     */

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    //Getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Devuelve la información del producto por pantalla, para que se pueda leer.
     * @return texto con nombre, categoría y precio
     */

    public String mostrarInfo(){
        return nombre + "(" + categoria + ") -- " + precio + " €";
    }

}