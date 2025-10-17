package state;

public class ContaEstadoAtiva extends ContaEstado {

    private ContaEstadoAtiva() {}
    private static ContaEstadoAtiva instance = new ContaEstadoAtiva();

    public static ContaEstadoAtiva getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ativa";
    }

    public boolean bloquear(ContaBancaria conta) {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        return true;
    }

    public boolean encerrar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }

    public boolean suspender(ContaBancaria conta) {
        conta.setEstado(ContaEstadoSuspensa.getInstance());
        return true;
    }

    public boolean inadimplir(ContaBancaria conta) {
        conta.setEstado(ContaEstadoInadimplente.getInstance());
        return true;
    }
}