package main.java;

public class FretePercentualDoPedido implements EstrategiaFrete {
    public float calcular(float distancia, float valorPedido) {
        return valorPedido * 0.10f;
    }
}

