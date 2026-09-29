package aula;
/* Programa que recebe um valor de compra e uma categoria de cliente e aplica o desconto de acordo.
 * Variável 1: valorCompra (valor da conta, em reais, digitada pelo usuário)
 * Variável 2: categoria (opção de categoria do usuário)
 * Adicionar switch case para aplicar o desconto e mostrar o valor final da conta para cada categoria de cliente.
 */
import java.util.Scanner;
public class questao6 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe o valor da compra: ");
    double valorCompra = entrada.nextDouble();
    System.out.println("Digite o número da sua categoria:");
    System.out.println("1) Comum.");
    System.out.println("2) Premium.");
    System.out.println("3) Funcionário.");
    int categoria = entrada.nextInt();
    switch (categoria){
      case 1:
        System.out.println("O desconto para a categoria comum é 5%: " + "R$" + ((5 * valorCompra) / 100));
        System.out.println("O valor a ser pago vai ser de: " + "R$" + (valorCompra - ((5 * valorCompra) / 100)) );
        break;
      case 2:
        System.out.println("O desconto para a categoria premium é 10%: " + "R$" + ((10 * valorCompra) / 100));
        System.out.println("O valor a ser pago vai ser de: " + "R$" + (valorCompra - ((10 * valorCompra) / 100)) );
        break;
      case 3:
        System.out.println("O desconto para funcionário é 15%: " + "R$" + ((15 * valorCompra) / 100));
        System.out.println("O valor a ser pago vai ser de: " + "R$" + (valorCompra - ((15 * valorCompra) / 100)) );
        break;
      default:
        System.out.println("Categoria inválida.");
    }
    entrada.close();
    }
}
