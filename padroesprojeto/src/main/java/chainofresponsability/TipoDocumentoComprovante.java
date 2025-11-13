package chainofresponsability;

public class TipoDocumentoComprovante implements TipoDocumento {

    private static TipoDocumentoComprovante tipoDocumentoComprovante = new TipoDocumentoComprovante();

    private TipoDocumentoComprovante() {}

    public static TipoDocumentoComprovante getTipoDocumentoComprovante() {
        return tipoDocumentoComprovante;
    }
}
