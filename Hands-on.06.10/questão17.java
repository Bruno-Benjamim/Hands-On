
package aula;

import java.util.Scanner;

public class PesquisaCidades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo, veiculos, acidentes;
        int codigoMaior = 0, codigoMenor = 0;
        int maiorAcidentes = 0, menorAcidentes = 0;
        int somaVeiculos = 0;
        String estado;

        for (int i = 1; i <= 200; i++) {

            System.out.println("Cidade " + i);

            System.out.print("Código da cidade: ");
            codigo = sc.nextInt();

            System.out.print("Estado: ");
            estado = sc.next();

            System.out.print("Quantidade de veículos: ");
            veiculos = sc.nextInt();

            System.out.print("Acidentes com vítimas: ");
            acidentes = sc.nextInt();

            somaVeiculos = somaVeiculos + veiculos;

            if (i == 1) {
                maiorAcidentes = acidentes;
                menorAcidentes = acidentes;
                codigoMaior = codigo;
                codigoMenor = codigo;
            } else {
                if (acidentes > maiorAcidentes) {
                    maiorAcidentes = acidentes;
                    codigoMaior = codigo;
                }

                if (acidentes < menorAcidentes) {
                    menorAcidentes = acidentes;
                    codigoMenor = codigo;
                }
            }
        }

        System.out.println("\nCódigo da cidade com mais acidentes: " + codigoMaior);
        System.out.println("Quantidade de acidentes: " + maiorAcidentes);

        System.out.println("\nCódigo da cidade com menos acidentes: " + codigoMenor);
        System.out.println("Quantidade de acidentes: " + menorAcidentes);

        System.out.printf("Média de veículos: %.2f%n", somaVeiculos / 200.0);

        sc.close();
    }
}
