package facade;

public class Cliente {

    public boolean realizarTransferencia() {
        return TransferenciaFacade.verificarAutorizacaoTransferencia(this);
    }
}