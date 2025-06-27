public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " ...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação ...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz ...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url + " ...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba ...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página ...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música ...");
    }

    @Override
    public void pausa() {
        System.out.println("Pausando música ...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada!");
    }
}
