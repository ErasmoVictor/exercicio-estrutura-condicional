import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para descobrir se ele é PAR ou IMPAR");

        int N = sc.nextInt();

        if (N%2==0){
            System.out.println("O numero é PAR");
        }
        else{
            System.out.println("O numero é IMPAR");
        }
        sc.close();
    }
}
