package aula;
public class Numeros {
    public static void main(String[] args){
        int n = 1999;
        for (int i = 1000; i <= n; i++){
            if( i %11 == 5){
                System.out.println(i+".");
            }
        }
    }
}
