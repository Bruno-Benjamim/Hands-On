package aula;
import java.util.Scanner;
/*
 * Programa que recebe 2 números digitados pelo usuário e fornece 4 opções de operações para o usuário escolher e digitar,
 * então realiza a operação digitada com os 2 número digitados.
 * Variável 1: n1 (Número digitado pelo usuário)
 * Variável 2: n2 (Segundo número digitado pelo usuário)
 * Variável 3: operacao (operacao digitada pelo usuário)
 * cria condições de if e else if para cada operação e mostra os resultados, tratando também se o n2 for igual a 0.
 */
public class questao3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double n1 , n2;
        String operacao;
        System.out.println("Digite dois números:");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Digite qual das quatro seguintes operações deseja realizar:\n"+"soma\n"+"subtracao\n"+"multiplicacao\n"+"divisao\n");
        operacao = entrada.nextLine();
        if (operacao.equals("soma"))
            System.out.println("A soma dos números " + n1 + " e " + n2 + " é: " + (n1 + n2) + ".");
        else if (operacao.equals("subtracao"))
            System.out.println("A subtração dos números " + n1 + " e " + n2 + " é: " + (n1 - n2) + ".");
        else if (operacao.equals("multiplicacao"))
            System.out.println("A multiplicação dos números " + n1 + " e " + n2 + " é: " + (n1 * n2) + ".");
        else if (operacao.equals("divisao") && (n2 == 0))
            System.out.println("A divisão de um número por 0 é impossível.");
        else if (operacao.equals("divisao"))
            System.out.printf("A divisão dos números " + n1 + " e " + n2 + " é: %.2f.%n" , (n1 / n2));   
    entrada.close();
    }
}
