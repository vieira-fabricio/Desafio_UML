import Phone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone ip = new Iphone();
        System.out.println("Modo telefone");
        ip.ligar();
        ip.atender();
        ip.correioDeVoz();
        System.out.println("Modo mensagem");
        ip.enviarMensagem();
        ip.receberMensagem();
        ip.editarMensagem();
        System.out.println("Modo internet");
        ip.mostrarPagina();
        ip.abrirNovaAba();
        ip.atualizarPagina();
        System.out.println("Modo reprodutor musical");
        ip.play();
        ip.pause();
        ip.selecionarMusica();

    }
}