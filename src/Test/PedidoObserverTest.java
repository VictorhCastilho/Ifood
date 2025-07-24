package Test;

import main.java.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoObserverTest {

    @Test
    public void testNotificacaoDeMudancaDeEstado() {
        Pedido pedido = new Pedido();
        pedido.setNumero(123);
        pedido.setClienteNome("Victor");
        pedido.setRestauranteNome("Restaurante X");

        // Cliente se inscreve para ser notificado
        Cliente cliente = new Cliente("Victor", "Rua 1");
        PedidoNotificador notificador = new PedidoNotificador();
        notificador.adicionarObservador(cliente);

        // Ligando o notificador ao pedido
        pedido = new PedidoComNotificacao(pedido, notificador);

        // Confirmar o pedido para acionar notificação
        boolean confirmado = pedido.confirmar();

        assertTrue(confirmado);
        assertEquals("Confirmado", pedido.getEstadoAtual());
    }
}

