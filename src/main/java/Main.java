public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana López", "652345678");
        Camarero camarero1 = new Camarero("Carlos", "C01");
        Bebida cafe = new Bebida("Café", 1.80, "calientes", "grande");
        Bebida zumo = new Bebida("Zumo", 2.20, "frías", "mediano");
        Comida bocadillo = new Comida("Bocadillo jamón", 3.50, "bocadillos", false, "montadito");
        Ticket ticket1 = new Ticket(cliente1, camarero1);
        ticket1.agregarProducto(cafe);
        ticket1.agregarProducto(zumo);
        ticket1.agregarProducto(bocadillo);
        System.out.println(ticket1.mostrarTicket());

        Descontable cafeDescontable = cafe;
        int porcentajeDescuento = 10;
        double precioFinal = cafeDescontable.aplicarDescuento(porcentajeDescuento);

        System.out.println("Descuento aplicado al " + cafe.getNombre() + ": " + porcentajeDescuento + "%");
        System.out.println("Precio original: " + String.format("%.2f", cafe.getPrecio()) + " €");
        System.out.println("Precio final: " + String.format("%.2f", precioFinal) + " €");


    }
}
