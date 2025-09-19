package abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveEmitirBancodeHorasGestor() {
        FabricaAbstrata fabrica = new FabricaGestor();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Aqui está o Banco de Horas dos seus colaboradores", funcionario.emitirBancodehoras());
    }
    @Test
    void deveEmitirBancodeHorasColaborador() {
        FabricaAbstrata fabrica = new FabricaColaborador();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Aqui está o seu banco de horas", funcionario.emitirBancodehoras());
    }
    @Test
    void deveEmitirFolhadePagamentoGestor() {
        FabricaAbstrata fabrica = new FabricaGestor();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Essa é a folha de pagamento dos seus colaboradores", funcionario.emitirFolhadepagamento());
    }
    @Test
    void deveEmitirFolhadePagamentoColaborador() {
        FabricaAbstrata fabrica = new FabricaColaborador();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Aqui está sua Folha de Pagamento", funcionario.emitirFolhadepagamento());
    }
}
