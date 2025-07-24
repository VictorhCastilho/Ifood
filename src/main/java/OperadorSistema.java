package main.java;

import java.util.ArrayList;
import java.util.List;

public class OperadorSistema {

    private List<AcaoPedido> historico = new ArrayList<>();

    public void executarAcao(AcaoPedido acao) {
        this.historico.add(acao);
        acao.executar();
    }

    public void desfazerUltimaAcao() {
        if (!historico.isEmpty()) {
            AcaoPedido acao = historico.remove(historico.size() - 1);
            acao.cancelar();
        }
    }
}

