package main.java;

public class ClienteObserver implements Observer {

    private String nome;

    public ClienteObserver(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("[" + nome + "] O pedido #" + pedido.getNumero() +
                " agora está no estado: " + pedido.getEstadoAtual());
    }
}

