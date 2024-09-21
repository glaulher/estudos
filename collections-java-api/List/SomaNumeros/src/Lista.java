/**
 * Lista
 */
public class Lista {

  private int listNumero;

  public Lista(int listNumero) {
    this.listNumero = listNumero;
  }

  public int getListnumero() {
    return listNumero;
  }

  @Override
  public String toString() {
    return "Numero= " + listNumero;
  }

}