package state;

public abstract class ContaEstado {

    public abstract String getEstado();

    public boolean ativar(ContaBancaria conta) { return false; }
    public boolean bloquear(ContaBancaria conta) { return false; }
    public boolean encerrar(ContaBancaria conta) { return false; }
    public boolean suspender(ContaBancaria conta) { return false; }
    public boolean inadimplir(ContaBancaria conta) { return false; }
    public boolean reativar(ContaBancaria conta) { return false; }
}