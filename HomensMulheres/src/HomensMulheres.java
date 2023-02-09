import java.util.Scanner;

public class HomensMulheres {
    public static void main(String[] args) {
        int anos=0, meses=0, dias=0,diasresultantes=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos anos você tem: "); anos = entrada.nextInt();
        System.out.println("Digite quantos meses de vida você tem, de 1 a 12: "); meses = entrada.nextInt();
        System.out.println("Digite quantos dias de vida você tem, de 1 a 365: "); dias = entrada.nextInt();
        diasresultantes= ((anos*365) + (meses*30) + (dias));
        System.out.println("você possui " + diasresultantes + " dias de vida");


        entrada.close();
    }
}

