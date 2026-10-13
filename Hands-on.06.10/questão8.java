package aula;
import java.util.Scanner;
/* altura 1 = chico
 * altura 2 = zé
 */
public class Crescimento{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double altura1 = 1.50 , altura2 = 1.10; 
        int anos = 0;
        do{
            altura1 +=  0.02;
            altura2 += 0.03;
            anos++;
        } while (altura1 >= altura2);
        System.out.println(" A altura de Zé vai ser maior que à de Chico em "+anos+" anos"+".");
        System.out.printf(" A altura de Chico em %d vai ser de %.2f.\n", anos , altura1);
        System.out.printf(" A altura de Zé em %d vai ser de %.2f.", anos , altura2);
        sc.close();
    }
}
