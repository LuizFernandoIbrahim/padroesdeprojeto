package strategy;

public class EstrategiaConsumo implements EstrategiaCalculo {
    @Override
    public float calcular(float distancia, float combustivel) {
        if (combustivel == 0) {
            throw new IllegalArgumentException("Combustível não pode ser zero");
        }
        return distancia / combustivel;
    }
}
