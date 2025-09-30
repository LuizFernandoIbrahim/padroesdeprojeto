package bridge;

public class Carro extends Veiculo {

    public Carro(float distancia, Combustivel combustivel) {
        super(distancia, combustivel);
    }

    @Override
    public float calcularCustoViagem() {
        return this.distancia * custoPorKm();
    }
}