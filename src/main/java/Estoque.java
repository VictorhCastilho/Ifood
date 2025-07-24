package main.java;

public class Estoque extends Setor {

    private static Estoque instancia = new Estoque();

    private Estoque() {}

    public static Estoque getInstancia() {
        return instancia;
    }

    public boolean verificarItensEmEstoque(Pedido pedido) {
        // Simulação de verificação
        return true;
    }
}

