import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

  Set<Palavras> palavrasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasSet.add(new Palavras(palavra));
  }

  public void removerPalavra(String palavra) {
    Palavras palavraRemove = new Palavras(palavra);

    if (!palavrasSet.isEmpty()) {
      if (palavrasSet.contains(palavraRemove)) {
        palavrasSet.remove(palavraRemove);
      } else {
        System.out.println("Palavra não encontrada no conjunto!");
      }
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public String verificarPalavra(String palavra) {
    Palavras palavraExiste = new Palavras(palavra);
    String retornoPalavra = null;

    if (!palavrasSet.isEmpty()) {
      if (palavrasSet.contains(palavraExiste)) {
        retornoPalavra = "Palavra " + palavra + " encontrada no conjunto!";
      } else {
        retornoPalavra = "Palavra não encontrada no conjunto!";
      }
    } else {
      retornoPalavra = "O conjunto está vazio!";
    }

    return retornoPalavra;

  }

  public void exibirPalavrasUnicas() {
    System.out.println(palavrasSet);
  }
}
