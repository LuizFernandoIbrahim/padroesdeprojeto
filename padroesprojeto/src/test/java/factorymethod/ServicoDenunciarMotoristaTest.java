package factorymethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoDenunciarMotoristaTest {

    @Test
    void deveExecutarDenunciaMotorista() {

        IServico servico = ServicoFactory.obterServico("DenunciarMotorista");
        assertEquals("Sua Denúncia foi enviada", servico.executar());
    }

    @Test
    void deveCancelarDenunciaMotorista() {

        IServico servico = ServicoFactory.obterServico("DenunciarMotorista");
        assertEquals("Você retirou sua denúncia", servico.cancelar());
    }

}
