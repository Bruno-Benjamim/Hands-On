package aula;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n , fatorial = 1;
        System.out.println("Informe um número para calcular o fatorial do número 1 até o seu número: ");
        n = sc.nextInt();
        for (int i = 1; i <= n ; i++){
            fatorial = fatorial * i;
            System.out.println(i+"! = "+fatorial+".");
        }
        sc.close();
    }
}
