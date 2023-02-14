import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        char[] sexos = new char[5];
        double[] salarios = new double[5];
        double totalSalarios = 0;
        int numHomens = 0;
        int numMulheres = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Funcionário " + (i+1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            // Validação do sexo (só permite 'M' ou 'F')
            boolean sexoValido = false;
            do {
                System.out.print("Sexo (M/F): ");
                sexos[i] = scanner.nextLine().toUpperCase().charAt(0);
                if (sexos[i] == 'M') {
                    numHomens++;
                    sexoValido = true;
                } else if (sexos[i] == 'F') {
                    numMulheres++;
                    sexoValido = true;
                } else {
                    System.out.println("Sexo inválido. Digite 'M' para masculino ou 'F' para feminino.");
                }
            } while (!sexoValido);

            System.out.print("Salário: R$");
            salarios[i] = scanner.nextDouble();
            scanner.nextLine(); // consumir o "\n" após a leitura do double

            totalSalarios += salarios[i];
        }

        double mediaSalarial = totalSalarios / 5;

        System.out.println("\nResumo da folha de pagamento:");
        System.out.println("Média salarial da empresa: R$" + mediaSalarial);
        System.out.println("Número de homens: " + numHomens);
        System.out.println("Número de mulheres: " + numMulheres);
    }
}