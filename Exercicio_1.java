import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        // Criando o Map para armazenar produtos e preços
        Map<String, Double> produtos = new HashMap<>();

        // Adicionando alguns produtos
        produtos.put("Arroz", 25.50);
        produtos.put("Feijao", 8.90);
        produtos.put("Macarrao", 6.75);
        produtos.put("Leite", 4.20);
        produtos.put("Rapadura", 9.50);
        produtos.put("Farinha de Farofa", 1.30);
        produtos.put("Calango de Sol", 1.99);
        Scanner scanner = new Scanner(System.in);

        // Pedindo o nome do produto ao usuário
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        // Verificando se o produto existe no Map
        if (produtos.containsKey(nomeProduto)) {
            System.out.println("Preço do produto: R$ " + produtos.get(nomeProduto));
        } else {
            System.out.println("Produto não encontrado.");
        }

        scanner.close();
    }
}
