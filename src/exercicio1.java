import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        System.out.println("Digite um numero inteiro, negativo ou positivo");

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero<0) {
            System.out.println("NEGATIVO");
        }
        else{
                System.out.println("NAO NEGATIVO");
        }
        sc.close();
    }
}
