package ci.praxis.desafio3;

import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.println("Indícame cuantos números pares necesitas que imprime:");
        int contador = sc.nextInt();

        // Ciclo while para el control de cuantos numeros imprimimos
        while (contador > 0) {

            // Identificamos si el numero es par o no
            if (i% 2 == 0) {
                System.out.println(i);
                contador--;
            }
            i++;
        }
    }
}