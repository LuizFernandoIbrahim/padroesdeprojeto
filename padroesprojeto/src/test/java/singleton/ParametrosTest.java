package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeCorretora() {
        Parametros.getInstance().setNomeCorretora("Corretora 1");
        assertEquals("Corretora 1", Parametros.getInstance().getNomeCorretora());
    }


    @Test
    public void deveRetornarTransacaoConcluida() {
        Parametros.getInstance().setTransacaoConcluida("TransacaoConcluida 1");
        assertEquals("TransacaoConcluida 1", Parametros.getInstance().getTransacaoConcluida());
    }
}
