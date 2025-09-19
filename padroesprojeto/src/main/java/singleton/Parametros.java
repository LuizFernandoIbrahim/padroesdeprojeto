package singleton;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros ();
    public static Parametros getInstance() {
        return instance;
    }

    private String nomeCorretora;
    private String transacaoConcluida;

    public String getNomeCorretora() {
        return nomeCorretora;
    }

    public void setNomeCorretora(String nomeCorretora) {
        this.nomeCorretora = nomeCorretora;
    }

    public String getTransacaoConcluida() {
        return transacaoConcluida;
    }

    public void setTransacaoConcluida(String transacaoConcluida) {
        this.transacaoConcluida = transacaoConcluida;
    }
}
