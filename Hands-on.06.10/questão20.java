
package aula;

import java.util.Scanner;

public class SerieMatematica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int expoente = 2;
        int fatorialN = 1;
        int direcao = 1;
        int sinal = -1;

        double x, potencia, termo, soma = 0;

        System.out.print("Informe a quantidade de termos: ");
        n = sc.nextInt();

        System.out.print("Informe o valor de X: ");
        x = sc.nextDouble();

        if (n <= 0) {
            System.out.println("A quantidade de termos deve ser positiva.");
        } else {

            for (int i = 1; i <= n; i++) {

                potencia = 1;

                for (int j = 1; j <= expoente; j++) {
                    potencia = potencia * x;
                }

                fatorialN = 1;

                for (int j = 1; j <= (expoente - 1); j++) {
                    fatorialN = fatorialN * j;
                }

                termo = sinal * potencia / fatorialN;
                soma = soma + termo;

                System.out.printf("Termo %d: %.6f%n", i, termo);

                sinal = sinal * -1;

                if (direcao == 1) {
                    expoente++;

                    if (expoente == 5) {
                        direcao = -1;
                    }
                } else {
                    expoente--;

                    if (expoente == 1) {
                        direcao = 1;
                    }
                }
            }

            System.out.printf("Soma da série: %.6f%n", soma);
        }

        sc.close();
    }
}
