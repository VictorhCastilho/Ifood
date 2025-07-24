package main.java;

public class FretePorDistancia implements EstrategiaFrete {
    public float calcular(float distancia, float valorPedido) {
        return distancia * 1.5f;
    }
}

