import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade , ingresso , responsavel = 0;
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Possui ingresso?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        ingresso = entrada.nextInt();
        if (ingresso == 2) {
            System.out.println("Entrada negada: ingresso obrigatório.");
        } 
        else if (ingresso == 1 && idade >= 18) {
            System.out.println("Entrada liberada!");
        } 
        else if (ingresso == 1 && idade < 18) {
            System.out.println("Está acompanhado de um responsável?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            responsavel = entrada.nextInt();
            if (responsavel == 1) {
                System.out.println("Entrada liberada!");
            } 
            else {
                System.out.println("Entrada negada.");
            }
        } 
        else {
            System.out.println("Opção de ingresso inválida.");
        }
        entrada.close();
    }
}
