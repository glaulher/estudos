public class App {
    public static void main(String[] args) throws Exception {

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        reprodutor.tocar();
        reprodutor.pausar();
        String musica = reprodutor.selecionarMusica("You and me - Lifehouse");
        System.out.println("Música selecionada: " + musica);

        telefone.ligar("2197373-0585");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegador.exibirPagina("https://github.com/glaulher");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
