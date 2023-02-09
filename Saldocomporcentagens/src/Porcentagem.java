import java.util.Scanner;

public class Porcentagem {


 public static void main(String[] args) {
  float valor = 0, porcentagem = 0, resultado = 0;
  Scanner entrada = new Scanner(System.in);

 {
  System.out.println("Digite o valor a ser reajutado: ");
  valor = entrada.nextFloat();
  porcentagem = valor*1/100;
  resultado = porcentagem + valor;
  System.out.println("O valor do reajuste é de: " + resultado);
 }
 }
}
