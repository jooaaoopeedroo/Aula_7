import java.util.Scanner;

public class Aula_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("!Insira a idade:");
            int A = sc.nextInt();
            if (A == 0) {
                System.out.println("O programa está encerrando");
                break;
            } else {
                if (A > 0) {
                    if (A >= 18) {
                        if (A >= 60) {
                            System.out.println("Você É idoso!");
                            System.out.println("Você é maior de idade");
                        } else {
                            System.out.println("Você é maior de idade");
                        }
                    } else {
                        System.out.println("Você é criança, necessário pais ou responsáveis");
                    }
                } else {
                    System.out.println("Entrada inválida! Digite novamente.");
                    continue;
                }
            }
        }
        sc.close();
    }

}
