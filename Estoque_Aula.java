import java.util.Scanner;
public class Estoque_Aula {

    public static void main(String[] args) {

        // Vetores paralelos
        String[] produtos = {"Arroz", "Feijão", "Açúcar", "Óleo", "Café"};
        int[] quantidades = {20, 5, 12, 8, 30};
        double[] precos = {25.50, 8.90, 4.75, 9.30, 18.40};

        double valorTotalEstoque = 0;
        double somaPrecos = 0;

        // Inicialização para mais caro e mais barato
        double maiorPreco = precos[0];
        double menorPreco = precos[0];
        String produtoMaisCaro = produtos[0];
        String produtoMaisBarato = produtos[0];

        System.out.println("=== PRODUTOS COM ESTOQUE BAIXO (menos de 10 unidades) ===");

        // Laço principal
        for (int i = 0; i < produtos.length; i++) {

            // Valor total do estoque
            valorTotalEstoque += quantidades[i] * precos[i];
            somaPrecos += precos[i];

            // Estoque baixo
            if (quantidades[i] < 10) {
                System.out.println(produtos[i] + " - Quantidade: " + quantidades[i]);
            }

            // Produto mais caro
            if (precos[i] > maiorPreco) {
                maiorPreco = precos[i];
                produtoMaisCaro = produtos[i];
            }

            // Produto mais barato
            if (precos[i] < menorPreco) {
                menorPreco = precos[i];
                produtoMaisBarato = produtos[i];
            }
        }

        // Valor médio dos produtos
        double precoMedio = somaPrecos / produtos.length;

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Valor total do estoque: R$ " + valorTotalEstoque);
        System.out.println("Produto mais caro: " + produtoMaisCaro + " - R$ " + maiorPreco);
        System.out.println("Produto mais barato: " + produtoMaisBarato + " - R$ " + menorPreco);
        System.out.println("Preço médio dos produtos: R$ " + precoMedio);
    }
}