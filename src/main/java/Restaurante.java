package main.java;

public class Restaurante implements Usuario {

    private String nome;
    private String categoria;

    public Restaurante(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String aceitar(UsuarioVisitor visitor) {
        return visitor.exibirRestaurante(this);
    }
}

