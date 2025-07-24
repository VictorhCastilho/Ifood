package Test;

import main.java.PagamentoCartao;
import main.java.PagamentoPix;
import main.java.PagamentoDinheiro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessadorPagamentoTest {

    @Test
    void deveProcessarPagamentoCartao() {
        PagamentoCartao pagamento = new PagamentoCartao();
        String recibo = pagamento.processar(100.0);
        assertEquals("Pagamento de R$ 100.0 realizado com sucesso via Cartão de Crédito", recibo);
    }

    @Test
    void deveProcessarPagamentoPix() {
        PagamentoPix pagamento = new PagamentoPix();
        String recibo = pagamento.processar(50.0);
        assertEquals("Pagamento de R$ 50.0 realizado com sucesso via Pix", recibo);
    }

    @Test
    void deveProcessarPagamentoDinheiro() {
        PagamentoDinheiro pagamento = new PagamentoDinheiro();
        String recibo = pagamento.processar(30.0);
        assertEquals("Pagamento de R$ 30.0 realizado com sucesso via Dinheiro", recibo);
    }

    @Test
    void deveLancarExcecaoValorInvalido() {
        PagamentoCartao pagamento = new PagamentoCartao();
        assertThrows(IllegalArgumentException.class, () -> pagamento.processar(0));
    }
}

