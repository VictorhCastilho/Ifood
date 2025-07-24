package main.java;

public class ConfirmarPedidoAcao implements AcaoPedido {

    private Pedido pedido;

    public ConfirmarPedidoAcao(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.confirmar();
    }

    public void cancelar() {
        this.pedido.cancelar();
    }
}

