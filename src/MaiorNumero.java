import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        MaiorNumero maiorNumero = new MaiorNumero();
        maiorNumero.obterEntradaUsuario(2);
    }

    public void obterEntradaUsuario(int tamanhoArray) {
        final int SIM = 1;
        final int NAO = 2;
        Scanner leia = new Scanner(System.in);
        double[] numeros = new double[tamanhoArray];
        double maiorNumero = 0.0;
        int repetirBuscarMaiorNUmero = NAO;

        do {
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o " + (i + 1) + "° número: ");
                numeros[i] = leia.nextDouble();
            }

            maiorNumero = MaiorNumero.verificarMaiorNumero(numeros);
            System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println("O maior  número é: " + maiorNumero);
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            do {
                System.out.print("\nDeseja verificar novamente? " + SIM + "/SIM OU " + NAO + "/NÃO: ");
                repetirBuscarMaiorNUmero = leia.nextInt();

                if (repetirBuscarMaiorNUmero != SIM && repetirBuscarMaiorNUmero != NAO) {
                    System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("Opção inválida. Tente novamente!");
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                }
            } while (repetirBuscarMaiorNUmero != SIM && repetirBuscarMaiorNUmero != NAO);

            System.out.println();
        } while (repetirBuscarMaiorNUmero == SIM);

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
