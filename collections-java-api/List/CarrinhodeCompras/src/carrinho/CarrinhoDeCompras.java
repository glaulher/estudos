package carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> listItem;

  public CarrinhoDeCompras() {
    this.listItem = new ArrayList<>();

  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    listItem.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> removeItem = new ArrayList<>();

    for (Item i : listItem) {
      if (i.getNome().equalsIgnoreCase(nome)) {
        removeItem.add(i);
      }
    }
    listItem.removeAll(removeItem);
  }

  public double calcularValorTotal(double preco) {

    for (Item i : listItem) {
      double valorTotaldotem = i.getPreco() * i.getQuantidade();
      preco += valorTotaldotem;
    }
    return preco;
  }

  public void exibirItens() {
    System.out.println(this.listItem);
  }

}