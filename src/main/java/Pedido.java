package main.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private int numero;
    private String clienteNome;
    private String restauranteNome;
    private List<String> itens;
    private String enderecoEntrega;
    private String formaPagamento;
    private double valorTotal;
    private Date dataHora;

    private PedidoEstado estado;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
        this.estado = PedidoEstadoNovo.getInstance();
    }

    // Getters e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getRestauranteNome() {
        return restauranteNome;
    }

    public void setRestauranteNome(String restauranteNome) {
        this.restauranteNome = restauranteNome;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public void adicionarItem(String item, double valor) {
        this.itens.add(item);
        this.valorTotal += valor;
    }

    // Métodos do padrão State

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public String getEstadoAtual() {
        return estado.getEstado();
    }
}
