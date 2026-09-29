package aula;
import java.util.Scanner;
/* Programa que recebe um número e verifica se ele esta entre 0 e 100.
 *  Variável 1: nota (Número digitado pelo usuário)
 *  if se o número for maior ou igual a 0 e menor ou igual a 100.
 *  else se o número não estiver entre 0 e 100.
 */
public class questao4 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    double nota;
    System.out.println("Digite uma nota entre 0 e 100:");
    nota = entrada.nextDouble();
    if ((nota >= 0) && (nota <= 100))
        System.out.printf("A nota %.2f está entre 0 e 100.%n",nota);
    else
        System.out.printf("A nota %.2f não está entre 0 e 100, então tente novamente.%n",nota);
    entrada.close();
    }
}
