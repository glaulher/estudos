public class NavegadorInternet extends Iphone {

  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo a página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando uma nova aba...");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando a página...");
  }
}