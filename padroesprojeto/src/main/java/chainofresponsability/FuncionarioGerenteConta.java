package chainofresponsability;

public class FuncionarioGerenteConta extends Funcionario {

    public FuncionarioGerenteConta(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoComprovante.getTipoDocumentoComprovante());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente de Conta";
    }
}
