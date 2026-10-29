
package aula;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];
        int somaPares = 0, quantidadeImpares = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Informe um numero:");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros pares:");

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
                somaPares = somaPares + numero;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);

        System.out.println("Numeros impares:");

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.println(numero);
                quantidadeImpares++;
            }
        }

        System.out.println("Quantidade de impares: "
            + quantidadeImpares);

        sc.close();
    }
}
