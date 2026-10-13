package aula;
import java.util.Scanner;
public class Prefeitura{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salario = 0 , maior = 0 , cem = 0 , filhosTotal = 0 , filhos = 0 , salarioTotal = 0 , i , habitantes ;
        double entrevistados = 0;
        System.out.println("Informe a quantidade de habitantes da cidade onde será realizada a pesquisa: ");
        habitantes = sc.nextInt();
        for ( i = 1 ; i <= habitantes ; i++){
            System.out.println("Informe o salário ou um salário negativo para encerrar: ");
            salario = sc.nextInt();
            if ( salario < 0){
                break;
            }
            salarioTotal = (salarioTotal + salario);
            if (salario > maior){
                maior = salario;
            } 
            if (salario <= 100 && salario > 0){
                cem++;
            }
            System.out.println("Informe o número de filhos: ");
            filhos = sc.nextInt();
            filhosTotal = filhosTotal + filhos;
            entrevistados++; 
        }
        if (entrevistados > 0){
        System.out.println("O maior salário informado nesta cidade foi: "+maior+".");
        System.out.printf("A média salárial nesta cidade é: %.2f.%n",(salarioTotal/entrevistados));
        System.out.printf("A média de filhos nesta cidade é: %.2f.%n",(filhosTotal/entrevistados));
        System.out.printf("A porcentagem de salários abaixo de 100 reais é de: %.2f.%n",((cem * 100.0) / entrevistados));
        }
        else {
            System.out.println("Não houve entrevistados.");
        }    
    sc.close();
    }
}
