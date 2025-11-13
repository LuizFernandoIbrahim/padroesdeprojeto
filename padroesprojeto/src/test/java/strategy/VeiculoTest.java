package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveCalcularConsumoVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.calcularConsumo(500.0f, 25.0f);
        assertEquals(20.0f, veiculo.getResultado());
    }

    @Test
    void naoDeveCalcularConsumoComCombustivelZero() {
        try {
            Veiculo veiculo = new Veiculo();
            veiculo.calcularConsumo(500.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Combustível não pode ser zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularCustoManutencaoVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.calcularCustoManutencao(800.0f, 200.0f);
        assertEquals(1000.0f, veiculo.getResultado());
    }

    @Test
    void deveCalcularVelocidadeMediaVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.calcularVelocidadeMedia(300.0f, 3.0f);
        assertEquals(100.0f, veiculo.getResultado());
    }

    @Test
    void naoDeveCalcularVelocidadeComTempoZero() {
        try {
            Veiculo veiculo = new Veiculo();
            veiculo.calcularVelocidadeMedia(300.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tempo não pode ser zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularDesempenhoVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.calcularDesempenho(150.0f, 1000.0f);
        assertEquals(0.15f, veiculo.getResultado());
    }

    @Test
    void naoDeveCalcularDesempenhoComPesoZero() {
        try {
            Veiculo veiculo = new Veiculo();
            veiculo.calcularDesempenho(150.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso não pode ser zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularAutonomiaVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.calcularAutonomia(50.0f, 12.0f);
        assertEquals(600.0f, veiculo.getResultado());
    }

    @Test
    void naoDeveCalcularAutonomiaComConsumoZero() {
        try {
            Veiculo veiculo = new Veiculo();
            veiculo.calcularAutonomia(50.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Consumo médio não pode ser zero", e.getMessage());
        }
    }
}
