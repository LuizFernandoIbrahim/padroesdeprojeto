package chainofresponsability;

public class FuncionarioPresidente extends Funcionario {

    public FuncionarioPresidente(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoAuditoria.getTipoDocumentoAuditoria());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Presidente";
    }
}