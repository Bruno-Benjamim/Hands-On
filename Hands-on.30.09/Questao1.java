import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade , horas;
        System.out.print("Digite a idade do jogador: ");
        idade = entrada.nextInt();
        System.out.print("Digite a quantidade de horas jogadas por semana: ");
        horas = entrada.nextInt();
        if (idade < 12) {
            System.out.println("Jogador Mirim");
        } 
        else if (idade <= 17) {
            if (horas <= 10) {
                System.out.println("Jogador Casual");
            } 
            else {
                System.out.println("Jogador Frequente");
            }
        } 
        else {

            if (horas <= 5) {
                System.out.println("Jogador Casual");
            } 
            else if (horas <= 15) {
                System.out.println("Jogador Gamer");
            } 
            else {
                System.out.println("Gamer Hardcore");
            }
        }
        entrada.close();
    }
}
