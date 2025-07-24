package main.java;

public class FreteGratisAcimaDe100 implements EstrategiaFrete {
    public float calcular(float distancia, float valorPedido) {
        if (valorPedido >= 100.0f) {
            return 0.0f;
        }
        return 15.0f;
    }
}

