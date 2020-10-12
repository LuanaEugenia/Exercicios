import java.util.Scanner;

public class PositivoNegativoOuNeutro {
    final static String NEUTRO = "neutro";
    final static String POSITIVO = "positivo";
    final static String NEGATIVO = "negativo";

    public static void main(String[] args) {
        PositivoNegativoOuNeutro positivoNegativoOuNeutro = new PositivoNegativoOuNeutro();
        positivoNegativoOuNeutro.obterEntradaUsuario();
    }

    public void obterEntradaUsuario() {
        final int SIM = 1;
        final int NAO = 2;
        Scanner leia = new Scanner(System.in);
        double valorUsuario;
        String positivoNegativoNeutro;
        int respostaUsuario = NAO;

        do {
            System.out.print("Digite um valor: ");
            valorUsuario = leia.nextDouble();

            positivoNegativoNeutro = PositivoNegativoOuNeutro.verificarPositivoNegativoNeutro(valorUsuario);
            System.out.println("\n************************************");
            System.out.println("O valor é " + positivoNegativoNeutro + "!");
            System.out.println("************************************");
            do {
                System.out.print("\nDeseja verificar novamente? Digite " + SIM + "/ SIM " + NAO + "/ NÃO: ");
                respostaUsuario = leia.nextInt();
                if (respostaUsuario != SIM && respostaUsuario != NAO) {
                    System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("Digite uma opção válida!");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            } while (respostaUsuario != SIM && respostaUsuario != NAO);
        } while (respostaUsuario == SIM);
        System.out.println("\nSaindo...");
    }

    public static String verificarPositivoNegativoNeutro(double numero) {
        if (numero == 0) return PositivoNegativoOuNeutro.NEUTRO;
        return numero > 0 ? PositivoNegativoOuNeutro.POSITIVO : PositivoNegativoOuNeutro.NEGATIVO;
    }
}