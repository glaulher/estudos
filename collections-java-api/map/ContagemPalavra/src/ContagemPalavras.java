import java.util.HashMap;
import java.util.Map;

/**
 * ContagemPalavras
 */
public class ContagemPalavras {

  private Map<String, Integer> contePalavras;

  public ContagemPalavras() {
    this.contePalavras = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem) {
    contePalavras.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    if (!contePalavras.isEmpty()) {
      System.err.println(palavra + " removida!");
      contePalavras.remove(palavra);
    } else {
      System.err.println("lista de palavras vazia");
    }
  }

  public void exibirContagemPalavras() {
    int contagemTotal = 0;
    for (int contagem : contePalavras.values()) {
      contagemTotal += contagem;
    }
    System.out.println("Existem " + contagemTotal + " palavras.");
  }

  public String encontrarPalavrasMaisFrequente() {

    String linguagemMaisFrequente = null;
    int maiorContagem = Integer.MIN_VALUE;

    for (Map.Entry<String, Integer> entry : contePalavras.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        linguagemMaisFrequente = entry.getKey();
      }
    }
    return linguagemMaisFrequente;
  }

}
