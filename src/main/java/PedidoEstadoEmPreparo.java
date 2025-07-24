package main.java;

public class PedidoEstadoEmPreparo extends PedidoEstado {

    private static PedidoEstadoEmPreparo instance = new PedidoEstadoEmPreparo();

    private PedidoEstadoEmPreparo() {}

    public static PedidoEstadoEmPreparo getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Em preparo";
    }

    @Override
    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}

