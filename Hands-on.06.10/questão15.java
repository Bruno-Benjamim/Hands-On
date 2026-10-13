package aula;

import java.util.Scanner;

public class SerieHarmonica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0;

        System.out.print("Informe a quantidade de termos: ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Informe um número positivo.");
        } else {

            for (int i = 1; i <= n; i++) {

                System.out.printf("1/%d", i);

                soma = soma + (1.0 / i);

                if (i < n) {
                    System.out.print(" + ");
                }
            }

            System.out.printf("%nSoma da série: %.6f%n", soma);
        }

        sc.close();
    }
}
