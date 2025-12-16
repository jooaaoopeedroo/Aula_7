import java.util.Scanner;

public class advinhar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = input.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        input.close();
    }
}