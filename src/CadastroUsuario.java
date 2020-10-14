import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.obterNomeSenhaUsuario();
    }

    public void obterNomeSenhaUsuario() {
        final int SIM = 1;
        final int NAO = 2;
        Scanner leia = new Scanner(System.in);
        String nome = "";
        String senha = "";
        int repetirCadastro = NAO;
        boolean senhaValida = false;

        do {
            do {
                System.out.print("Digite seu nome: ");
                nome = leia.next();
                System.out.print("Digite uma senha: ");
                senha = leia.next();
                senhaValida = CadastroUsuario.verificarSenha(nome, senha);

                if (!senhaValida) {
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("A senha não pode ser igual ao nome. Tente novamente!");
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                }
            } while (!senhaValida);

            System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println("Cadastro efetuado com Sucesso!");
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

            do {
                System.out.print("\nDeseja cadastrar novamente? Digite: " + SIM + "/ SIM ou " + NAO + "/ NÃO: ");
                repetirCadastro = leia.nextInt();

                if (repetirCadastro != SIM && repetirCadastro != NAO) {
                    System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("Opção inválida. Tente novamente!");
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                }
            } while (repetirCadastro != SIM && repetirCadastro != NAO);

            System.out.println();
        } while (repetirCadastro == SIM);

        System.out.println("Saindo...");
    }

    public static boolean verificarSenha(String nome, String senha) {
        return !nome.equalsIgnoreCase(senha);
    }
}
