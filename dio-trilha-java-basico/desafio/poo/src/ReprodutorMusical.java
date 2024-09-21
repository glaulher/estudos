public class ReprodutorMusical extends Iphone {

  @Override
  public void tocar() {
    System.out.println("Tocando música...");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música...");
  }

  @Override
  public String selecionarMusica(String musica) {
    System.out.println("Selecionando a música: " + musica);
    return musica;
  }
}