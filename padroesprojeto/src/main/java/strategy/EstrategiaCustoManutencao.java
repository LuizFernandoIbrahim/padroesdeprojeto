package strategy;

public class EstrategiaCustoManutencao implements EstrategiaCalculo {
    @Override
    public float calcular(float custoPecas, float custoMaoDeObra) {
        return custoPecas + custoMaoDeObra;
    }
}
