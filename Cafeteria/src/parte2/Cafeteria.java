package parte2;

public class Cafeteria {
    public static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida,P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido
        double subtotal;
        for(int i=0; i<6; i++){
            System.out.println("Numero de pedido: "+(i+1));
            System.out.println("Nombre del producto: "+nombres[pedidoProducto[i]]);
            System.out.println("Cantidad: "+pedidoCantidad[i]);
            System.out.println("Categoria: "+categorias[i]);
            switch (categorias[i]){
                case 'B':
                    System.out.println("Bebida Caliente");
                    break;
                case 'F':
                    System.out.println("Fria");
                    break;
                case 'C':
                    System.out.println("Comida");
                    break;
                case 'P':
                    System.out.println("Postre");
                    break;
            }
             subtotal = pedidoCantidad[i] * precios[pedidoProducto[i]];
            System.out.println("Subtotal: "+subtotal);

        }
    }
}
