package aula;

import java.util.Scanner;

public class questão12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorIdade = -1;
        int qMulher = 0;
        int idade;
        int sexo, olho, cabelo;

        do {
            System.out.println("Informe sua idade ou -1 para encerrar: ");
            idade = sc.nextInt();

            if (idade == -1) {
                break;
            }

            System.out.println("""
            Informe seu sexo:
            1 - Masculino
            2 - Feminino
            """);
            sexo = sc.nextInt();

            System.out.println("""
            Informe a cor dos seus olhos:
            1 - Azul
            2 - Verde
            3 - Castanho
            """);
            olho = sc.nextInt();

            System.out.println("""
            Informe a cor do seu cabelo:
            1 - Louro
            2 - Castanho
            3 - Preto
            """);
            cabelo = sc.nextInt();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (sexo == 2 && olho == 2 && cabelo == 1 && idade >= 18 && idade <= 35) {
                qMulher++;
            }
        } while (idade != -1);

        System.out.println("A maior idade informada foi: " + maiorIdade);
        System.out.println("A quantidade de mulheres de olhos verdes, cabelos louros e idade entre 18 e 35 anos foi de: " + qMulher);
        sc.close();
    }
}
