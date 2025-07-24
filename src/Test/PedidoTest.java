package Test;
import main.java.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveFinalizarPedidoComTudoOk() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.finalizar());
        assertTrue(pedido.isFinalizado());
    }
}

