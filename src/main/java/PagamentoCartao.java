package main.java;

public class PagamentoCartao extends ProcessadorPagamento {

    @Override
    protected void validarPagamento(double valor) {
        // Simula verificação do limite do cartão
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para pagamento com cartão.");
        }
    }

    @Override
    protected void confirmarPagamento(double valor) {
        // Simula comunicação com operadora de cartão
        System.out.println("Pagamento com cartão aprovado.");
    }

    @Override
    protected String getMetodo() {
        return "Cartão de Crédito";
    }
}

