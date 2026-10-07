public class Questao8 {
    public static void main(String[] args) {
        int vidas1 = 3 , vidas2 = 3 , pontos1 = 0 , pontos2 = 0 , rodada = 1;
        while (vidas1 > 0 && vidas2 > 0) {
            int numero1 = (int)(Math.random() * 10) + 1;
            int numero2 = (int)(Math.random() * 10) + 1;
            System.out.println("===== RODADA " + rodada + " =====");
            System.out.println("Jogador 1 tirou: " + numero1);
            System.out.println("Jogador 2 tirou: " + numero2);
            if (numero1 > numero2) {
                pontos1 = pontos1 + 10;
                vidas2 = vidas2 - 1;
                System.out.println("Jogador 1 venceu a rodada!");
                System.out.println("Jogador 2 perdeu uma vida!");
            } 
            else if (numero2 > numero1) {
                pontos2 = pontos2 + 10;
                vidas1 = vidas1 - 1;
                System.out.println("Jogador 2 venceu a rodada!");
                System.out.println("Jogador 1 perdeu uma vida!");
            } 
            else {
                pontos1 = pontos1 + 5;
                pontos2 = pontos2 + 5;
                System.out.println("Empate!");
                System.out.println("Ninguém perdeu vida.");
                System.out.println("Cada jogador recebeu 5 pontos.");
            }
            System.out.println("Vidas do Jogador 1: " + vidas1);
            System.out.println("Pontos do Jogador 1: " + pontos1);
            System.out.println("Vidas do Jogador 2: " + vidas2);
            System.out.println("Pontos do Jogador 2: " + pontos2);
            rodada++;
        }
        System.out.println("===== RESULTADO FINAL =====");
        System.out.println("Jogador 1");
        System.out.println("Vidas: " + vidas1);
        System.out.println("Pontos: " + pontos1);
        System.out.println("Jogador 2");
        System.out.println("Vidas: " + vidas2);
        System.out.println("Pontos: " + pontos2);
        if (pontos1 > pontos2) {
            System.out.println();
            System.out.println("Vencedor: Jogador 1");
        } 
        else if (pontos2 > pontos1) {
            System.out.println("Vencedor: Jogador 2");
        } 
        else {
            System.out.println("Empate");
        }
    }
}
