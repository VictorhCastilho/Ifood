package Test;
import main.java.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioVisitorExibicaoTest {

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente("João", "Rua A, 123");
        UsuarioVisitorExibicao visitor = new UsuarioVisitorExibicao();
        assertEquals("Cliente{nome='João', endereco='Rua A, 123'}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirEntregador() {
        Entregador entregador = new Entregador("Carlos", "Moto");
        UsuarioVisitorExibicao visitor = new UsuarioVisitorExibicao();
        assertEquals("Entregador{nome='Carlos', veiculo='Moto'}", visitor.exibir(entregador));
    }

    @Test
    void deveExibirRestaurante() {
        Restaurante restaurante = new Restaurante("PizzaTop", "Pizzaria");
        UsuarioVisitorExibicao visitor = new UsuarioVisitorExibicao();
        assertEquals("Restaurante{nome='PizzaTop', categoria='Pizzaria'}", visitor.exibir(restaurante));
    }
}

