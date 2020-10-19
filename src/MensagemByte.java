import java.util.Scanner;

public class MensagemByte {
    public static void main(String[] args) {
        new MensagemByte().obterEntrada();
    }

    public void obterEntrada() {
        Scanner leia = new Scanner(System.in);
        String mensagemBytes;

        System.out.print("Digite a mensagem em bytes separado por espaço: ");
        mensagemBytes = leia.nextLine();

        System.out.println(this.converterMensagem(mensagemBytes));
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
