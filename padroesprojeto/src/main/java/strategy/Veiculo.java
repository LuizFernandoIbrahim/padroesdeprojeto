package strategy;

public class Veiculo {

    private float resultado;

    public float getResultado() {
        return resultado;
    }

    public void calcularConsumo(float distancia, float combustivel) {
        CalculadoraVeiculo calculadora = new CalculadoraVeiculo(distancia, combustivel);
        this.resultado = calculadora.calcular(new EstrategiaConsumo());
    }

    public void calcularCustoManutencao(float custoPecas, float custoMaoDeObra) {
        CalculadoraVeiculo calculadora = new CalculadoraVeiculo(custoPecas, custoMaoDeObra);
        this.resultado = calculadora.calcular(new EstrategiaCustoManutencao());
    }

    public void calcularVelocidadeMedia(float distancia, float tempo) {
        CalculadoraVeiculo calculadora = new CalculadoraVeiculo(distancia, tempo);
        this.resultado = calculadora.calcular(new EstrategiaVelocidadeMedia());
    }

    public void calcularDesempenho(float potencia, float peso) {
        CalculadoraVeiculo calculadora = new CalculadoraVeiculo(potencia, peso);
        this.resultado = calculadora.calcular(new EstrategiaDesempenho());
    }

    public void calcularAutonomia(float capacidadeTanque, float consumoMedio) {
        CalculadoraVeiculo calculadora = new CalculadoraVeiculo(capacidadeTanque, consumoMedio);
        this.resultado = calculadora.calcular(new EstrategiaAutonomia());
    }
}