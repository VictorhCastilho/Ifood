package main.java;

public class PedidoEstadoConfirmado extends PedidoEstado {

    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();

    private PedidoEstadoConfirmado() {}

    public static PedidoEstadoConfirmado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Confirmado";
    }

    @Override
    public boolean preparar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}

