package bridge;

public class Moto extends Veiculo {

    public Moto(float distancia, Combustivel combustivel) {
        super(distancia, combustivel);
    }

    @Override
    public float calcularCustoViagem() {
        return (this.distancia * custoPorKm()) * 0.8f;
    }
}