/**
 * Clase que representa una factura y permite calcular descuentos y precios totales.
 * Incluye métodos para mostrar la factura de un cliente.
 */
public class Factura {

    /**
     * Calcula el descuento aplicable según la cantidad.
     * @param total El total sin descuento.
     * @param cantidad La cantidad de productos.
     * @return El monto de descuento.
     */
    public static double calcularDescuento(double total, int cantidad) {
        if (cantidad > 10) {
            return total * 0.1;
        }
        return 0;
    }

    /**
     * Calcula el precio total a pagar aplicando el descuento correspondiente.
     * @param precioUnitario Precio por unidad.
     * @param cantidad Cantidad de unidades.
     * @return Precio total con descuento aplicado.
     */
    public static double calcularPrecioTotal(double precioUnitario, int cantidad) {
        double total = precioUnitario * cantidad;
        double descuento = calcularDescuento(total, cantidad);
        return total - descuento;
    }

    /**
     * Muestra la factura en consola con el nombre del cliente, cantidad,
     * precio unitario y total a pagar.
     * @param nombreCliente Nombre del cliente.
     * @param precioUnitario Precio por unidad.
     * @param cantidad Cantidad de productos.
     */
    public static void mostrarFactura(String nombreCliente, double precioUnitario, int cantidad) {
        double total = calcularPrecioTotal(precioUnitario, cantidad);

        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Total a pagar: " + total);
    }

    /**
     * Método principal para ejecutar la clase y mostrar un ejemplo de factura.
     * @param args Argumentos de línea de comandos (no usados).
     */
    public static void main(String[] args) {
        mostrarFactura("Juan", 15.0, 12);
    }
}