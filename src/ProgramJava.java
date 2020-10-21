import java.util.Scanner;

public class ProgramJava {
    final static int FAHRENHEIT_PARA_CELSIUS = 1;
    final static int MEDIA_UM_ALUNO = 2;
    final static int MAIOR_NUMERO_ENTRE_DUAS_OPCOES = 3;
    final static int NUMERO_POSITIVO_NEGATIVO_OU_NEUTRO = 4;
    final static int CADASTRO_USUARIO = 5;
    final static int MAIOR_NUMERO_ENTRE_CINCO_OPCOES = 6;
    final static int NUMERO_IMPARES_DENTRO_DO_INTERVALO = 7;
    final static int LER_E_MOSTRAR_VETOR = 8;
    final static int NUMEROS_REAIS_ORDEM_INVERSA = 9;
    final static int MEDIA_DEZ_ALUNOS = 10;
    final static int MENSAGEM_BYTE = 11;
    final static int SAIR = 12;

    public static void main(String[] args) {
        ProgramJava programJava = new ProgramJava();
        programJava.obterEntradaUsuario();
    }

    public void obterEntradaUsuario() {
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            this.mostrarMenu();
            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();

            System.out.println();

            if (opcao != SAIR) {
                escolherOpcao(opcao);
                System.out.println();
            }
        } while (opcao != SAIR);

        System.out.println("Saindo...");
    }

    public void mostrarMenu() {
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°PROGRAM_JAVA°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println(FAHRENHEIT_PARA_CELSIUS + " - Fahrenheit p/ Celsius");
        System.out.println(MEDIA_UM_ALUNO + " - Calcular média de um aluno");
        System.out.println(MAIOR_NUMERO_ENTRE_DUAS_OPCOES + " - Verificar maior número - entre 2 números");
        System.out.println(NUMERO_POSITIVO_NEGATIVO_OU_NEUTRO + " - Verificar número positivo, negativo ou neutro");
        System.out.println(CADASTRO_USUARIO + " - Cadastrar usuário");
        System.out.println(MAIOR_NUMERO_ENTRE_CINCO_OPCOES + " - Verificar maior número - entre 5 números");
        System.out.println(NUMERO_IMPARES_DENTRO_DO_INTERVALO + " - Mostrar números impares em determinado intervalo de números");
        System.out.println(LER_E_MOSTRAR_VETOR + " - Ler e mostrar vetor");
        System.out.println(NUMEROS_REAIS_ORDEM_INVERSA + " - Mostrar vetor de números na ordem inversa");
        System.out.println(MEDIA_DEZ_ALUNOS + " - Calcular média de dez alunos");
        System.out.println(MENSAGEM_BYTE + " - Transformar bytes em mensagem");
        System.out.println(SAIR + " - Sair");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
    }

    public void escolherOpcao(int opcao) {
        switch (opcao) {
            case FAHRENHEIT_PARA_CELSIUS:
                new FahrenheitParaCelsius().obterEntradaUsuario();
                break;
            case MEDIA_UM_ALUNO:
                new Media().obterEntradaUsuario();
                break;
            case MAIOR_NUMERO_ENTRE_DUAS_OPCOES:
                new MaiorNumero().obterEntradaUsuario(2);
                break;
            case NUMERO_POSITIVO_NEGATIVO_OU_NEUTRO:
                new PositivoNegativoOuNeutro().obterEntradaUsuario();
                break;
            case CADASTRO_USUARIO:
                new CadastroUsuario().obterNomeSenhaUsuario();
                break;
            case MAIOR_NUMERO_ENTRE_CINCO_OPCOES:
                new MaiorNumero().obterEntradaUsuario(5);
                break;
            case NUMERO_IMPARES_DENTRO_DO_INTERVALO:
                new NumerosImpares().obterEntradaUsuario();
                break;
            case LER_E_MOSTRAR_VETOR:
                new LerVetor().obterEntradaUsuario();
                break;
            case NUMEROS_REAIS_ORDEM_INVERSA:
                new NumerosReais().obterEntradaUsuario();
                break;
            case MEDIA_DEZ_ALUNOS:
                new MediaAluno().obterEntradaUsuario();
                break;
            case MENSAGEM_BYTE:
                new MensagemByte().obterEntrada();
                break;
            default:
                System.err.println("Opção inválida!");
                break;
        }
    }
}
