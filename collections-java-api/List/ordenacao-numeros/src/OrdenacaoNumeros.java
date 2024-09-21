import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  private List<ListaNumero> listNumero;

  public OrdenacaoNumeros() {
    this.listNumero = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    listNumero.add(new ListaNumero(numero));
  }

  public List<ListaNumero> ordenarAscendente() {
    List<ListaNumero> ascListNumeros = new ArrayList<>(this.listNumero);

    if (!listNumero.isEmpty()) {
      Collections.sort(ascListNumeros);
      return ascListNumeros;
    }
    throw new IllegalStateException("A lista está vazia!");
  }

  public List<ListaNumero> ordenarDescendente() {
    List<ListaNumero> descListNumeros = new ArrayList<>(this.listNumero);

    if (!listNumero.isEmpty()) {
      descListNumeros.sort(Collections.reverseOrder());
      return descListNumeros;
    }
    throw new IllegalStateException("A lista está vazia!");

  }

  public void exibirNumeros() {
    if (!listNumero.isEmpty()) {
      System.out.println(this.listNumero);
    } else {
      System.out.println("Sem numero a exibir!");
    }

  }
}
