package Phone;

import Aplicativos.FuncaoInternet;
import Aplicativos.FuncaoTelefone;
import Aplicativos.ReprodutorMusical;

public class Iphone implements FuncaoTelefone, FuncaoInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }

    @Override
    public void editarMensagem() {
        System.out.println("Editando mensagem...");
    }

    @Override
    public void mostrarPagina() {
        System.out.println("Mostrando página...");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void play() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música...");
    }
}
