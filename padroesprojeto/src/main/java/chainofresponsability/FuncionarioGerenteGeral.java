package chainofresponsability;

public class FuncionarioGerenteGeral extends Funcionario {

    public FuncionarioGerenteGeral(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoEmprestimo.getTipoDocumentoEmprestimo());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente Geral";
    }
}
