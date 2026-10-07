import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("===== STREAMING =====");
            System.out.println("1 - Netflix");
            System.out.println("2 - Disney+");
            System.out.println("3 - Prime Video");
            System.out.println("4 - Spotify");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Netflix.");
                    System.out.println("Prepare a pipoca!");
                    break;
                case 2:
                    System.out.println("Você escolheu Disney+.");
                    System.out.println("Prepare a pipoca!");
                    break;
                case 3:
                    System.out.println("Você escolheu Prime Video.");
                    System.out.println("Bom filme!");
                    break;
                case 4:
                    System.out.println("Você escolheu Spotify.");
                    System.out.println("Coloque sua música favorita!");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } 
        while (opcao != 5);
        entrada.close();
    }
}
