package aula;
import java.util.Scanner;
public class Contagem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  , vezes , negativos = 0 , positivos = 0, zeros = 0;
        System.out.println("Digite quantas vezes quer excecutar o programa: ");
        vezes = sc.nextInt();
        for (int i = 1; i <= vezes; i++){
            System.out.println("Digite um número: ");
            n = sc.nextInt();
            if ( n < 0){
                negativos ++;
            }
            else if (n > 0){
                positivos++;
            }
            else if ( n == 0 ){
                zeros++;
            }
        }
        System.out.println("Quantidade de positivos: "+positivos+".\nQuantidade de negativos: "+negativos+".\nQuantidade de zeros: "+zeros+".");
        sc.close();
    }
}
