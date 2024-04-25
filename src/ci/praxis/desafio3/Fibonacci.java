package ci.praxis.desafio3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el numero de elementos a monstrar de la serie 'Fibonacci':");

        int numeroElementos = sc.nextInt();

        for (int i = 0; i <= numeroElementos; i++) {
            System.out.println(calcularFibonacci(i));
        }
    }

    public static int calcularFibonacci(int elemento) {
        if (elemento == 0) {
            return elemento;
        } else if (elemento == 1) {
            return elemento;
        } else {
            int numero1 = 0;
            int numero2 = 1;
            int suma = 0;

            for (int i = 2; i <= elemento; i++) {
                suma = numero1 + numero2;
                numero1 = numero2;
                numero2 = suma;
            }
            return suma;
        }
    }
}
