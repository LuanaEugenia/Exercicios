import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        NumerosImpares numerosImpares = new NumerosImpares();
        numerosImpares.obterEntradaUsuario();
    }

    public void obterEntradaUsuario() {
        final int SIM = 1;
        final int NAO = 2;
        Scanner leia = new Scanner(System.in);
        int inicioIntervalo;
        int fimIntervalo;
        int repetirNovamente = NAO;

        do {
            System.out.print("Informe o ínico do programa: ");
            inicioIntervalo = leia.nextInt();
            System.out.print("Informe o final do programa: ");
            fimIntervalo = leia.nextInt();

            System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº");
            for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
                if (NumerosImpares.verificarImpar(i)) {
                    System.out.println(i);
                }
            }

            for (int i = inicioIntervalo; i >= fimIntervalo; i--) {
                if (NumerosImpares.verificarImpar(i)) {
                    System.out.println(i);
                }
            }
            System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº");

            do {
                System.out.print("\nDeseja verificar novamente: Digite: " + SIM + "/SIM ou " + NAO + "/ NÃO: ");
                repetirNovamente = leia.nextInt();
                if (repetirNovamente != SIM && repetirNovamente != NAO) {
                    System.out.println("\nºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº");
                    System.out.println("Experimente digitar a resposta CORRETA!");
                    System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº");
                }
            } while (repetirNovamente != SIM && repetirNovamente != NAO);

            System.out.println();
        } while (repetirNovamente == SIM);

        System.out.println("\n Saindo...");
    }

    public static boolean verificarImpar(int numero) {
        return numero % 2 != 0;
    }
}
