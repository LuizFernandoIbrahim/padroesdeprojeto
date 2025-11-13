package chainofresponsability;

public class TipoDocumentoAuditoria implements TipoDocumento {

    private static TipoDocumentoAuditoria tipoDocumentoAuditoria = new TipoDocumentoAuditoria();

    private TipoDocumentoAuditoria() {}

    public static TipoDocumentoAuditoria getTipoDocumentoAuditoria() {
        return tipoDocumentoAuditoria;
    }
}
