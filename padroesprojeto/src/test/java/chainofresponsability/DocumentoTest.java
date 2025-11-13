package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioPresidente presidente;
    FuncionarioDiretorFinanceiro diretorFinanceiro;
    FuncionarioGerenteGeral gerenteGeral;
    FuncionarioGerenteConta gerenteConta;

    @BeforeEach
    void setUp() {
        presidente = new FuncionarioPresidente(null);
        diretorFinanceiro = new FuncionarioDiretorFinanceiro(presidente);
        gerenteGeral = new FuncionarioGerenteGeral(diretorFinanceiro);
        gerenteConta = new FuncionarioGerenteConta(gerenteGeral);
    }

    @Test
    void deveRetornarGerenteContaParaAprovarComprovante() {
        Documento documento = new Documento(TipoDocumentoComprovante.getTipoDocumentoComprovante());
        assertEquals("Gerente de Conta", gerenteConta.aprovarDocumento(documento));
    }

    @Test
    void deveRetornarGerenteGeralParaAprovarEmprestimo() {
        Documento documento = new Documento(TipoDocumentoEmprestimo.getTipoDocumentoEmprestimo());
        assertEquals("Gerente Geral", gerenteConta.aprovarDocumento(documento));
    }

    @Test
    void deveRetornarDiretorFinanceiroParaAprovarInvestimento() {
        Documento documento = new Documento(TipoDocumentoInvestimento.getTipoDocumentoInvestimento());
        assertEquals("Diretor Financeiro", gerenteConta.aprovarDocumento(documento));
    }

    @Test
    void deveRetornarPresidenteParaAprovarAuditoria() {
        Documento documento = new Documento(TipoDocumentoAuditoria.getTipoDocumentoAuditoria());
        assertEquals("Presidente", gerenteConta.aprovarDocumento(documento));
    }

    @Test
    void deveRetornarSemAprovacaoParaDocumentoNaoReconhecido() {
        TipoDocumento tipoDesconhecido = new TipoDocumento() {}; // tipo não cadastrado
        Documento documento = new Documento(tipoDesconhecido);
        assertEquals("Sem aprovação", gerenteConta.aprovarDocumento(documento));
    }
}




