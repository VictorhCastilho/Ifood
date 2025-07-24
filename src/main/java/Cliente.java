package main.java;

public class Cliente implements Usuario {

    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String aceitar(UsuarioVisitor visitor) {
        return visitor.exibirCliente(this);
    }
}

