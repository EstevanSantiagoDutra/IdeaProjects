import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, result;
        System.out.println("Digite um numero");
        x = input.nextInt();
        System.out.println("Digite um numero");
        y = input.nextInt();
        System.out.println("Digite um numero");
        z = input.nextInt();
        result = x * y * z;
        System.out.printf("produto é: %s%n", result);
    }
    }