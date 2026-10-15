package aula;
import java.util.Scanner;
public class preco2 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int codigo , quantidade = 0;
        double novoPreco , precoAntigo , porcentagem , aumento , mediaAntiga = 0, mediaAtual = 0;
        System.out.println("Informe o percentual de aumento: ");
        porcentagem = sc.nextDouble();
        do {
            System.out.println("Informe o código do produto ou um número negativo para encerrar: ");
            codigo = sc.nextInt();
            if (codigo < 0){
                System.out.println("Foi digitado um código negativo, o programa vai ser encerrado.");
                break;
            }
            else {
            System.out.println("Informe o preço atual do produto em reais: ");
            precoAntigo = sc.nextDouble();
            quantidade++;
            aumento = precoAntigo * ( porcentagem / 100.0);
            mediaAntiga += precoAntigo;
            novoPreco = precoAntigo + aumento;
            mediaAtual += novoPreco;
            System.out.println("O preço do produto "+codigo+" com aumento de "+porcentagem+"% vai ser: "+"R$"+novoPreco+".");
            }
        } while (codigo > 0);
        if (quantidade == 0){
            System.out.println("não foi informado nenhum código.");
        }
        else if (quantidade != 0){
            System.out.printf("A média de preço dos produtos antes do aumento era: R$%.2f.%n", (mediaAntiga /quantidade ));
            System.out.printf("A média de preço dos produtos depois do aumento é: R$%.2f.%n", (mediaAtual / quantidade));
        }
        sc.close();
    }
}
