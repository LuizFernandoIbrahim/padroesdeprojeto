package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoTest {

    @Test
    void deveRetornarMotoGasolina() {
        Moto moto = new Moto(100, new Gasolina());
        assertEquals(40.0f, moto.calcularCustoViagem(), 0.01f);
    }

    @Test
    void deveRetornarMotoEletrica() {
        Moto moto = new Moto(100, new Eletrico());
        assertEquals(16.0f, moto.calcularCustoViagem(), 0.01f);
    }
}