import java.util.Optional;

public class Exercicio4 {
  // isPresent(): Verifica se o Optional contém um valor não nulo.

  public static void main(String[] args) {
    Optional<String> optionalValue = Optional.of("Hello");
    System.out.println(optionalValue.isPresent());
  }
}
