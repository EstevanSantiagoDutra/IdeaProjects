import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int diadaSemana = 0;
        while (diadaSemana < 10000) {
            System.out.println("Entre com um dia da semana de (1 a 7): ");

            diadaSemana = Integer.parseInt((input.next()));
            switch (diadaSemana) {

                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terça");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
                default:
                    System.out.println("Erro, o dia não é valido");
            }
        }
    }
}