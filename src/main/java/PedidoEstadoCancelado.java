package main.java;

public class PedidoEstadoCancelado extends PedidoEstado {

    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();

    private PedidoEstadoCancelado() {}

    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Cancelado";
    }

    // Pedido cancelado, nenhuma ação disponível
}

