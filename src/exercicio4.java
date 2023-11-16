import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaT;

        System.out.println("Escreva o horario inicial do jogo");
        int horaI = sc.nextInt();

        System.out.println("Escreva o horario final do jogo");
        int horaF = sc.nextInt();

        if (horaI<horaF)
        {
             horaT = horaF - horaI;

        }
        else {
            horaT = 24 - horaI + horaF;
        }
        System.out.println("O jogo durou "+ horaT+" horas");
    }
}
