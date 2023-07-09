package javaapplication7;

import java.util.ArrayList;
import java.util.List;

class Correios {
    private List<Pacote> pacotes;
    private List<Observer> rastreadores;
    private Notificacao notificacao;

    public Correios() {
        this.pacotes = new ArrayList<>();
        this.rastreadores = new ArrayList<>();
        this.notificacao = new Notificacao();
    }

    public void adicionarPacote(Pacote pacote) {
        pacotes.add(pacote);
    }

    public void removerPacote(Pacote pacote) {
        pacotes.remove(pacote);
    }

    public void adicionarRastreador(Observer rastreador) {
        rastreadores.add(rastreador);
    }

    public void removerRastreador(Observer rastreador) {
        rastreadores.remove(rastreador);
    }

    public void atualizarStatusPacote(Pacote pacote, String novoStatus) {
        pacote.setStatus(novoStatus);
        notificacao.adicionarMensagem("Status do pacote " + pacote.getCodigo() + " atualizado para: " + novoStatus);
        notificarRastreadores("Status do pacote " + pacote.getCodigo() + " atualizado para: " + novoStatus);
    }

    private void notificarRastreadores(String mensagem) {
        for (Observer rastreador : rastreadores) {
            rastreador.update(mensagem);
        }
    }

    public void exibirNotificacoes() {
        notificacao.exibirNotificacoes();
    }
}
