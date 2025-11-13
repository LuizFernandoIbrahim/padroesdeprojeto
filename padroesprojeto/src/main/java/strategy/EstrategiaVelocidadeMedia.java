package strategy;

public class EstrategiaVelocidadeMedia implements EstrategiaCalculo {
    @Override
    public float calcular(float distancia, float tempo) {
        if (tempo == 0) {
            throw new IllegalArgumentException("Tempo não pode ser zero");
        }
        return distancia / tempo;
    }
}

