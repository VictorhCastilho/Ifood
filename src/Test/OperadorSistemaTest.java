package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.java.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class    OperadorSistemaTest {

    OperadorSistema operador;
    Pedido pedido;

    @BeforeEach
    void setUp() {
        operador = new OperadorSistema();
        pedido = new Pedido();
    }

    @Test
    void deveConfirmarPedido() {
        AcaoPedido confirmar = new ConfirmarPedidoAcao(pedido);
        operador.executarAcao(confirmar);

        assertEquals("Confirmado", pedido.getEstadoAtual());
    }

    @Test
    void deveCancelarPedido() {
        AcaoPedido cancelar = new CancelarPedidoAcao(pedido);
        operador.executarAcao(cancelar);

        assertEquals("Cancelado", pedido.getEstadoAtual());
    }

}

