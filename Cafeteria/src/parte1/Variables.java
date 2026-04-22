package parte1;

public class Variables {
    public static void main(String[] args) {
        String nombreProducto = "Cafe express";
        float precioUnitario = 17500f;
        int cantidadInventario = 34;
        boolean disponible = true;
        char codigoProducto = 'C';
        String salidaNombre = String.format("Nombre del Productor %s", nombreProducto);
        System.out.println(salidaNombre);
        String salidaPrecioUNitario = String.format("Precio Unitario: %s",precioUnitario);
        System.out.println(salidaPrecioUNitario);
        String salidaCantidadInventario = String.format("Cantidad Inventario: %d",cantidadInventario);
        System.out.println(salidaCantidadInventario);
        String salidaDisponible = String.format("disponible: %b",disponible);
        System.out.println(salidaDisponible);
        String salidaCodigo = String.format("codigo del producto %c",codigoProducto);
        System.out.println(salidaCodigo);
    }
}
