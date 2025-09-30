package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroDecoratorTest {

    @Test
    void deveRetornarCarroBasico() {
        Veiculo carro = new CarroBasico(50000f);
        assertEquals(50000f, carro.getPreco(), 0.01f);
        assertEquals("Carro Básico", carro.getDescricao());
    }

    @Test
    void deveRetornarCarroComArCondicionado() {
        Veiculo carro = new CarroBasico(50000f);
        carro = new ArCondicionado(carro);
        // preço = 50000 + 10% = 55000
        assertEquals(55000f, carro.getPreco(), 0.01f);
        assertEquals("Carro Básico/Ar-Condicionado", carro.getDescricao());
    }

    @Test
    void deveRetornarCarroComVidroEletrico() {
        Veiculo carro = new CarroBasico(50000f);
        carro = new VidroEletrico(carro);
        // preço = 50000 + 5% = 52500
        assertEquals(52500f, carro.getPreco(), 0.01f);
        assertEquals("Carro Básico/Vidro Elétrico", carro.getDescricao());
    }

    @Test
    void deveRetornarCarroComArCondicionadoEVidroEletrico() {
        Veiculo carro = new CarroBasico(50000f);
        carro = new ArCondicionado(carro); // +10% = 55000
        carro = new VidroEletrico(carro);  // +5% sobre 55000 = 57750
        assertEquals(57750f, carro.getPreco(), 0.01f);
        assertEquals("Carro Básico/Ar-Condicionado/Vidro Elétrico", carro.getDescricao());
    }
}