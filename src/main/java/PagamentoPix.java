package main.java;

public class PagamentoPix extends ProcessadorPagamento {

    @Override
    protected void validarPagamento(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para pagamento via Pix.");
        }
    }

    @Override
    protected void confirmarPagamento(double valor) {
        // Simula leitura de chave Pix e confirmação instantânea
        System.out.println("Pagamento via Pix realizado.");
    }

    @Override
    protected String getMetodo() {
        return "Pix";
    }
}

