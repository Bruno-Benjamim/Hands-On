package aula;

import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {

        String[] herois = { "guerreiro", "arqueiro", "mago" }, turno = { "jogador1", "jogador2" };
        int[] vidaInicial = { 100, 80, 60 };
        int[] ataque = { 20, 15, 25 }, soma = { 0, 0 };
        int[][] vida = {
                { 100, 80, 60 },
                { 100, 80, 60 } 
        };
        int opcaoMenu, heroi, adversario;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("""
                    ====================================
                                    MENU
                    ====================================
                    1 - Iniciar batalha
                    2 - Consultar herois
                    3 - Consultar Status da batalha
                    4 - Reiniciar jogo
                    0 - Sair
                        """);
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {

                case 1:
                    soma[0] = vida[0][0] + vida[0][1] + vida[0][2];
                    soma[1] = vida[1][0] + vida[1][1] + vida[1][2];
                    if (soma[0] == 0 || soma[1] == 0) {
                        System.out.println("A batalha está finalizada, favor reiniciar para começar outra.");
                        break;
                    }
                    do {
                        for (int i = 0; i < turno.length; i++) {
                            System.out.print("vez do jogador " + turno[i] + ".\n");
                            System.out.print("""
                                    ====================================
                                             ARENA DOS HEROIS
                                    ====================================

                                    Escolha seu heroi:
                                    1 - guerreiro
                                    2 - arqueiro
                                    3 - mago
                                        """);
                            heroi = sc.nextInt();
                            while (heroi < 1 || heroi > 3 || vida[i][heroi - 1] == 0) {
                                System.out.println("este heroi é invalido ou esta morto, escolha outro.");
                                System.out.print("""
                                        ====================================
                                                 ARENA DOS HEROIS
                                        ====================================

                                        Escolha seu heroi:
                                        1 - guerreiro
                                        2 - arqueiro
                                        3 - mago
                                            """);
                                heroi = sc.nextInt();
                            }
                            switch (heroi) {
                                case 1:
                                    System.out.print("""
                                            Escolha seu adversario:
                                            1 - guerreiro
                                            2 - arqueiro
                                            3 - mago
                                                """);
                                    adversario = sc.nextInt();
                                    while (adversario < 1 || adversario > 3 || vida[1 - i][adversario - 1] == 0) {
                                        System.out.println("este inimigo é invalido ou esta morto, escolha outro.");
                                        System.out.print("""
                                                Escolha seu adversario:
                                                1 - guerreiro
                                                2 - arqueiro
                                                3 - mago
                                                    """);
                                        adversario = sc.nextInt();
                                    }
                                    switch (adversario) {
                                        case 1:
                                            vida[1 - i][0] -= 20;
                                            if (vida[1 - i][0] < 0) {
                                                vida[1 - i][0] = 0;
                                            }
                                            System.out.print("Seu guerreiro atacou " + herois[0] + " inimigo\n");
                                            System.out.print("Dano causado: " + ataque[0] + "\n");
                                            System.out
                                                    .print("Vida restante do Guerreiro inimigo: " + vida[1 - i][0]
                                                            + ".\n");
                                            break;
                                        case 2:
                                            vida[1 - i][1] -= 20;
                                            if (vida[1 - i][1] < 0) {
                                                vida[1 - i][1] = 0;
                                            }
                                            System.out.print("Seu guerreiro atacou " + herois[1] + " inimigo\n");
                                            System.out.print("Dano causado: " + ataque[0] + "\n");
                                            System.out
                                                    .print("Vida restante do arqueiro inimigo: " + vida[1 - i][1]
                                                            + ".\n");
                                            break;
                                        case 3:
                                            vida[1 - i][2] -= 20;
                                            if (vida[1 - i][2] < 0) {
                                                vida[1 - i][2] = 0;
                                            }
                                            System.out.print("Seu guerreiro atacou " + herois[2] + " inimigo\n");
                                            System.out.print("Dano causado: " + ataque[0] + "\n");
                                            System.out
                                                    .print("Vida restante do mago inimigo: " + vida[1 - i][2]
                                                            + ".\n");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.print("""
                                            Escolha seu adversario:
                                            1 - guerreiro
                                            2 - arqueiro
                                            3 - mago
                                                """);
                                    adversario = sc.nextInt();
                                    while (adversario < 1 || adversario > 3 || vida[1 - i][adversario - 1] == 0) {
                                        System.out.println("este inimigo é invalido ou esta morto, escolha outro.");
                                        System.out.print("""
                                                Escolha seu adversario:
                                                1 - guerreiro
                                                2 - arqueiro
                                                3 - mago
                                                    """);
                                        adversario = sc.nextInt();
                                    }
                                    switch (adversario) {
                                        case 1:
                                            vida[1 - i][0] -= 15;
                                            if (vida[1 - i][0] < 0) {
                                                vida[1 - i][0] = 0;
                                            }
                                            System.out.print("Seu arqueiro atacou " + herois[0] + " inimigo\n");
                                            System.out.print("Dano causado: " + ataque[1] + "\n");
                                            System.out
                                                    .print("Vida restante do Guerreiro inimigo: " + vida[1 - i][0]
                                                            + ".\n");
                                            break;
                                        case 2:
                                            vida[1 - i][1] -= 15;
                                            if (vida[1 - i][1] < 0) {
                                                vida[1 - i][1] = 0;
                                            }
                                            System.out.print("Seu arqueiro atacou " + herois[1] + " inimigo\n");
                                            System.out.print("Dano causado: " + ataque[1] + "\n");
                                            System.out
                                                    .print("Vida restante do arqueiro inimigo: " + vida[1 - i][1]
                                                            + ".\n");
                                            break;
                                        case 3:
                                            vida[1 - i][2] -= 15;
                                            if (vida[1 - i][2] < 0) {
                                                vida[1 - i][2] = 0;
                                            }
                                            System.out.print("Seu arqueiro atacou " + herois[2] + " inimigo\n");
                                            System.out.print("Dano causado: " + ataque[1] + "\n");
                                            System.out
                                                    .print("Vida restante do mago inimigo: " + vida[1 - i][2]
                                                            + ".\n");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.print("""
                                            Escolha seu adversario:
                                            1 - guerreiro
                                            2 - arqueiro
                                            3 - mago
                                                """);
                                    adversario = sc.nextInt();
                                    while (adversario < 1 || adversario > 3 || vida[1 - i][adversario - 1] == 0) {
                                        System.out.println("este inimigo é invalido ou esta morto, escolha outro.");
                                        System.out.print("""
                                                Escolha seu adversario:
                                                1 - guerreiro
                                                2 - arqueiro
                                                3 - mago
                                                    """);
                                        adversario = sc.nextInt();
                                    }
                                    switch (adversario) {
                                        case 1:
                                            vida[1 - i][0] -= 25;
                                            if (vida[1 - i][0] < 0) {
                                                vida[1 - i][0] = 0;
                                            }
                                            System.out.print("Seu mago atacou " + herois[0] + " inimigo\n");
                                            System.out.print("Dano causado: " + ataque[2] + "\n");
                                            System.out
                                                    .print("Vida restante do Guerreiro inimigo: " + vida[1 - i][0]
                                                            + "\n");
                                            break;
                                        case 2:
                                            vida[1 - i][1] -= 25;
                                            if (vida[1 - i][1] < 0) {
                                                vida[1 - i][1] = 0;
                                            }
                                            System.out.print("Seu mago atacou " + herois[1] + " inimigo\n");
                                            System.out.print("Dano causado: " + ataque[2] + "\n");
                                            System.out
                                                    .print("Vida restante do arqueiro inimigo: " + vida[1 - i][1]
                                                            + ".\n");
                                            break;
                                        case 3:
                                            vida[1 - i][2] -= 25;
                                            if (vida[1 - i][2] < 0) {
                                                vida[1 - i][2] = 0;
                                            }
                                            System.out.print("Seu mago atacou " + herois[2] + " inimigo\n");
                                            System.out.print("Dano causado: " + ataque[2] + "\n");
                                            System.out
                                                    .print("Vida restante do mago inimigo: " + vida[1 - i][2]
                                                            + ".\n");
                                            break;
                                    }
                                    break;
                            }
                            soma[0] = vida[0][0] + vida[0][1] + vida[0][2];
                            soma[1] = vida[1][0] + vida[1][1] + vida[1][2];
                            if (soma[0] == 0) {
                                System.out.println("jogador 2 venceu.");
                                break;
                            } else if (soma[1] == 0) {
                                System.out.println("jogador 1 venceu.");
                                break;
                            }
                        }
                    } while (soma[0] > 0 && soma[1] > 0);
                    break;
                case 2:
                    for (int i = 0; i < vidaInicial.length; i++) {
                        System.out.println("Vida inicial do " + herois[i] + ": " + vidaInicial[i]);
                        System.out.println("Ataque do " + herois[i] + ": " + ataque[i]);
                    }
                    break;
                case 3:
                    for (int i = 0; i < vida.length; i++) {
                        for (int j = 0; j < vidaInicial.length; j++) {
                            System.out.println("Vida do " + herois[j] + " do jogador " + (i + 1) + " : " + vida[i][j]);
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < vida.length; i++) {
                        for (int j = 0; j < vidaInicial.length; j++) {
                            vida[i][j] = vidaInicial[j];
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opcção invalida.");
                    break;
            }
        } while (opcaoMenu != 0);
        System.out.println("você saiu do programa.");
    }
}
