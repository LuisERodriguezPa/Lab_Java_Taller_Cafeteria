package parte1;

public class Ejercicio2 {
    public static void main(String[] args) {
        int descuento = 15;
        int subtotal = 42500;
        double totalAPagar;
        double valorDelDescuento;
        boolean tieneDescuento = false;
        if(subtotal > 30000){
            tieneDescuento = true;
        }
        valorDelDescuento = subtotal * 0.15;
        totalAPagar = subtotal - valorDelDescuento;
        System.out.printf("Tiene derecho a descuento: %b",tieneDescuento);
        System.out.println();
        System.out.printf("El valor del descuento es %d",descuento);
        System.out.println();
        System.out.printf("El total a pagar es %.2f",totalAPagar);
    }
}
