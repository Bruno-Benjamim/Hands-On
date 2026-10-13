package aula;
import java.util.Scanner;
public class Soma{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n , soma = 0;
        System.out.println("Informe o número que deseja saber a soma de 1 até ele: ");
        n = sc.nextInt();
        for ( int i = 1; i <= n ; i++){
            soma = soma + i;
        }
        System.out.println("A soma dos números de 1 até "+n+" é: "+soma+".");
        sc.close();
    }
}
