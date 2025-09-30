package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroTest {

    @Test
    void deveRetornarCarroGasolina() {
        Carro carro = new Carro(100, new Gasolina());
        assertEquals(50.0f, carro.calcularCustoViagem(), 0.01f);
    }

    @Test
    void deveRetornarCarroEletrico() {
        Carro carro = new Carro(100, new Eletrico());
        assertEquals(20.0f, carro.calcularCustoViagem(), 0.01f);
    }
}