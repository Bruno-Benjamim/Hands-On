import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao , estudante = 0;
        double total = 0 , desconto , valorFinal;
        do {
            System.out.println("===== LANCHONETE =====");
            System.out.println();
            System.out.println("1 - Pizza         - R$ 30,00");
            System.out.println("2 - Hambúrguer    - R$ 20,00");
            System.out.println("3 - Batata        - R$ 12,00");
            System.out.println("4 - Refrigerante  - R$ 8,00");
            System.out.println("0 - Finalizar");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    total = total + 30;
                    break;
                case 2:
                    total = total + 20;
                    break;
                case 3:
                    total = total + 12;
                    break;
                case 4:
                    total = total + 8;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        if (total < 50) {
            desconto = 0;
        } 
        else if (total < 100) {
            desconto = 0.05;
        } 
        else {
            System.out.println("Você é estudante?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            estudante = entrada.nextInt();
            if (estudante == 1) {
                desconto = 0.15;
            } 
            else {
                desconto = 0.10;
            }
        }
        valorFinal = total - (total * desconto);
        if (desconto == 0) {
            System.out.println("Sem desconto.");
        } 
        else {
            System.out.println((int)(desconto * 100) + "% de desconto.");
        }
        System.out.printf("Total: R$ %.2f%n", valorFinal);
        entrada.close();
    }
}
