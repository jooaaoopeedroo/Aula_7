import java.util.Scanner;

public class Aula_8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println();
       while (true) {
        System.out.print("Insira a cor do CD desejado: ");
        String cd = sc.nextLine();
        if (cd.equals("Azul")) {
            System.out.println("Este CD custa R$10.00!");
            break;
        } else {
            if (cd.equals("Vermelho")) {
                System.out.println("Este CD custa R$20.00!");
                 break;
            } else {
                if (cd.equals("Amarelo")) {
                    break;
                } else {
                    System.out.println("Cor inválida, tente novamente!");
                    
                }

            }
            
        }
        
       } 
    }
    }