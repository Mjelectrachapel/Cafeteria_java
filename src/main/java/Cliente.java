/**
 * Esta clase representa cualquier cliente que sea atendido en la cafetería
 *
 * @author María Jesús Ruiz Redondo
 * @version 1.0
 */

public class Cliente {

    private String nombre;
    private String telefono;

    /**
     * Constructor: Registra un cliente nuevo
     *
     * @param nombre   nombre del cliente
     * @param telefono teléfono de contacto del cliente, sirve como identificador
     */

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    /**
     * Devuelve la información del cliente
     *
     * @return texto con nombre y teléfono del cliente
     */

    public String mostrarInfo() {

        return nombre + " -- Teléfono: " + telefono;
    }
}
