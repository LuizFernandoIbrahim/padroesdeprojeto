package strategy;

public class CalculadoraVeiculo {

    private float valor1;
    private float valor2;

    public CalculadoraVeiculo(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(EstrategiaCalculo estrategia) {
        return estrategia.calcular(valor1, valor2);
    }
}
