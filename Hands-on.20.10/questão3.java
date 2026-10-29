package aula;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[8];
        int[] positivos = new int[8];
        int[] negativos = new int[8];

        int contPositivos = 0, contNegativos = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Informe um numero:");
            vetor[i] = sc.nextInt();

            if (vetor[i] > 0) {
                positivos[contPositivos] = vetor[i];
                contPositivos++;
            }
            else if (vetor[i] < 0) {
                negativos[contNegativos] = vetor[i];
                contNegativos++;
            }
        }

        System.out.println("Numeros positivos:");

        for (int i = 0; i < contPositivos; i++) {
            System.out.println(positivos[i]);
        }

        System.out.println("Numeros negativos:");

        for (int i = 0; i < contNegativos; i++) {
            System.out.println(negativos[i]);
        }

        sc.close();
    }
}
