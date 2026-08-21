/**
 * Esta clase representa cualquier camarero que trabaje en la cafetería.
 *
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */

public class Camarero {

    private String nombre;
    private String codigoEmpleado;

    /**
     * Constructor: Registra un empleado nuevo
     *
     * @param nombre         nombre del camarero
     * @param codigoEmpleado código único identificativo de cada empleado
     */

    public Camarero(String nombre, String codigoEmpleado) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }


    /**
     * Devuelve el nombre del camarero.
     * @return el nombre del camarero
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del camarero.
     * @param nombre el nombre nuevo del camarero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Cambia el código del empleado.
     * @param codigoEmpleado nuevo código del empleado
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Devuelve el código del empleado
     * @return código del empleado
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Devuelve la información del camarero.
     *
     * @return texto con nombre y código de empleado
     */

    public String mostrarInfo() {

        return nombre + " -- Código de empleado: " + codigoEmpleado;
    }
}
