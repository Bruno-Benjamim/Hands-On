package aula;

import java.util.Scanner;

public class Preco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo, quantidade = 0;
        double preco, novoPreco;
        double somaAntes = 0, somaDepois = 0;

        System.out.print("Informe o código do produto (negativo para encerrar): ");
        codigo = sc.nextInt();

        while (codigo >= 0) {

            System.out.print("Informe o preço atual: R$ ");
            preco = sc.nextDouble();

            novoPreco = preco * 1.20;

            System.out.printf("Código: %d%n", codigo);
            System.out.printf("Novo preço: R$ %.2f%n%n", novoPreco);

            somaAntes = somaAntes + preco;
            somaDepois = somaDepois + novoPreco;
            quantidade++;

            System.out.print("Informe o código do produto (negativo para encerrar): ");
            codigo = sc.nextInt();
        }

        if (quantidade > 0) {
            System.out.printf("Média dos preços antes: R$ %.2f%n",
                    somaAntes / quantidade);
            System.out.printf("Média dos preços depois: R$ %.2f%n",
                    somaDepois / quantidade);
        } else {
            System.out.println("Nenhum produto foi informado.");
        }

        sc.close();
    }
}
