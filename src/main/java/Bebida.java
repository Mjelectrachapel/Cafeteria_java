
/**
 * Esta clase representa una bebida de la cafetería.
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */
public class Bebida extends Producto {

    private String tamanio;

    /**
     * Constructor: Crea una nueva bebida.
     * @param nombre nombre de la bebida
     * @param precio precio en euros
     * @param categoria categoría a la que pertenece
     * @param tamanio tamaño de la bebida (pequeño, mediano, grande)
     */

    public Bebida(String nombre, double precio, String categoria, String tamanio) {
        super(nombre, precio, categoria);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    /**
     * Devuelve la información de la bebida, incluyendo su tamaño.
     * @return texto con los datos del producto y el tamaño
     */

    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + " -- Tamaño: " + tamanio;

    }
}
