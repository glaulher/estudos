import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public void dados() {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    String agencia;
    int numero;
    String nomeCliente;
    double saldo;

    System.out.print("Por favor, digite o número da Agência ! ");
    agencia = scanner.next();

    System.out.print("Digite o número da conta: ");
    numero = scanner.nextInt();

    System.out.print("Digite o nome do cliente: ");
    nomeCliente = scanner.next();

    System.out.print("Digite o saldo: ");
    saldo = scanner.nextDouble();

    // Exibindo os dados

    System.out.println("Olá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numero +
        " e seu saldo " + saldo +
        " já está disponível para saque.");

    scanner.close();
  }
}