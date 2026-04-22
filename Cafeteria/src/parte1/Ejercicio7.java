package parte1;

public class Ejercicio7 {
    public static void main(String[] args) {
        int cantidadVendida = 5;//1
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario; //2
        boolean aplicaDescuento = (total > 20000);
        if (aplicaDescuento == true)/*3*/ {
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total);
    }
}
