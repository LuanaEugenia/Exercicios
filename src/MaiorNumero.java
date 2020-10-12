import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        MaiorNumero maiorNumero = new MaiorNumero();
        maiorNumero.obterEntradaUsuario();
    }

    public void obterEntradaUsuario() {
        final int SIM = 1;
        final int NAO = 2;
        Scanner leia = new Scanner(System.in);
        double[] numeros = new double[2];
        double maiorNumero = 0.0;
        int resposta = NAO;

        do {
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o " + (i + 1) + "° número: ");
                numeros[i] = leia.nextDouble();
            }

            maiorNumero = MaiorNumero.verificarMaiorNumero(numeros);
            System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("O maior  número é: " + maiorNumero);
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            do {
            System.out.print("\nDeseja verificar novamente? " + SIM + "/SIM OU " + NAO + "/NÃO: ");
            resposta = leia.nextInt();

                if (resposta != SIM && resposta != NAO) {
                    System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
                    System.out.println("Opção inválida. Tente novamente!");
                    System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
                }
            } while (resposta != SIM && resposta != NAO);
        } while (resposta == SIM);

        System.out.println("Saindo...");
    }

    public static double verificarMaiorNumero(double[] numeros) {
        double maiorNumero = 0.0;

        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                maiorNumero = numeros[i];
            } else {
                maiorNumero = Math.max(maiorNumero, numeros[i]);
            }
        }
        return maiorNumero;
    }
}

