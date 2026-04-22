package parte1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int montoApertura;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Ingrese el monto de apertura de caja: ");
            montoApertura = entrada.nextInt();
        }while(montoApertura<=0);

    }
}
