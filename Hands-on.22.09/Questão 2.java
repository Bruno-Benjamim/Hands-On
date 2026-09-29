package aula;
import java.util.Scanner;
/* 
 * Programa que recebe dois números, compara e informa qual é maior ou se são iguais.
 * Variável 1: n1 (Número inteiro digitado pelo usuário)
 * Variável 2: n2 (Segundo número inteiro digitado pelo usuário)
 * Adicionar um if se o número 1 for maior que o segundo.
 * Adicionar um else if se o segundo número for maior que o primeiro.
 * Adicionar um else if se os números forem iguais.
 */
public class questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 , n2;
        System.out.println("Digite dois números inteiros:");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        if (n1 > n2)
            System.out.println("O número " + n1 + " é maior que " + n2 + ".");
        else if (n2 > n1)
            System.out.println("O número " + n2 + " é maior que " + n1 + ".");
        else
            System.out.println("Os números são iguais.");
        entrada.close();
    }
}
