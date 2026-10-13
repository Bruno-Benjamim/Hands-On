package aula;
import java.util.Scanner;
public class Subtracao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n , soma = 0;
        System.out.println("Informe um número que deseja saber a some dele até 1: ");
        n = sc.nextInt();
        for(int i = n;  i >= 1; i--){
            System.out.print(i+" ");
            soma = soma + i;
        }
        System.out.println("\nA soma dos números de "+n+" até 1 é: "+soma+".");
        sc.close();
    }
}
