public class App {
    public static void main(String[] args) throws Exception {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas alimento = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        alimento.adicionarPalavra("Arroz");
        alimento.adicionarPalavra("Feijão");
        alimento.adicionarPalavra("Macarrão");
        alimento.adicionarPalavra("Pirão");
        alimento.adicionarPalavra("Feijoada");
        alimento.adicionarPalavra("Rabada");

        // Exibindo as palavras únicas no conjunto
        alimento.exibirPalavrasUnicas();

        // Removendo palavra do conjunto
        alimento.removerPalavra("Arroz");
        alimento.exibirPalavrasUnicas();

        // Removendo uma palavra inexistente
        alimento.removerPalavra("Peixada");

        // Verificando se uma palavra está no conjunto
        System.out.println(alimento.verificarPalavra("Feijão"));
        System.out.println(alimento.verificarPalavra("Pirão"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        alimento.exibirPalavrasUnicas();
    }
}
