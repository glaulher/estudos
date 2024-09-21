import java.util.Optional;

/*
 * orElseThrow(exceptionSupplier): Obtém o valor contido no Optional,
 *  ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.
 */

public class Exercicio9 {
  public static void main(String[] args) {
    Optional<String> optionalValue = Optional.ofNullable(null);
    String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
  }
}
