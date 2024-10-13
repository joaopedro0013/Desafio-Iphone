public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical {
  
    // aparelho telefonico
    @Override
    public void Ligar(int numero) {
        // TODO Auto-generated method stub
        System.out.println("Ligando para o numero " + numero );
       
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo chamada de alguma pessoa!");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Escutando a mensagem no correio de voz");
    }


    //reprodutor musical
    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Escutando a mensagem no correio de voz");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausar a musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("Tocando a musica:" + musica);
       
    }


    // NAVEGADOR INTERNERT
    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println("Exebindo a pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Adicionar nova ABA!");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando Pagina!");
    }


    
    

    
    
}
