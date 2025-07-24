package main.java;

public interface UsuarioVisitor {
    String exibirCliente(Cliente cliente);
    String exibirEntregador(Entregador entregador);
    String exibirRestaurante(Restaurante restaurante);
}

