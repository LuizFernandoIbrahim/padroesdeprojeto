package decorator;

public class ArCondicionado extends VeiculoDecorator {

    public ArCondicionado(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public float getPercentualPreco() {
        return 10.0f; // aumenta 10% no preço
    }

    @Override
    public String getNomeDescricao() {
        return "Ar-Condicionado";
    }
}