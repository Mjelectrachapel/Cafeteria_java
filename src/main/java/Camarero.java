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

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

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
