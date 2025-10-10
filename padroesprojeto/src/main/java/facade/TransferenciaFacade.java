package facade;

public class TransferenciaFacade {

    public static boolean verificarAutorizacaoTransferencia(Cliente cliente) {
        if (Autenticacao.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Conta.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Auditoria.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
