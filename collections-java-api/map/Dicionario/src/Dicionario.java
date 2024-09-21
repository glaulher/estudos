import java.util.HashMap;
import java.util.Map;

/**
 * Dicionario
 */
public class Dicionario {

  private Map<String, String> dicionarioMap;

  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionarioMap.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    if (!dicionarioMap.isEmpty()) {
      System.err.println(palavra + " removida!");
      dicionarioMap.remove(palavra);
    } else {
      System.err.println("lista de palavras vazia");
    }
  }

  public void exibirPalavras() {
    System.out.println(dicionarioMap);
  }

  public String pesquisarPorPalavra(String palavra) {
    String pesquisaPalavra = dicionarioMap.get(palavra);

    if (pesquisaPalavra != null) {
      return pesquisaPalavra;

    } else {
      return "Linguagem não encontrada no dicionário.";
    }
  }
}
