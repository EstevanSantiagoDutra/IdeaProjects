package src;

import javax.swing.JOptionPane;

public class mediasalarial {
    public static void main(String[] args) {
        double salario1, salario2, salario3, salario4, salario5, media;

        salario1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário da primeira pessoa:"));
        salario2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário da segunda pessoa:"));
        salario3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário da terceira pessoa:"));
        salario4 = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário da quarta pessoa:"));
        salario5 = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário da quinta pessoa:"));

        media = (salario1 + salario2 + salario3 + salario4 + salario5) / 5;

        JOptionPane.showMessageDialog(null, "A média dos salários é: " + String.format("%.2f", media));
    }
}