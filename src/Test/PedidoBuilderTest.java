package Test;
import main.java.*;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoBuilderTest {

    @Test
    void deveRetornarExcecaoParaPedidoSemNumero() {
        try {
            Pedido pedido = new PedidoBuilder()
                    .setClienteNome("João")
                    .setRestauranteNome("Pizza Place")
                    .adicionarItem("Pizza Calabresa", 30.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número do pedido inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPedidoSemItens() {
        try {
            Pedido pedido = new PedidoBuilder()
                    .setNumero(1)
                    .setClienteNome("João")
                    .setRestauranteNome("Pizza Place")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pedido sem itens", e.getMessage());
        }
    }

    @Test
    void deveRetornarPedidoValido() {
        Pedido pedido = new PedidoBuilder()
                .setNumero(1)
                .setClienteNome("João")
                .setRestauranteNome("Pizza Place")
                .setEnderecoEntrega("Rua das Laranjeiras, 123")
                .adicionarItem("Pizza Calabresa", 30.0)
                .adicionarItem("Refrigerante", 8.0)
                .setFormaPagamento("Cartão")
                .setDataHora(new Date())
                .build();

        assertNotNull(pedido);
        assertEquals(2, pedido.getItens().size());
        assertEquals(38.0, pedido.getValorTotal());
    }
}
