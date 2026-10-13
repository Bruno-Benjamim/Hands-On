package aula;
import java.util.Scanner;
public class Pesquisa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maior = 0 , qMulher = 0  , verde = 0 , louro = 0 , sexo , olho , cabelo , idade , f = 0; 
        do{
            System.out.println("Informe sua idade ou -1 para encerrar: ");
            idade = sc.nextInt();
            if (idade == -1){
                break;
            }
            else{
            System.out.println("""
            Informe seu sexo:
            1 - Masculino
            2 - Feminino
            """);
            sexo = sc.nextInt();
            switch(sexo){
                case 2: {
                    f += 1;
                    break;
                }
            }
            System.out.println("""
            Informe a cor dos seus olhos:
            1 - Azul
            2 - Verde
            3 - Castanho
            """);
            olho = sc.nextInt();
            switch(olho){
                case 2: {
                    verde += 1;
                    break;
                }
            }
            System.out.println("""
            Informe a cor do seu cabelo:
            1 - Louro
            2 - Castanho
            3 - Preto
            """);
            cabelo = sc.nextInt();
            switch(cabelo){
                case 1: {
                    louro += 1;
                    break;
                }
            }
            if (idade > 0){
                maior = idade;
            }
            if (sexo == 2 && olho == 2 && cabelo == 1 && idade > 18 && idade < 35){
                qMulher += 1;
            }
            }
        } while (idade != -1);
        System.out.println("A maior idade informada foi: "+maior);
        System.out.println("A quantidade de mulheres de olhos verdes, cabelos louros e idade entre 18 e 35 anos foi de: "+qMulher);
        sc.close();
    }
}
