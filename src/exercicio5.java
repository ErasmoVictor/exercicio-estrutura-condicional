import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o item que vc deseja ");
        int cod = sc.nextInt();

        System.out.println("Digite a quantidade do item ");
        int qntI = sc.nextInt();

        double total = 0;
        if (cod == 1){
            total = qntI*4.00;

        } else if (cod == 2) {
            total = qntI*4.50;

        } else if (cod == 3) {
            total = qntI*5.00;

        } else if (cod == 4) {
            total = qntI*2.00;

        }else if (cod == 5){
            total = qntI*1.50;

        }
        System.out.printf("Total: R$ %.2f%n" ,total);

        sc.close();
    }
}
