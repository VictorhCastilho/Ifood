package main.java;

import java.util.Date;

public class PedidoBuilder {

    private Pedido pedido;

    public PedidoBuilder() {
        pedido = new Pedido();
    }

    public Pedido build() {
        if (pedido.getNumero() <= 0) {
            throw new IllegalArgumentException("Número do pedido inválido");
        }
        if (pedido.getClienteNome() == null || pedido.getClienteNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
        if (pedido.getRestauranteNome() == null || pedido.getRestauranteNome().isEmpty()) {
            throw new IllegalArgumentException("Restaurante inválido");
        }
        if (pedido.getItens().isEmpty()) {
            throw new IllegalArgumentException("Pedido sem itens");
        }
        return pedido;
    }

    public PedidoBuilder setNumero(int numero) {
        pedido.setNumero(numero);
        return this;
    }

    public PedidoBuilder setClienteNome(String nome) {
        pedido.setClienteNome(nome);
        return this;
    }

    public PedidoBuilder setRestauranteNome(String nome) {
        pedido.setRestauranteNome(nome);
        return this;
    }

    public PedidoBuilder adicionarItem(String item, double valor) {
        pedido.adicionarItem(item, valor);
        return this;
    }

    public PedidoBuilder setEnderecoEntrega(String endereco) {
        pedido.setEnderecoEntrega(endereco);
        return this;
    }

    public PedidoBuilder setFormaPagamento(String forma) {
        pedido.setFormaPagamento(forma);
        return this;
    }

    public PedidoBuilder setDataHora(Date dataHora) {
        pedido.setDataHora(dataHora);
        return this;
    }
}

