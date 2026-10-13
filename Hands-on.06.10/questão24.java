
package aula;

import java.util.Scanner;

public class MortalidadeInfantil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade, meses;
        int meninas = 0, meninos = 0;
        int meninasObito = 0, meninosObito = 0;
        int ate24Meses = 0;
        char sexo;

        System.out.print("Quantidade de crianças: ");
        quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser positiva.");
        } else {

            for (int i = 1; i <= quantidade; i++) {

                System.out.println("\nCriança " + i);

                System.out.print("Sexo (M/F): ");
                sexo = sc.next().toUpperCase().charAt(0);

                System.out.print("Tempo de vida em meses: ");
                meses = sc.nextInt();

                if (meses < 0 || (sexo != 'M' && sexo != 'F')) {
                    System.out.println("Dados inválidos.");
                    i--;
                    continue;
                }

                if (sexo == 'F') {
                    meninas++;
                    meninasObito++;
                } else {
                    meninos++;
                    meninosObito++;
                }

                if (meses <= 24) {
                    ate24Meses++;
                }
            }

            System.out.printf("Percentual de meninas: %.2f%%%n",
                    meninasObito * 100.0 / quantidade);

            System.out.printf("Percentual de meninos: %.2f%%%n",
                    meninosObito * 100.0 / quantidade);

            System.out.printf("Percentual com até 24 meses: %.2f%%%n",
                    ate24Meses * 100.0 / quantidade);
        }

        sc.close();
    }
}
