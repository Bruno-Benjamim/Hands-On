package aula;

public class NumerosPerfeitos {
    public static void main(String[] args) {

        long numero = 2;
        int quantidade = 0;

        while (quantidade < 5) {

            long soma = 0;

            for (long i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    soma = soma + i;
                }
            }

            if (soma == numero) {
                System.out.println(numero);
                quantidade++;
            }

            numero++;
        }
    }
}
