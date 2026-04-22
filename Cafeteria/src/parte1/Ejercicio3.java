package parte1;

public class Ejercicio3 {
    public static void main(String[] args) {
        char categoria = 'C';
        switch (categoria){
            case 'B':
                System.out.println("Categoria: Bebida Caliente. Porcentaje de IVA: 0%");
                break;
            case 'F':
                System.out.println("Categoria: Bebida Fria. Porcentaje de IVA: 5%");
                break;
            case 'C':
                System.out.println("Categoria: Comida. Porcentaje de IVA: 8%");
                break;
            case 'P':
                System.out.println("Categoria: Postre. Porcentaje de IVA: 8%");
                break;
            default:
                System.out.println("Categoria no Valida");
        }
    }
}
