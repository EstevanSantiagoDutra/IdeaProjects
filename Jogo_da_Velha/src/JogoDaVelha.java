import java.util.Scanner;

public class JogoDaVelha {
    private enum Celula {VAZIO, JOGADOR1, JOGADOR2};
    private Celula[][] grade = new Celula[3][3];

    public JogoDaVelha() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grade[i][j] = Celula.VAZIO;
            }
        }
    }

    public void exibirGrade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grade[i][j].toString() + " ");
            }
            System.out.println();
        }
    }

    public boolean jogar(int linha, int coluna, Celula jogador) {
        if (grade[linha][coluna] == Celula.VAZIO) {
            grade[linha][coluna] = jogador;
            return true;
        }
        return false;
    }

    public boolean verificarDerrota(Celula jogador) {
        for (int i = 0; i < 3; i++) {
            if (grade[i][0] == jogador && grade[i][1] == jogador && grade[i][2] == jogador) {
                return true;
            }
            if (grade[0][i] == jogador && grade[1][i] == jogador && grade[2][i] == jogador) {
                return true;
            }
        }
        if (grade[0][0] == jogador && grade[1][1] == jogador && grade[2][2] == jogador) {
            return true;
        }
        if (grade[0][2] == jogador && grade[1][1] == jogador && grade[2][0] == jogador) {
            return true;
        }
        return false;
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grade[i][j] == Celula.VAZIO) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        Scanner scanner = new Scanner(System.in);

        Celula jogadorAtual = Celula.JOGADOR1;
        while (true) {
            System.out.println("Jogador " + jogadorAtual.toString() + ", sua vez:");
            jogo.exibirGrade();

            int linha, coluna;
            do {
                System.out.print("Linha (1-3): ");
                linha = scanner.nextInt() - 1;
                System.out.print("Coluna (1-3): ");
                coluna = scanner.nextInt() - 1;
            } while (!jogo.jogar(linha, coluna, jogadorAtual));

            if (jogo.verificarDerrota(jogadorAtual)) {
                System.out.println("Jogador " + jogadorAtual.toString() + " venceu!");
                break;
            } else if (jogo.verificarEmpate()) {
                System.out.println("Empate!");
                break;
            }

            jogadorAtual = (jogadorAtual == Celula.JOGADOR1) ? Celula.JOGADOR2 : Celula.JOGADOR1;
        }
    }
}