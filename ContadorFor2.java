import java.util.Scanner;

public class ContadorFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número n:");
        int N = sc.nextInt();

        for (int i = 1; i<=N; i++){

            System.out.println("Impressão" + i);
    }
    sc.close();
}
}