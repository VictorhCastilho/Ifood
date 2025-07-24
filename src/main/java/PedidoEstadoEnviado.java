package main.java;

public class PedidoEstadoEnviado extends PedidoEstado {

    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();

    private PedidoEstadoEnviado() {}

    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "A caminho";
    }

    @Override
    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }

    // Não pode cancelar quando já está a caminho
}

