import java.util.Scanner;

    public class Tabuada {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Solicita o número ao usuário
            System.out.print("Digite um número para ver a tabuada: ");
            int numero = sc.nextInt();

            // Imprime a tabuada
            System.out.println("\nTabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " * " + i + " = " + (numero * i));
            }

            sc.close();
        }
    }