package main.java;

public abstract class ProcessadorPagamento {

    public final String processar(double valor) {
        validarPagamento(valor);
        confirmarPagamento(valor);
        return gerarRecibo(valor);
    }

    protected abstract void validarPagamento(double valor);

    protected abstract void confirmarPagamento(double valor);

    protected String gerarRecibo(double valor) {
        return "Pagamento de R$ " + valor + " realizado com sucesso via " + getMetodo();
    }

    protected abstract String getMetodo();
}

