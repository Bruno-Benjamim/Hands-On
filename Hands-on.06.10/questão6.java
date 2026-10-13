package aula;
import java.util.Scanner;
public class Serie{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        double e = 1 , fatorial = 1;
        System.out.println("Informe até qual número inteiro deseja calcular a série E: ");
        n = sc.nextInt();
        for(double i = 1 ; i <= n ; i++){
            fatorial = fatorial * i;
            e += (1.0 / fatorial) ;
        }
        System.out.printf("E = %.2f.%n" , e);
    sc.close();
}
}
