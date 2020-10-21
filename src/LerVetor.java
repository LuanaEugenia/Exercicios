import java.util.Scanner;

public class LerVetor {
    public static void main(String[] args) {
        LerVetor lerVetor = new LerVetor();
        lerVetor.obterEntradaUsuario();
    }

    public void obterEntradaUsuario() {
        final int SIM = 1;
        final int NAO = 2;
        Scanner leia = new Scanner(System.in);
        int[] valores = new int[5];
        int executarNovamente = NAO;

        do {
            for (int i = 0; i < valores.length; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                valores[i] = leia.nextInt();
            }

            mostrarVetor(valores);

            do {
                System.out.println("Deseja executar novamente? Digite " + SIM + "/ SIM ou " + NAO + " / NÃO: ");
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

    public void mostrarVetor(int[] valores) {
        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
    }
}
