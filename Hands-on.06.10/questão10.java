package aula;
import java.util.Scanner;
/* quantidade = quantidade de termos até o desejado
 * n = termo desejado
 */
public class Progressao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sn , termo , a1 , an , r , n;
        System.out.println("Informe qual termo da progressão aritmética que deseja saber: ");
        n = sc.nextInt();
        System.out.println("Informe a razão da progressão aritmética desejada: ");
        r = sc.nextInt();
        System.out.println("Informe qual é o primeiro número da progressão aritmética: ");
        a1 = sc.nextInt();
        an = a1 + (n - 1) * r;
        System.out.println("PA: ");
        for ( int i = 1; i <= n; i++){
            termo = a1 + (i - 1) * r;
            System.out.print(termo+" ");
        }
        sn = (n * (a1 + an)) / 2;
        System.out.println("\nA soma dos termos é: "+sn+".");
        sc.close();
    }
}
