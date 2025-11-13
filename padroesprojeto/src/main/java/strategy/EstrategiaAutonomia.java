package strategy;

public class EstrategiaAutonomia implements EstrategiaCalculo {
    @Override
    public float calcular(float capacidadeTanque, float consumoMedio) {
        if (consumoMedio == 0) {
            throw new IllegalArgumentException("Consumo médio não pode ser zero");
        }
        return capacidadeTanque * consumoMedio;
    }
}

