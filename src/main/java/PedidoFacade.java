package main.java;

public class PedidoFacade {

    public static boolean verificarPedidoParaFinalizacao(Pedido pedido) {
        if (!Estoque.getInstancia().verificarItensEmEstoque(pedido)) {
            return false;
        }
        if (!Pagamento.getInstancia().verificarPagamentoAprovado(pedido)) {
            return false;
        }
        if (!Entrega.getInstancia().verificarEnderecoValido(pedido)) {
            return false;
        }
        pedido.setFinalizado(true);
        return true;
    }
}

