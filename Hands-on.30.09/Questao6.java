import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int moedas = 1500 , opcao , preco = 0;
        do {
            System.out.println("===== LOJA DE SKINS =====");
            System.out.println("1 - Skin Básica   - 100 moedas");
            System.out.println("2 - Skin Rara     - 250 moedas");
            System.out.println("3 - Skin Épica    - 500 moedas");
            System.out.println("4 - Skin Lendária - 1000 moedas");
            System.out.println("0 - Sair");
            System.out.println("Saldo: " + moedas + " moedas");
            System.out.print("Escolha uma skin: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    preco = 100;
                    break;
                case 2:
                    preco = 250;
                    break;
                case 3:
                    preco = 500;
                    break;
                case 4:
                    preco = 1000;
                    break;
                case 0:
                    System.out.println("Saindo da loja...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    preco = 0;
            }
            if (opcao >= 1 && opcao <= 4) {
                if (moedas >= preco) {
                    moedas = moedas - preco;
                    if (opcao == 1) {
                        System.out.println("Skin Básica comprada!");
                    }
                    else if (opcao == 2) {
                        System.out.println("Skin Rara comprada!");
                    } 
                    else if (opcao == 3) {
                        System.out.println("Skin Épica comprada!");
                    } 
                    else {
                        System.out.println("Skin Lendária comprada!");
                    }
                    System.out.println("Saldo restante: " + moedas + " moedas.");
                } 
                else {
                    System.out.println("Saldo insuficiente.");
                }
            }
        } while (opcao != 0);
        entrada.close();
    }
}
