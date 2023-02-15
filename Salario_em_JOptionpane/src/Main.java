import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double salarioTotal = 0;
        int qtdHomens = 0, qtdMulheres = 0, qtdFuncionarios = 0;

        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
            if (nome.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(null, "Nome inválido. Digite novamente.");
                continue;
            }

            String sexo = JOptionPane.showInputDialog("Digite o sexo do funcionário (M ou F):");
            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                JOptionPane.showMessageDialog(null, "Sexo inválido. Digite novamente.");
                continue;
            }

            double salario;
            try {
                salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Salário inválido. Digite novamente.");
                continue;
            }

            salarioTotal += salario;
            qtdFuncionarios++;
            if (sexo.equalsIgnoreCase("M")) {
                qtdHomens++;
            } else {
                qtdMulheres++;
            }

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro funcionário?", "Cadastro de funcionários", JOptionPane.YES_NO_OPTION);
            if (opcao != JOptionPane.YES_OPTION) {
                break;
            }
        }

        if (qtdFuncionarios > 0) {
            double mediaSalarial = salarioTotal / qtdFuncionarios;
            JOptionPane.showMessageDialog(null, String.format("Média salarial: R$ %.2f\nQuantidade de homens: %d\nQuantidade de mulheres: %d", mediaSalarial, qtdHomens, qtdMulheres));
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
        }
    }
}