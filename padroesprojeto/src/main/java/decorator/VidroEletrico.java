package decorator;

public class VidroEletrico extends VeiculoDecorator {

    public VidroEletrico(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public float getPercentualPreco() {
        return 5.0f; // aumenta 5% no preço
    }

    @Override
    public String getNomeDescricao() {
        return "Vidro Elétrico";
    }
}