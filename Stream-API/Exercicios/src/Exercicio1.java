import java.util.Optional;

public class Exercicio1 {

  /*
   * of(value): Cria um Optional contendo o valor fornecido.
   * Se o valor for nulo,
   * lançará uma exceção NullPointerException. *
   */

  public static void main(String[] args) {
    Optional<String> optionalValue = Optional.of("Hello, Java!");
    // Optional<String> optionalValue2 = Optional.of(null);
    System.out.println(optionalValue.get());
    // System.out.println(optionalValue2.get());
  }
}