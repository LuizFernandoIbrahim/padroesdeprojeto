package factorymethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoAgendarCorridaTest {

    @Test
    void deveAgendarCorrida() {

        IServico servico = ServicoFactory.obterServico("AgendarCorrida");
        assertEquals("Corrida Agendada", servico.executar());
    }

    @Test
    void deveCancelarAgendamentoCorrida() {

        IServico servico = ServicoFactory.obterServico("AgendarCorrida");
        assertEquals("Corrida Cancelada", servico.cancelar());
    }

}
