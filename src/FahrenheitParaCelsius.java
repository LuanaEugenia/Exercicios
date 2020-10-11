import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        FahrenheitParaCelsius fahrenheitParaCelsius = new FahrenheitParaCelsius();
        fahrenheitParaCelsius.obterEntradaUsuario();
    }

    public void obterEntradaUsuario() {
        final int SIM = 1;
        final int NAO = 2;
        Scanner leia = new Scanner(System.in);
        double temperaturaFahrenheit;
        double temperaturaCelsius = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("#0.0");
        int resposta = NAO;

        do {
            System.out.print("Informe a temperatura em Fahrenheit que deseja converter: ");
            temperaturaFahrenheit = leia.nextDouble();

            temperaturaCelsius = FahrenheitParaCelsius.converter(temperaturaFahrenheit);
            System.out.println(decimalFormat.format(temperaturaFahrenheit) + " Fº é equivalente a " + decimalFormat.format(temperaturaCelsius) + " Cº");
            System.out.print("\nDeseja converter novamente? 1 SIM / 2 NÃO: ");
            System.out.println();
            resposta = leia.nextInt();
        } while (resposta == SIM);

        System.out.println("Saindo...");
    }

    public static double converter(double fahrenheit) {
        return 5 * ((fahrenheit - 32) / 9);
    }
}
