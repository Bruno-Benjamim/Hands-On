
package aula;

import java.util.Scanner;

public class FaixasEtarias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        int faixa1 = 0, faixa2 = 0, faixa3 = 0;
        int faixa4 = 0, faixa5 = 0;

        for (int i = 1; i <= 15; i++) {

            System.out.print("Informe a idade da pessoa " + i + ": ");
            idade = sc.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade <= 30) {
                faixa2++;
            } else if (idade <= 45) {
                faixa3++;
            } else if (idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
        }

        System.out.println("\nPessoas com até 15 anos: " + faixa1);
        System.out.println("Pessoas de 16 a 30 anos: " + faixa2);
        System.out.println("Pessoas de 31 a 45 anos: " + faixa3);
        System.out.println("Pessoas de 46 a 60 anos: " + faixa4);
        System.out.println("Pessoas com 61 anos ou mais: " + faixa5);

        System.out.printf("Porcentagem de até 15 anos: %.2f%%%n",
                faixa1 * 100.0 / 15);

        System.out.printf("Porcentagem de 61 anos ou mais: %.2f%%%n",
                faixa5 * 100.0 / 15);

        sc.close();
    }
}
