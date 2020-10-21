import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        new MediaAluno().obterEntradaUsuario();
    }

    public void obterEntradaUsuario() {
        final int SIM = 1;
        final int NAO = 2;
        DecimalFormat decimalFormat = new DecimalFormat("#0.0");
        Scanner leia = new Scanner(System.in);
        double[][] alunos = new double[10][4];
        double[] medias = new double[10];
        int executarNovamente = NAO;

        do {
            for (int i = 0; i < alunos.length; i++) {
                for (int j = 0; j < alunos[i].length; j++) {
                    System.out.print("Digite a " + (j + 1) + "° nota do " + (i + 1) + "° aluno: ");
                    alunos[i][j] = new Random().nextDouble() * 10;
                    System.out.println(decimalFormat.format(alunos[i][j]));
                }

                medias[i] = MediaAluno.calcularMedia(alunos[i]);
                System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            }

            System.out.println(MediaAluno.contarNotasMaioresQue6(medias) + " alunos tem média maior ou igual a 7.");
            System.out.println(alunos.length - MediaAluno.contarNotasMaioresQue6(medias) + " alunos não tem média maior ou igual a 7.");
            do {
                System.out.print("\nDeseja executar novamente? Digite " + SIM + "/ SIM ou " + NAO + " / NÃO: ");
                executarNovamente = leia.nextInt();

                if (executarNovamente != SIM && executarNovamente != NAO) {
                    System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("Opção inválida. Tente novamente!");
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                }
            } while (executarNovamente != SIM && executarNovamente != NAO);
        }while (executarNovamente == SIM);

        System.out.println("Saindo...");
    }

    public static double somarVetor(double[] numeros) {
        double soma = 0.0;

        for (double numero : numeros) {
            soma += numero;
        }

        return soma;
    }

    public static double calcularMedia(double[] numeros) {
        return MediaAluno.somarVetor(numeros) / numeros.length;
    }

    public static int contarNotasMaioresQue6(double[] numeros) {
        int quantidadeNumerosMaioresQue6 = 0;

        for (double numero : numeros) {
            if (numero >= 7) {
                quantidadeNumerosMaioresQue6++;
            }
        }

        return quantidadeNumerosMaioresQue6;
    }
}
