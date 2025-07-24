package main.java;

public class CancelarPedidoAcao implements AcaoPedido {

    private Pedido pedido;

    public CancelarPedidoAcao(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.cancelar();
    }

    public void cancelar() {
        this.pedido.confirmar();
    }
}

