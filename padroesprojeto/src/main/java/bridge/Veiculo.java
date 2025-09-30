package bridge;

public abstract class Veiculo implements Combustivel {

    protected float distancia;
    protected Combustivel combustivel;

    public Veiculo(float distancia, Combustivel combustivel) {
        this.distancia = distancia;
        this.combustivel = combustivel;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public float custoPorKm() {
        return combustivel.custoPorKm();
    }

    public abstract float calcularCustoViagem();
}
