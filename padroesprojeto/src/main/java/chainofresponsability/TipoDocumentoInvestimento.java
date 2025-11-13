package chainofresponsability;

public class TipoDocumentoInvestimento implements TipoDocumento {

    private static TipoDocumentoInvestimento tipoDocumentoInvestimento = new TipoDocumentoInvestimento();

    private TipoDocumentoInvestimento() {}

    public static TipoDocumentoInvestimento getTipoDocumentoInvestimento() {
        return tipoDocumentoInvestimento;
    }
}
