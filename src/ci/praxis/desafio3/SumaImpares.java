package ci.praxis.desafio3;

import java.util.Scanner;

public class SumaImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int suma = 0;

        System.out.println("Indícame hasta que numero calcularemos la suma de los impares:");
        int numeroMax = sc.nextInt();

        // Ciclo while para el control de cuantos numeros imprimimos
        while (numeroMax > 0) {

            // Identificamos si el numero es par o no
            if (i% 2 != 0) {
                suma += i;
            }
            i++;
            numeroMax--;
        }
        System.out.println("La suma de los numeros impares es: "+suma);
    }
}