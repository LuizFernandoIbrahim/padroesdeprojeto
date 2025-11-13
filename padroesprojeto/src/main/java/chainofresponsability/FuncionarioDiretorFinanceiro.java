package chainofresponsability;

public class FuncionarioDiretorFinanceiro extends Funcionario {

    public FuncionarioDiretorFinanceiro(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoInvestimento.getTipoDocumentoInvestimento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor Financeiro";
    }
}

