package aula;
import java.util.Scanner;
/* Programa que simula um caixa, dando 3 opções sendo elas: saque, depósito e ver saldo.
 *  Variável 1: saldoInicial (o saldo inicial de 1000)
 *  Variável 2: valor (quantidade de dinheiro que o usuário escolheu para a operação)
 *  Variável 3: operacao (operação digitada pelo usuário)
 */
public class questao5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String operacao;
        double saldoInicial , valor;
        saldoInicial = 1000;
        System.out.println("Digite qual das seguintes operações deseja realizar: \nVer saldo \nSaque \nDepósito");
        operacao = entrada.nextLine();
        if (operacao.equalsIgnoreCase("ver saldo"))
            System.out.println("Seu saldo é de: " + saldoInicial);
        else{
            System.out.println("Digite o valor que deseja transferir: ");  
            valor = entrada.nextDouble();
        if (operacao.equalsIgnoreCase("saque"))
            System.out.println("Você sacou o valor de: " + valor + " agora seu saldo é de: " + (saldoInicial - valor) + "."); 
        else if (operacao.equalsIgnoreCase("deposito"))
            System.out.println("Você depósitou o valor de: " + valor + " agora seu saldo é de: " + (saldoInicial + valor) + ".");  
        }
        entrada.close();   
    }
}
