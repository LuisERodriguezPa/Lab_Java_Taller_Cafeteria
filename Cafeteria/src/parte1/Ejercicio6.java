package parte1;

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        double suma = 0;
        for(int i=0; i<5; i++){
            System.out.println("Nombre: "+productos[i]+" Precio: "+precios[i]);
            suma = suma + precios[i];
        }
        System.out.println("Precio promedio del menu "+(suma/5));
    }
}
