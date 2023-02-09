import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        int x = 0, y = 0, z = 0, a = 0, b = 0, c = 0;
        float resultado1 = 0, resultado2 = 0, resultadofinal = 0;

        Scanner entrada = new Scanner (System.in);{
            System.out.println("digite um numero qualquer");
            x = entrada.nextInt();
            System.out.println("digite um numero qualquer");
            y = entrada.nextInt();
            System.out.println("digite um numero qualquer");
            z = entrada.nextInt();

            System.out.println("digite um numero qualquer");
            a = entrada.nextInt();
            System.out.println("digite um numero qualquer");
            b = entrada.nextInt();
            System.out.println("digite um numero qualquer");
            c = entrada.nextInt();

            resultado1 = (x+y+z)/3;
            resultado2 = (a+b+c)/3;

            resultadofinal = resultado1+resultado2;

            System.out.println("o valor final é: "+ resultadofinal);


        }

    }
}
