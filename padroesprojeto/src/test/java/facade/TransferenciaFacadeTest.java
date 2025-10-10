package facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransferenciaFacadeTest {

    private Cliente cliente1;
    private Cliente cliente2;

    @BeforeEach
    public void setup() {
        cliente1 = new Cliente();
        cliente2 = new Cliente();

        // Limpa pendências antes de cada teste (garantia de isolamento)
        Autenticacao.getInstancia().getClientesComPendencia().clear();
        Conta.getInstancia().getClientesComPendencia().clear();
        Auditoria.getInstancia().getClientesComPendencia().clear();
    }

    @Test
    public void deveAutorizarTransferenciaQuandoNaoHaPendencias() {
        boolean resultado = cliente1.realizarTransferencia();
        assertTrue(resultado, "A transferência deve ser autorizada sem pendências.");
    }

    @Test
    public void deveBloquearTransferenciaQuandoHaPendenciaNaConta() {
        Conta.getInstancia().addClientePendente(cliente1);
        boolean resultado = cliente1.realizarTransferencia();
        assertFalse(resultado, "A transferência deve ser bloqueada devido à pendência na conta.");
    }

    @Test
    public void deveBloquearTransferenciaQuandoHaPendenciaNaAutenticacao() {
        Autenticacao.getInstancia().addClientePendente(cliente1);
        boolean resultado = cliente1.realizarTransferencia();
        assertFalse(resultado, "A transferência deve ser bloqueada por falha na autenticação.");
    }

    @Test
    public void deveBloquearTransferenciaQuandoHaPendenciaNaAuditoria() {
        Auditoria.getInstancia().addClientePendente(cliente1);
        boolean resultado = cliente1.realizarTransferencia();
        assertFalse(resultado, "A transferência deve ser bloqueada pela auditoria.");
    }
}
