package strategy;

public class EstrategiaDesempenho implements EstrategiaCalculo {
    @Override
    public float calcular(float potencia, float peso) {
        if (peso == 0) {
            throw new IllegalArgumentException("Peso não pode ser zero");
        }
        return potencia / peso;
    }
}

