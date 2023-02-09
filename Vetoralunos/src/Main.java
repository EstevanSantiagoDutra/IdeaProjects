import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        double[] notas = new double[5];
        Scanner teclado = new Scanner(System.in);

        for (int cont = 0; cont <= 4; cont++) {
            System.out.println("Entre com o nome do Aluno nº " + (cont + 1));
            nomes[cont] = teclado.nextLine();
            System.out.println("Entre com o nota do Aluno nº " + (cont + 1));
            notas[cont] = Double.parseDouble(teclado.nextLine());
        }
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        double media = (soma/5);
        System.out.println("Média = " + media);

        for (int i = 0; i < 5; i++) {
            if (notas[i]>=media) {
                System.out.println("Aluno n°" + i + " : "+nomes[i]+" Passou com nota: " + notas[i]);
            }
        }
    }
}