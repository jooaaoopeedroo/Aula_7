public class SistemaAprovação {

    // Constantes
    static final double NOTA_APROVACAO = 7.0;
    static final double NOTA_RECUPERACAO = 5.0;
    static final double FREQUENCIA_MINIMA = 75.0;

    // Função para verificar a situação do aluno
    public static String verificarSituacao(double media, double frequencia) {
        if (media < 0 || media > 10 || frequencia < 0 || frequencia > 100) return "Dados invalidos";
        if (media >= NOTA_APROVACAO && frequencia >= FREQUENCIA_MINIMA) return "Aprovado";
        if (media >= NOTA_RECUPERACAO && frequencia >= FREQUENCIA_MINIMA) return "Recuperacao";
        return frequencia < FREQUENCIA_MINIMA ? "Reprovado por frequencia" : "Reprovado por nota";
    }

    // Função para classificar o desempenho do aluno
    public static String classificarDesempenho(double media) {
        return media >= 9 ? "Excelente" : media >= 7 ? "Bom" : media >= 5 ? "Regular" : "Insuficiente";
    }

    // Função para verificar menção honrosa
    public static String obterMencaoHonrosa(double media, double frequencia) {
        return (media >= 9.0 && frequencia == 100) ? "Sim" : "Não";
    }

    public static void main(String[] args) {
        // Dados dos alunos (nome, media, frequencia)
        Object[][] alunos = {
            {"Joao Pedro", 8.5, 90},
            {"Matheus", 6.0, 80},
            {"Jairo", 4.5, 85},
            {"Eduardo", 9.5, 100},
            {"Kayo", 8.0, 70}
        };

        // Contadores
        int aprovados = 0, recuperacao = 0, reprovados = 0, mencaoHonrosa = 0;

        // Exibindo os dados dos alunos
        System.out.println("=== SISTEMA DE APROVAÇÃO - TURMA 2026 ===");
        for (int i = 0; i < alunos.length; i++) {
            String nome = (String) alunos[i][0];
            double media = (double) alunos[i][1];
            double frequencia = (double) alunos[i][2];

            String situacao = verificarSituacao(media, frequencia);
            String desempenho = classificarDesempenho(media);
            String mencao = obterMencaoHonrosa(media, frequencia);

            System.out.printf("Aluno %d: %s\n Média: %.1f\n Frequência: %.1f%%\n Desempenho: %s\n Situação: %s\n Menção Honrosa: %s\n\n", 
                               i + 1, nome, media, frequencia, desempenho, situacao, mencao);

            // Contabilizando as situações
            if ("Aprovado".equals(situacao)) aprovados++;
            else if ("Recuperação".equals(situacao)) recuperacao++;
            else if (situacao.startsWith("Reprovado")) reprovados++;
            if ("Sim".equals(mencao)) mencaoHonrosa++;
        }

        // Resumo da turma
        System.out.println("=== RESUMO DA TURMA ===");
        System.out.printf("Total de alunos: %d\nAprovados: %d\nRecuperação: %d\nReprovados: %d\nMenções Honrosas: %d\n",
                           alunos.length, aprovados, recuperacao, reprovados, mencaoHonrosa);
    }
}
