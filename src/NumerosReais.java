import java.util.Scanner;

public class NumerosReais {
    public static void main(String[] args) {
        NumerosReais numerosReais = new NumerosReais();
        numerosReais.obterEntradaUsuario();
    }

    public void obterEntradaUsuario() {
        final int SIM = 1;
        final int NAO = 2;
        Scanner leia = new Scanner(System.in);
        double[] numerosReais = new double[10];
        int executarNovamente = NAO;

        do {
            for (int i = 0; i < numerosReais.length; i++) {
                System.out.print("Informe o " + (i + 1) + "º valor: ");
                numerosReais[i] = leia.nextDouble();
            }

            NumerosReais.mostarVetorFormaInversa(numerosReais);

            do {
                System.out.print("\nDeseja executar novamente? Digite " + SIM + "/ SIM ou " + NAO + " / NÃO: ");
                executarNovamente = leia.nextInt();

                if (executarNovamente != SIM && executarNovamente != NAO) {
                    System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("Opção inválida. Tente novamente!");
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                }
            } while (executarNovamente != SIM && executarNovamente != NAO);

            System.out.println();
        } while (executarNovamente == SIM);

        System.out.println("Saindo...");
    }

    public static void mostarVetorFormaInversa(double[] vetor) {
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
