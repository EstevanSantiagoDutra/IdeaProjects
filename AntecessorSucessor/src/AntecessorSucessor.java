import java.util.Scanner;

public class AntecessorSucessor {
    public static void main (String[] args) {
        int numero = 0, antnumero = 0, susnumero = 0;
        Scanner entrada = new Scanner(System.in);
        {
            System.out.println("Digite um número:");
            numero = entrada.nextInt();
            antnumero = numero-1;
            susnumero = numero+1;
            System.out.println("O resultado do numero antecessor é: " + antnumero + " e o numero sucessor é "+ susnumero);
        }
    }
}
