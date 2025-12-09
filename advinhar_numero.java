import java.util.Scanner;

public class advinhar_numero {
    public static void main(String[] args) {
        String codigoSecreto = "5012";
        Scanner sc = new Scanner(System.in);

        int tentativas = 0;
        int numeroDigitado = 0;
        int numerosecreto = 1512;
        while (true) {
            System.out.print("Digite um número (1-100): ");
            numeroDigitado = sc.nextInt();

            tentativas = tentativas + 1;
            // Verificar se acertou.
            if (numeroDigitado == numerosecreto) {
                System.out.println("Você Acertou!");
                break;
            } else if (tentativas == 1000) {// Verificar limite de tentativas.
                System.out.println("Limite atingido. O número era" + numerosecreto);
                break;
            } else {
                System.out.println("Tente novamente");
                continue;
            }
            // Caso erre, continua pedindo outro número.
        }
        sc.close();
    }

}
