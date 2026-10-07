import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha;
        int tentativas = 0;
        do {
            System.out.print("Digite sua senha: ");
            senha = entrada.nextInt();
            tentativas++;
            if (senha != 1234) {
                System.out.println("Senha incorreta.");
                System.out.println();
            }
        } while (senha != 1234);
        System.out.println("Login realizado com sucesso!");
        System.out.println("Login realizado após " + tentativas + " tentativas.");
        entrada.close();
    }
}
