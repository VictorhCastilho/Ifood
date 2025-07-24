package main.java;

public class PedidoEstadoNovo extends PedidoEstado {

    private static PedidoEstadoNovo instance = new PedidoEstadoNovo();

    private PedidoEstadoNovo() {}

    public static PedidoEstadoNovo getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Novo";
    }

    @Override
    public boolean confirmar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}

