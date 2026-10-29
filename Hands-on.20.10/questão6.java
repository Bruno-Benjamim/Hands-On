
package aula;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[8];
        int[] B = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Informe um numero:");
            A[i] = sc.nextInt();

            B[i] = A[i] * 3;
        }

        System.out.println("Elementos do vetor B:");

        for (int numero : B) {
            System.out.println(numero);
        }

        sc.close();
    }
}
