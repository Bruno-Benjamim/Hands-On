
package aula;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int anterior = 0;
        int atual = 1;
        int proximo;

        System.out.print("Quantos termos deseja mostrar? ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Informe uma quantidade positiva.");
        } else {

            for (int i = 1; i <= n; i++) {

                System.out.print(anterior + " ");

                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }

            System.out.println();
        }

        sc.close();
    }
}
