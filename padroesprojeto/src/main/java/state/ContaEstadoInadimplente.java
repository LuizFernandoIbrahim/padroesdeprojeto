package state;

public class ContaEstadoInadimplente extends ContaEstado {

    private ContaEstadoInadimplente() {}
    private static ContaEstadoInadimplente instance = new ContaEstadoInadimplente();

    public static ContaEstadoInadimplente getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Inadimplente";
    }

    public boolean reativar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        return true;
    }

    public boolean encerrar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }
}