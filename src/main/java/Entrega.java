package main.java;

public class Entrega extends Setor {

    private static Entrega instancia = new Entrega();

    private Entrega() {}

    public static Entrega getInstancia() {
        return instancia;
    }

    public boolean verificarEnderecoValido(Pedido pedido) {
        // Simulação de verificação
        return true;
    }
}

