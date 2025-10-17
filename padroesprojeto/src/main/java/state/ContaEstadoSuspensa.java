package state;

public class ContaEstadoSuspensa extends ContaEstado {

    private ContaEstadoSuspensa() {}
    private static ContaEstadoSuspensa instance = new ContaEstadoSuspensa();

    public static ContaEstadoSuspensa getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspensa";
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
