package state;

public class ContaBancaria {

    private String titular;
    private ContaEstado estado;

    public ContaBancaria() {
        this.estado = ContaEstadoAtiva.getInstance();
    }

    public void setEstado(ContaEstado estado) {
        this.estado = estado;
    }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public boolean bloquear() {
        return estado.bloquear(this);
    }

    public boolean encerrar() {
        return estado.encerrar(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean inadimplir() {
        return estado.inadimplir(this);
    }

    public boolean reativar() {
        return estado.reativar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public ContaEstado getEstado() {
        return estado;
    }
}