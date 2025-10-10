package flyweight;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    @Test
    void deveRetornarClientes() {
        Banco banco = new Banco();
        banco.cadastrarCliente("Jose", "Agencia Centro", "Juiz de Fora", "MG");
        banco.cadastrarCliente("Maria", "Agencia Centro", "Juiz de Fora", "MG");
        banco.cadastrarCliente("Ana", "Agencia Centro", "Juiz de Fora", "MG");
        banco.cadastrarCliente("Joao", "Agencia Norte", "Santos Dumont", "MG");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Jose', agencia='Agencia Centro', cidade='Juiz de Fora', uf='MG'}",
                "Cliente{nome='Maria', agencia='Agencia Centro', cidade='Juiz de Fora', uf='MG'}",
                "Cliente{nome='Ana', agencia='Agencia Centro', cidade='Juiz de Fora', uf='MG'}",
                "Cliente{nome='Joao', agencia='Agencia Norte', cidade='Santos Dumont', uf='MG'}"
        );

        assertEquals(saida, banco.obterClientes());
    }

    @Test
    void deveRetornarTotalAgencias() {
        Banco banco = new Banco();
        banco.cadastrarCliente("Jose", "Agencia Centro", "Juiz de Fora", "MG");
        banco.cadastrarCliente("Maria", "Agencia Centro", "Juiz de Fora", "MG");
        banco.cadastrarCliente("Ana", "Agencia Centro", "Juiz de Fora", "MG");
        banco.cadastrarCliente("Joao", "Agencia Norte", "Santos Dumont", "MG");

        assertEquals(2, AgenciaFactory.getTotalAgencias());
    }

}