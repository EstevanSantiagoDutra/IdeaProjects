import java.util.Scanner;

public class Numerosaleatorios {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

            System.out.print("Enter first interger: ");
            number1 = input.nextInt();
            System.out.print("Enter second interger: ");
            number2 = input.nextInt();

            if (number1 == number2)
                System.out.printf("%d == %d%n", number1, number2);
            if (number1 != number2)
                System.out.printf("%d != %d%n", number1, number2);
            if (number1 < number2)
                System.out.printf("%d < %d%n", number1, number2);
            if (number1 > number2)
                System.out.printf("%d > %d%n", number1, number2);
            if (number1 <= number2)
                System.out.printf("%d <= %d%n", number1, number2);
            if (number1 >= number2)
                System.out.printf("%d >= %d%n", number1, number2);

    }


}


