package aula;
import java.util.Scanner;
/* 
 * Programa que mostra se um número é par ou ímpar.
 * Variável 1: numero (Número inteiro digitado pelo usuário)
 * Adicionar um if se o número for par, ou seja, se o resto da divisão deste número por 2 for igual a 0.
 * Adicionar um else se o número for ímpar.
 */ 
public class questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();
        if (numero %2 == 0)
            System.out.println("O número " + numero + " é par.");
        else
            System.out.println("O número " + numero + " é ímpar.");
        entrada.close();
    }    
}
