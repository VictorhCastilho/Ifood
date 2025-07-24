package main.java;

public class Entregador implements Usuario {

    private String nome;
    private String veiculo;

    public Entregador(String nome, String veiculo) {
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public String getVeiculo() {
        return veiculo;
    }

    @Override
    public String aceitar(UsuarioVisitor visitor) {
        return visitor.exibirEntregador(this);
    }
}

