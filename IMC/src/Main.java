import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float imc = 0, altura = 0, peso = 0;
        while (imc < 100000) {
            peso = Float.parseFloat(JOptionPane.showInputDialog("Qual é o seu peso atual:"));
            altura = Float.parseFloat((JOptionPane.showInputDialog("Qual a sua altura:")));

            imc = (float) (peso / Math.pow(altura, 2));
            String message =
                    String.format("O seu IMC atual é de: %s ", imc);
            JOptionPane.showMessageDialog(null, message);
        }
        }
}
