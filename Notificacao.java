package javaapplication7;

import java.util.ArrayList;
import java.util.List;

class Notificacao {
    private List<String> mensagens;

    public Notificacao() {
        this.mensagens = new ArrayList<>();
    }

    public void adicionarMensagem(String mensagem) {
        mensagens.add(mensagem);
    }

    public void exibirNotificacoes() {
        System.out.println("----- NOTIFICAÇÕES -----");
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }
        System.out.println("------------------------");
    }
}
