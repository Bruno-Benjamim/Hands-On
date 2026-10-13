
package aula;

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double salarioMinimo = 1621.00;

        int codigo, horas;
        char turno, categoria;
        double valorHora, salario, auxilio;

        for (int i = 1; i <= 10; i++) {

            System.out.println("\nFuncionário " + i);

            System.out.print("Código: ");
            codigo = sc.nextInt();

            System.out.print("Horas trabalhadas: ");
            horas = sc.nextInt();

            System.out.print("Turno (M/V/N): ");
            turno = sc.next().toUpperCase().charAt(0);

            System.out.print("Categoria (O/G): ");
            categoria = sc.next().toUpperCase().charAt(0);

            if ((turno != 'M' && turno != 'V' && turno != 'N')
                    || (categoria != 'O' && categoria != 'G')
                    || horas < 0) {
                System.out.println("Dados inválidos. Confira o cadastro.");
                i--;
                continue;
            }

            if (categoria == 'G' && turno == 'N') {
                valorHora = salarioMinimo * 0.18;
            } else if (categoria == 'G') {
                valorHora = salarioMinimo * 0.15;
            } else if (turno == 'N') {
                valorHora = salarioMinimo * 0.13;
            } else {
                valorHora = salarioMinimo * 0.10;
            }

            salario = horas * valorHora;

            if (salario <= 1080) {
                auxilio = salario * 0.20;
            } else if (salario <= 2160) {
                auxilio = salario * 0.15;
            } else {
                auxilio = salario * 0.05;
            }

            System.out.println("Código: " + codigo);
            System.out.printf("Valor por hora: R$ %.2f%n", valorHora);
            System.out.printf("Salário: R$ %.2f%n", salario);
            System.out.printf("Auxílio-alimentação: R$ %.2f%n", auxilio);
            System.out.printf("Total com auxílio: R$ %.2f%n", salario + auxilio);
        }

        sc.close();
    }
}
