package main.java;

public class CalculadoraFrete {
    private float distancia;
    private float valorPedido;

    public CalculadoraFrete(float distancia, float valorPedido) {
        this.distancia = distancia;
        this.valorPedido = valorPedido;
    }

    public float calcular(EstrategiaFrete estrategia) {
        return estrategia.calcular(distancia, valorPedido);
    }
}

