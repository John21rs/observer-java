package javaapplication7;

class Rastreador implements Observer {
    private String nome;

    public Rastreador(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println(nome + " - Nova notificação: " + mensagem);
    }
}
