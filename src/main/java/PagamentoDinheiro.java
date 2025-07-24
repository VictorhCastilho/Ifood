package main.java;

public class PagamentoDinheiro extends ProcessadorPagamento {

    @Override
    protected void validarPagamento(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para pagamento em dinheiro.");
        }
    }

    @Override
    protected void confirmarPagamento(double valor) {
        // Simula entrega em dinheiro ao entregador
        System.out.println("Pagamento em dinheiro confirmado.");
    }

    @Override
    protected String getMetodo() {
        return "Dinheiro";
    }
}

