
package aula;

import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco, armazenamento, imposto, precoFinal;
        double somaCustos = 0, somaImpostos = 0;
        double maiorPreco = 0, menorPreco = 0;
        double somaArmazenamento = 0;
        int baratos = 0, normais = 0, caros = 0;
        char refrigeracao, categoria;

        for (int i = 1; i <= 12; i++) {

            System.out.println("\nProduto " + i);

            System.out.print("Preço unitário: R$ ");
            preco = sc.nextDouble();

            System.out.print("Necessita refrigeração? (S/N): ");
            refrigeracao = sc.next().toUpperCase().charAt(0);

            System.out.print("Categoria (A/L/V): ");
            categoria = sc.next().toUpperCase().charAt(0);

            if (preco < 0
                    || (refrigeracao != 'S' && refrigeracao != 'N')
                    || (categoria != 'A' && categoria != 'L' && categoria != 'V')) {
                System.out.println("Dados inválidos. Informe novamente.");
                i--;
                continue;
            }

            if (preco <= 20) {
                if (categoria == 'A') {
                    armazenamento = 2;
                } else if (categoria == 'L') {
                    armazenamento = 3;
                } else {
                    armazenamento = 4;
                }
            } else if (preco <= 50) {
                if (refrigeracao == 'S') {
                    armazenamento = 6;
                } else {
                    armazenamento = 0;
                }
            } else {
                if (refrigeracao == 'S') {
                    if (categoria == 'A') {
                        armazenamento = 5;
                    } else if (categoria == 'L') {
                        armazenamento = 2;
                    } else {
                        armazenamento = 4;
                    }
                } else {
                    if (categoria == 'L') {
                        armazenamento = 1;
                    } else {
                        armazenamento = 0;
                    }
                }
            }

            if (categoria == 'A' && refrigeracao == 'S') {
                imposto = preco * 0.04;
            } else {
                imposto = preco * 0.02;
            }

            precoFinal = preco + armazenamento + imposto;

            System.out.printf("Preço original: R$ %.2f%n", preco);
            System.out.printf("Armazenamento: R$ %.2f%n", armazenamento);
            System.out.printf("Imposto: R$ %.2f%n", imposto);
            System.out.printf("Preço final: R$ %.2f%n", precoFinal);

            if (precoFinal <= 20) {
                baratos++;
                System.out.println("Classificação: barato");
            } else if (precoFinal <= 100) {
                normais++;
                System.out.println("Classificação: normal");
            } else {
                caros++;
                System.out.println("Classificação: caro");
            }

            somaCustos += armazenamento + imposto;
            somaArmazenamento += armazenamento;
            somaImpostos += imposto;

            if (i == 1 || precoFinal > maiorPreco) {
                maiorPreco = precoFinal;
            }

            if (i == 1 || precoFinal < menorPreco) {
                menorPreco = precoFinal;
            }
        }

        System.out.printf("%nMédia dos custos adicionais: R$ %.2f%n",
                somaCustos / 12);

        System.out.printf("Total de armazenamento: R$ %.2f%n",
                somaArmazenamento);

        System.out.printf("Total de impostos: R$ %.2f%n", somaImpostos);

        System.out.printf("Maior preço final: R$ %.2f%n", maiorPreco);
        System.out.printf("Menor preço final: R$ %.2f%n", menorPreco);

        System.out.println("Produtos baratos: " + baratos);
        System.out.println("Produtos normais: " + normais);
        System.out.println("Produtos caros: " + caros);

        sc.close();
    }
}
