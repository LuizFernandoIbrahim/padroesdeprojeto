package factorymethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoAvaliarCorridaTest {

    @Test
    void deveAvaliarCorrida() {

        IServico servico = ServicoFactory.obterServico("AvaliarCorrida");
        assertEquals("Corrida Avaliada", servico.executar());
    }

    @Test
    void deveCancelarAvaliacaoCorrida() {

        IServico servico = ServicoFactory.obterServico("AvaliarCorrida");
        assertEquals("Você não quis avaliar essa corrida", servico.cancelar());
    }

}
