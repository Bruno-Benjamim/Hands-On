
package aula;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] resultado = new int[20];

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um numero para o vetor 1:");
            vetor1[i] = sc.nextInt();

            System.out.println("Informe um numero para o vetor 2:");
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            resultado[i * 2] = vetor1[i];
            resultado[i * 2 + 1] = vetor2[i];
        }

        System.out.println("Vetor intercalado:");

        for (int numero : resultado) {
            System.out.print(numero + " ");
        }

        sc.close();
    }
}
