import java.util.Scanner;
public class vetor {
    public static void main (String[] arg){

        Scanner input = new Scanner(System.in);

        int numAlunos = 5;
        double[] notasAlunos = new double[numAlunos];

        for (int i=0;i < numAlunos;++i){
            System.out.println("Insira a nota do Aluno " + (i+1) + "° aluno.");
            notasAlunos[i] = input.nextDouble();
        }

    }
}
