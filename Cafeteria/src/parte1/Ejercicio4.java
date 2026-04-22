package parte1;

public class Ejercicio4 {
    public static void main(String[] args) {
        int inventario = 50;
        int pedido = 2;
        while(inventario > 40){
            inventario = inventario - pedido;
            System.out.println("Inventario Restante: "+inventario);

        }
    }
}
