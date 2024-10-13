public class CelularUsuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.Ligar(34582060);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("X.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Burna Boy - Gettin' Money");
    }
}
