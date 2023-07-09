package javaapplication7;

public class Main {
    public static void main(String[] args) {
        // Criando o serviço dos Correios
        Correios correios = new Correios();

        // Criando rastreadores
        Rastreador rastreador1 = new Rastreador("Rastreador 1");
        Rastreador rastreador2 = new Rastreador("Rastreador 2");

        // Adicionando rastreadores ao serviço dos Correios
        correios.adicionarRastreador(rastreador1);
        correios.adicionarRastreador(rastreador2);

        // Criando pacotes
        Pacote pacote1 = new Pacote("123456789");
        Pacote pacote2 = new Pacote("987654321");

        // Adicionando pacotes ao serviço dos Correios
        correios.adicionarPacote(pacote1);
        correios.adicionarPacote(pacote2);

        // Atualizando status dos pacotes
        correios.atualizarStatusPacote(pacote1, "Em trânsito");
        correios.atualizarStatusPacote(pacote2, "Saiu para entrega");
        correios.atualizarStatusPacote(pacote1, "Entregue");

        // Removendo um rastreador
        correios.removerRastreador(rastreador2);

        // Atualizando status dos pacotes novamente
        correios.atualizarStatusPacote(pacote2, "Aguardando retirada");

        // Exibindo notificações
        correios.exibirNotificacoes();
    }
}
