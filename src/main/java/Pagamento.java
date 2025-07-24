package main.java;

public class Pagamento extends Setor {

    private static Pagamento instancia = new Pagamento();

    private Pagamento() {}

    public static Pagamento getInstancia() {
        return instancia;
    }

    public boolean verificarPagamentoAprovado(Pedido pedido) {
        // Simulação de verificação
        return true;
    }
}

