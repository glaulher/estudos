/**
 * ListaNumero
 */
public class ListaNumero implements Comparable<ListaNumero> {

  private int numero = 0;

  public ListaNumero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  @Override
  public String toString() {
    return "numero= " + numero;
  }

  // Implementação do método compareTo para definir a ordenação
  @Override
  public int compareTo(ListaNumero arg0) {

    return Integer.compare(this.numero, arg0.getNumero());
  }

  // Sobrescreva equals para garantir consistência com compareTo
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    ListaNumero that = (ListaNumero) obj;
    return numero == that.numero;
  }

  // Sempre que sobrescrever equals, também sobrescreva hashCode
  @Override
  public int hashCode() {
    return Integer.hashCode(numero);
  }

}