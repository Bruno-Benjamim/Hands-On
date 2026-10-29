
package aula;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int divisores;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um numero:");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Numeros primos e suas posicoes:");

        for (int i = 0; i < 10; i++) {

            divisores = 0;

            for (int j = 1; j <= vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    divisores++;
                }
            }

            if (vetor[i] > 1 && divisores == 2) {
                System.out.println("Numero: " + vetor[i]
                    + " Posicao: " + i);
            }
        }

        sc.close();
    }
}
