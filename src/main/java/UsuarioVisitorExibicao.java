package main.java;

public class UsuarioVisitorExibicao implements UsuarioVisitor {

    public String exibir(Usuario usuario) {
        return usuario.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{nome='" + cliente.getNome() + "', endereco='" + cliente.getEndereco() + "'}";
    }

    @Override
    public String exibirEntregador(Entregador entregador) {
        return "Entregador{nome='" + entregador.getNome() + "', veiculo='" + entregador.getVeiculo() + "'}";
    }

    @Override
    public String exibirRestaurante(Restaurante restaurante) {
        return "Restaurante{nome='" + restaurante.getNome() + "', categoria='" + restaurante.getCategoria() + "'}";
    }
}

