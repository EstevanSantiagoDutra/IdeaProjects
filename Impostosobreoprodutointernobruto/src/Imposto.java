import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
      float porcentagem = 0, valorpeca = 0, valorpeca2 = 0, porcentagem2 = 0,
              resultantetotal = 0, IPI = 0;
      int codigo = 0, qtdpeca = 0, codigo2 = 0, qtdpeca2 = 0;

      Scanner entrada = new Scanner(System.in);
          {
              System.out.println("Codigo da peça: ");
              codigo = entrada.nextInt();
              System.out.println("Quantidade de peças 1: ");
              qtdpeca = entrada.nextInt();
              System.out.println("Valor unitario da peça 1: ");
              valorpeca = entrada.nextFloat();

              System.out.println("Codigo da peça 2: ");
              codigo2 = entrada.nextInt();
              System.out.println("Quantidade de peças 2: ");
              qtdpeca2 = entrada.nextInt();
              System.out.println("Valor unitario da peça 2: ");
              valorpeca2 = entrada.nextFloat();
              System.out.println("Valor a ser acrecido: ");
              IPI = entrada.nextFloat();


              resultantetotal = (valorpeca*qtdpeca + valorpeca2*qtdpeca2)*(IPI/100+1);

              System.out.println("O valor das peças é:" + resultantetotal);
      }
    }


}

