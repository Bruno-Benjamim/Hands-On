package aula;
import java.util.Scanner;
public class Sentinela{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n , maior , menor;
        do{
        System.out.println("Escolha um número para iniciar o programa que seja diferente de zero: ");
        n = sc.nextInt();
        maior = menor = n;
        }
        while(n == 0);
        while ( n != 0){
            if (n > maior){
                maior = n; 
            }
            else if( n < menor){
                menor = n;
            }
            System.out.println("Digite outro número ou 0 para encerrar o programa:");
            n = sc.nextInt();
        }
        System.out.println("O maior número digitado foi: "+maior+" e o menor foi: "+menor+".");
        sc.close();
    }
}
