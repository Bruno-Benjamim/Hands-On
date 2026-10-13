
package aula;

import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double salarioMinimo = 1621.00;

        int numero, pecas;
        int totalPecas = 0;
        int pecasHomens = 0, quantidadeHomens = 0;
        int pecasMulheres = 0, quantidadeMulheres = 0;
        int maiorNumero = 0;
        int maiorPecas = -1;
        char sexo;
        double salario, maiorSalario = 0, totalSalarios = 0;

        for (int i = 1; i <= 15; i++) {

            System.out.println("\nTrabalhador " + i);

            System.out.print("Número do trabalhador: ");
            numero = sc.nextInt();

            System.out.print("Quantidade de peças: ");
            pecas = sc.nextInt();

            System.out.print("Sexo (M/F): ");
            sexo = sc.next().toUpperCase().charAt(0);

            if (pecas < 0 || (sexo != 'M' && sexo != 'F')) {
                System.out.println("Dados inválidos. Informe novamente.");
                i--;
                continue;
            }

            if (pecas <= 30) {
                salario = salarioMinimo;
            } else if (pecas <= 50) {
                salario = salarioMinimo
                        + (pecas - 30) * salarioMinimo * 0.03;
            } else {
                salario = salarioMinimo
                        + (pecas - 30) * salarioMinimo * 0.05;
            }

            System.out.printf("Salário: R$ %.2f%n", salario);

            totalPecas += pecas;
            totalSalarios += salario;

            if (sexo == 'M') {
                pecasHomens += pecas;
                quantidadeHomens++;
            } else {
                pecasMulheres += pecas;
                quantidadeMulheres++;
            }

            if (salario > maiorSalario || i == 1) {
                maiorSalario = salario;
                maiorNumero = numero;
                maiorPecas = pecas;
            }
        }

        System.out.printf("%nFolha salarial total: R$ %.2f%n", totalSalarios);
        System.out.println("Total de peças: " + totalPecas);

        if (quantidadeHomens > 0) {
            System.out.printf("Média de peças dos homens: %.2f%n",
                    pecasHomens / (double) quantidadeHomens);
        }

        if (quantidadeMulheres > 0) {
            System.out.printf("Média de peças das mulheres: %.2f%n",
                    pecasMulheres / (double) quantidadeMulheres);
        }

        System.out.println("Trabalhador com maior salário: " + maiorNumero);
        System.out.println("Peças produzidas por ele: " + maiorPecas);
        System.out.printf("Maior salário: R$ %.2f%n", maiorSalario);

        sc.close();
    }
}
