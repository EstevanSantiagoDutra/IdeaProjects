import javax.swing.*;

import java.util.Scanner;

public class salarios {
    public static void main(String[] args) {
        String[] nome = new String[5];
        String[] sexo = new String[5];
        float[] salario = new float[5];
        StringBuilder mensagem = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        for (int cont = 0; cont <= 4; cont++) {
           nome[cont] = JOptionPane.showInputDialog("Insira o seu nome" );
           mensagem.append("Nome coletado com sucesso ").append(nome[cont]);
           JOptionPane.showMessageDialog(null, mensagem);

            nome[cont] = scanner.next();

            boolean infoValida = false;
            do {
               sexo[cont] = JOptionPane.showInputDialog(null,"Qual o seu sexo, digite masculino ou feminino: ");
                sexo[cont] = scanner.next();
                if (sexo[cont].equalsIgnoreCase("masculino") || sexo[cont].equalsIgnoreCase("feminino")) {
                    System.out.println("Sexo valido");
                    infoValida = true;
                } else {
                    System.out.println("Sexo invalido");
                }
            } while (!infoValida);

            boolean infoValida1 = false;
            do {
                System.out.println("Qual o seu salario: ");
                salario[cont] = Float.parseFloat(scanner.next());

                if (salario[cont] > 0 || salario[cont] < 1000000000 ) {
                    System.out.println("Salario validado");
                    infoValida1 = true;
                } else {
                    System.out.println("Salario invalido");
                }
            } while (!infoValida1);
        }
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += salario[i];
        }
        double media = (soma/5);
        System.out.println("A media salaria da empresa é: " + media);

        }}