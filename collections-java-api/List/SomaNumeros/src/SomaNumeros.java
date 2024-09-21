import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class SomaNumeros {

  private List<Lista> listaNumero;

  public SomaNumeros() {
    this.listaNumero = new ArrayList<>();
  }

  public void adicionarNumero(int listNumero) {
    listaNumero.add(new Lista(listNumero));
  }

  public int calcularSoma() {

    int somaNumero = 0;
    for (Lista l : listaNumero) {
      somaNumero += l.getListnumero();

    }
    return somaNumero;
  }

  public int encontrarMaiorNumero() {
    int compareNumero = Integer.MIN_VALUE;

    compareNumero = compararNumero(
        compareNumero,
        (numeroAtual, numeroNovo) -> numeroNovo > numeroAtual);

    return compareNumero;
  }

  public int encontrarMenorNumero() {
    int compareNumero = Integer.MAX_VALUE;

    compareNumero = compararNumero(
        compareNumero,
        (numeroAtual, numeroNovo) -> numeroNovo < numeroAtual);

    return compareNumero;
  }

  public void exibirNumeros() {
    System.out.println(this.listaNumero);

  }

  int compararNumero(int compareNumero, BiPredicate<Integer, Integer> compare) {

    for (Lista l : listaNumero) {
      if (compare.test(compareNumero, l.getListnumero())) {
        compareNumero = l.getListnumero();
      }
    }
    return compareNumero;

  }

}

// public int encontrarMaiorNumero() {
// int compareNumero = Integer.MIN_VALUE;
// for (Lista l : listaNumero) {

// if (compareNumero < l.getListnumero()) {
// compareNumero = l.getListnumero();
// }

// }

// return compareNumero;
// }

// public int encontrarMenorNumero() {
// int compareNumero = Integer.MAX_VALUE;
// for (Lista l : listaNumero) {

// if (compareNumero > l.getListnumero()) {
// compareNumero = l.getListnumero();
// }

// }

// return compareNumero;
// }