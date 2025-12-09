import java.util.Scanner;

public class PesoDoPeixe2 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Calculadora de multa - Pescado ");
    System.out.println();

    System.out.println("Insira o peso dos Pesados!");
    int P = sc.nextInt();

    if (P > 50){
        int E = P - 50;
        int M = E * 4;
        System.out.printf("O valor da multa è R% %d\n", M);
        System.out.printf("O excesso é %d\n", E);
    } else {
        System.out.println("O valor da multa e do excesso é 0!");
        

}
}    
}
