package observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoristaTest {

    @Test
    void deveNotificarUmMotorista() {
        Veiculo veiculo = new Veiculo("Civic", "ABC-1234");
        Motorista motorista = new Motorista("Motorista 1");
        motorista.observar(veiculo);
        veiculo.setTemperaturaMotor(95.0);
        assertEquals("Motorista 1, alerta recebido do Veiculo{modelo='Civic', placa='ABC-1234', temperaturaMotor=95.0}", motorista.getUltimaNotificacao());
    }

    @Test
    void deveNotificarMotoristas() {
        Veiculo veiculo = new Veiculo("Corolla", "XYZ-9876");
        Motorista motorista1 = new Motorista("Motorista 1");
        Motorista motorista2 = new Motorista("Motorista 2");
        motorista1.observar(veiculo);
        motorista2.observar(veiculo);
        veiculo.setTemperaturaMotor(102.5);
        assertEquals("Motorista 1, alerta recebido do Veiculo{modelo='Corolla', placa='XYZ-9876', temperaturaMotor=102.5}", motorista1.getUltimaNotificacao());
        assertEquals("Motorista 2, alerta recebido do Veiculo{modelo='Corolla', placa='XYZ-9876', temperaturaMotor=102.5}", motorista2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarMotorista() {
        Veiculo veiculo = new Veiculo("Onix", "DEF-5678");
        Motorista motorista = new Motorista("Motorista 1");
        veiculo.setTemperaturaMotor(87.3);
        assertEquals(null, motorista.getUltimaNotificacao());
    }

    @Test
    void deveNotificarMotoristaDeVeiculoEspecifico() {
        Veiculo veiculoA = new Veiculo("HB20", "LMN-4567");
        Veiculo veiculoB = new Veiculo("Fiesta", "OPQ-3210");
        Motorista motorista1 = new Motorista("Motorista 1");
        Motorista motorista2 = new Motorista("Motorista 2");
        motorista1.observar(veiculoA);
        motorista2.observar(veiculoB);
        veiculoA.setTemperaturaMotor(100.0);
        assertEquals("Motorista 1, alerta recebido do Veiculo{modelo='HB20', placa='LMN-4567', temperaturaMotor=100.0}", motorista1.getUltimaNotificacao());
        assertEquals(null, motorista2.getUltimaNotificacao());
    }
}