
package aula;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[15];

        for (int i = 0; i < 15; i++) {
            System.out.println("Informe o nome:");
            nomes[i] = sc.nextLine();
        }

        System.out.println("Nomes na ordem inversa:");

        for (int i = 14; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
