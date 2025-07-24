package Test;
import main.java.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FreteTest {

    @Test
    void deveCalcularFreteFixo() {
        Frete frete = new Frete();
        frete.calcularFrete(5.0f, 50.0f, new FreteFixo());
        assertEquals(10.0f, frete.getValor());
    }

    @Test
    void deveCalcularFretePorDistancia() {
        Frete frete = new Frete();
        frete.calcularFrete(10.0f, 50.0f, new FretePorDistancia());
        assertEquals(15.0f, frete.getValor());
    }

    @Test
    void deveCalcularFreteGratisParaPedidoAcimaDe100() {
        Frete frete = new Frete();
        frete.calcularFrete(10.0f, 150.0f, new FreteGratisAcimaDe100());
        assertEquals(0.0f, frete.getValor());
    }

    @Test
    void deveCalcularFreteNormalParaPedidoAbaixoDe100() {
        Frete frete = new Frete();
        frete.calcularFrete(10.0f, 90.0f, new FreteGratisAcimaDe100());
        assertEquals(15.0f, frete.getValor());
    }

    @Test
    void deveCalcularFreteComo10PorcentoDoPedido() {
        Frete frete = new Frete();
        frete.calcularFrete(0.0f, 200.0f, new FretePercentualDoPedido());
        assertEquals(20.0f, frete.getValor());
    }
}

