import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[]args){
        int salariomin = 788;
        float salariousi = 0, salarioresult = 0;
        Scanner entrada = new Scanner(System.in);{
            System.out.println("Digite o valor do seu salario: ");
            salariousi = entrada.nextFloat();
            salarioresult = salariousi/salariomin;
            System.out.println("Você ganha " + salarioresult + " salários mínimos" );
        }


    }

}
