import java.text.DecimalFormat;
import java.util.Scanner;

public class MensagemByte {
    public static void main(String[] args) {
        new MensagemByte().obterEntrada();

    }

    public void obterEntrada() {
        final int SIM = 1;
        final int NAO = 2;
        int executarNovamente = NAO;

        do {
            Scanner leia = new Scanner(System.in);
            String mensagemBytes;

            System.out.print("Digite a mensagem em bytes separado por espaço: ");
            mensagemBytes = leia.nextLine();

            System.out.println(this.converterMensagem(mensagemBytes));
            do {
                System.out.print("\nDeseja executar novamente? Digite " + SIM + "/ SIM ou " + NAO + " / NÃO: ");
                executarNovamente = leia.nextInt();

                if (executarNovamente != SIM && executarNovamente != NAO) {
                    System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("Opção inválida. Tente novamente!");
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                }
            } while (executarNovamente != SIM && executarNovamente != NAO);
        } while (executarNovamente == SIM);
    }

    public String converterMensagem(String mensagemBytes) {
        String[] bytesMensagem = mensagemBytes.split(" ");
        StringBuilder mensagemConvetida = new StringBuilder();

        for (String byteCaracter : bytesMensagem) {
            mensagemConvetida.append((char) Byte.valueOf(byteCaracter).byteValue());
        }

        return mensagemConvetida.toString();
    }
}
