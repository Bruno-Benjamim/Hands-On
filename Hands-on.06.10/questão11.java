package aula;
import java.util.Scanner;
public class Tabuada{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n , numero;
        System.out.println("Informe quantas vezes quer executar o programa: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            for ( int i2 = 1; i2 <= numero; i2++){
            System.out.println(i2 + " x " + numero + " = " + i2 * numero);
            }
        }
        sc.close();
    }
}
