import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Media media = new Media();
        media.obterEntradaUsuario();
    }

    public void obterEntradaUsuario() {
        final int SIM = 1;
        final int NAO = 2;
        Scanner leia = new Scanner(System.in);
        double[] vetorNotas = new double[4];
        double media = 0.0;
        int resposta = NAO;

        do {
            for (int i = 0; i < vetorNotas.length; i++) {
                System.out.print("Informe a " + (i + 1) + "° nota do aluno: ");
                vetorNotas[i] = leia.nextDouble();
            }

            media = Media.calcularMedia(vetorNotas);
            System.out.println("\nA media do aluno é: " + media + ".");

            do {
                System.out.print("\nDeseja calcular a média de outro aluno? " + SIM + " SIM / " + NAO + " NÃO: ");
                resposta = leia.nextInt();
            } while (resposta != SIM && resposta != NAO);
        } while (resposta == SIM);

        System.out.println("\nSaindo...");
    }

    public static double calcularMedia(double[] notas) {
        double media = 0.0;

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;

        return media;
    }
}