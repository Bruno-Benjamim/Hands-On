
package aula;

import java.util.Scanner;

public class SerieMatematica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int expoente = 2;
        int denominador = 1;
        int direcao = 1;
        int sinal = -1;

        double x, potencia, fatorial, termo, soma = 0;

        System.out.print("Informe a quantidade de termos: ");
        n = sc.nextInt();

        System.out.print("Informe o valor positivo de X: ");
        x = sc.nextDouble();

        if (n <= 0 || x <= 0) {
            System.out.println("Informe N e X positivos.");
        } else {

            for (int i = 1; i <= n; i++) {

                potencia = 1;

                for (int j = 1; j <= expoente; j++) {
                    potencia = potencia * x;
                }

                fatorial = 1;

                for (int j = 1; j <= denominador; j++) {
                    fatorial = fatorial * j;
                }

                termo = sinal * potencia / fatorial;
                soma = soma + termo;

                System.out.printf("Termo %d: %.6f%n", i, termo);

                sinal = sinal * -1;
                expoente++;

                if (direcao == 1) {
                    if (denominador == 4) {
                        direcao = -1;
                        denominador--;
                    } else {
                        denominador++;
                    }
                } else {
                    if (denominador == 1) {
                        direcao = 1;
                        denominador++;
                    } else {
                        denominador--;
                    }
                }
            }

            System.out.printf("Soma da série: %.6f%n", soma);
        }

        sc.close();
    }
}
