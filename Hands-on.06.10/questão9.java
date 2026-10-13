package aula;
import java.util.Scanner;
public class Eleicao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao , votos1 = 0 , votos2 = 0 , votos3 = 0 , votos4 = 0 , nulos = 0 , brancos = 0;
        do{
            System.out.println("""
                ---- Eleição ----
                Digite a opção na qual deseja votar:
                1 = Candidato 1
                2 = Candidato 2
                3 = Candidato 3
                4 = Candidato 4
                5 = Voto nulo
                6 = Voto em branco
                0 = Encerrar votação  
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    votos1++;
                break;
                case 2:
                    votos2++;
                break;
                case 3:
                    votos3++;
                break;
                case 4:
                    votos4++;
                break;
                case 5:
                    nulos++;
                break;
                case 6:
                    brancos++;
                break;
                case 0:
                    System.out.println("Votação encerrada.");
                break;
                default:
                    System.out.println("Opção invalida.");
                break;
            }
        }while (opcao != 0);
        System.out.println("Quantidade de votos no candidato 1: "+votos1+".\n");
        System.out.println("Quantidade de votos no candidato 2: "+votos2+".\n");
        System.out.println("Quantidade de votos no candidato 3: "+votos3+".\n");
        System.out.println("Quantidade de votos no candidato 4: "+votos4+".\n");
        System.out.println("Quantidade de votos em branco: "+brancos+".\n");
        System.out.println("Quantidade de votos nulos: "+nulos+".\n");
        sc.close();
    }
}
