package chainofresponsability;

public class TipoDocumentoEmprestimo implements TipoDocumento {

    private static TipoDocumentoEmprestimo tipoDocumentoEmprestimo = new TipoDocumentoEmprestimo();

    private TipoDocumentoEmprestimo() {}

    public static TipoDocumentoEmprestimo getTipoDocumentoEmprestimo() {
        return tipoDocumentoEmprestimo;
    }
}

