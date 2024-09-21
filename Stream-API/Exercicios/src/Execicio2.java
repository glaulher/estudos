import java.util.Optional;

public class Execicio2 {

  /*
   * ofNullable(value): Cria um Optional contendo o valor fornecido,
   * mas permite que o valor seja nulo.
   */

  public static void main(String[] args) {
    String nullableValue = null;
    Optional<String> optionalValue = Optional.ofNullable(nullableValue);
    System.out.println(optionalValue.isPresent());
  }
}
