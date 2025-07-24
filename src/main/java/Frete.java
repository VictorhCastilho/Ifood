package main.java;

public class Frete {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void calcularFrete(float distancia, float valorPedido, EstrategiaFrete estrategia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distancia, valorPedido);
        this.valor = calculadora.calcular(estrategia);
    }
}

