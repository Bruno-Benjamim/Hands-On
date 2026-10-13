
package aula;

import java.util.Scanner;

public class ConceitoAlunos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matricula;
        double nota;
        char conceito;

        for (int i = 1; i <= 75; i++) {

            System.out.println("\nAluno " + i);

            System.out.print("Matrícula: ");
            matricula = sc.nextInt();

            System.out.print("Nota final: ");
            nota = sc.nextDouble();

            if (nota > 9) {
                conceito = 'A';
            } else if (nota >= 7) {
                conceito = 'B';
            } else if (nota >= 5) {
                conceito = 'C';
            } else {
                conceito = 'D';
            }

            System.out.println("Matrícula: " + matricula);
            System.out.printf("Nota: %.2f%n", nota);
            System.out.println("Conceito: " + conceito);
        }

        sc.close();
    }
}
