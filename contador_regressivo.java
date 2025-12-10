import java.util.Scanner;

    public class contador_regressivo {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int n = sc.nextInt();

            for (int i = n; i >= 0; i--) {
                System.out.println(i);
            }

            sc.close();
        }
    }