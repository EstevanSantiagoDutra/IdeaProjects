import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroSorteado = gerador.nextInt(100); // sorteia um número de 0 a 99
        System.out.println("O número sorteado é: " + numeroSorteado);
    }
}