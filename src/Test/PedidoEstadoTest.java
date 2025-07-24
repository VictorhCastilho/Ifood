package Test;
import main.java.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoEstadoTest {

    @Test
    public void testFluxoPedido() {
        Pedido pedido = new Pedido();

        assertEquals("Novo", pedido.getEstadoAtual());

        assertTrue(pedido.confirmar());
        assertEquals("Confirmado", pedido.getEstadoAtual());

        assertTrue(pedido.preparar());
        assertEquals("Em preparo", pedido.getEstadoAtual());

        assertTrue(pedido.enviar());
        assertEquals("A caminho", pedido.getEstadoAtual());

        assertTrue(pedido.entregar());
        assertEquals("Entregue", pedido.getEstadoAtual());

        // Tenta cancelar pedido entregue → deve falhar
        assertFalse(pedido.cancelar());
        assertEquals("Entregue", pedido.getEstadoAtual());
    }
}

