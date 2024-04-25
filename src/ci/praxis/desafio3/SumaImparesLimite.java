package ci.praxis.desafio3;

import java.util.Scanner;

public class SumaImparesLimite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int suma = 0;

        System.out.println("\nIndícame rango del grupo de los números para\ncual calcularemos la suma de los impares.\n");
        System.out.println("Indicame el limite Minimo:");
        int limiteMin = sc.nextInt();
        System.out.println("Indicame el limite Maximo:");
        int limiteMax = sc.nextInt();

        int numero = limiteMin;

        // Ciclo while para el control de no pasarnos del limite maximo
        while (numero <= limiteMax) {

            // Identificamos si el numero es par o no
            if (numero% 2 != 0) {
                suma += numero;
            }
            numero++;
        }
        System.out.println("\nLa suma de los números impares en el rango es: "+suma);
    }
}