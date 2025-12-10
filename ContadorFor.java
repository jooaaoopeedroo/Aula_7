import java.util.Scanner;

public class ContadorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("--- Verificador de idade com Limitador! ---");
        System.err.println();

        System.err.println("Quantas vezes você quer verificsr:");
        int quantidade = sc.nextInt();

        System.out.println("Insira a idade da pessoa: ");
        int idade = sc.nextInt();
                
                
        if (idade >- 60){ 
            System.out.println("Essa pessoa é Idosa!");
        } else if (idade >= 18){
            System.out.println("Essa pessoa é maior de idade!");
        }
      
    }
}
