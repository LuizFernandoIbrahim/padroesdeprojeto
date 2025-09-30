package decorator;

public abstract class VeiculoDecorator implements Veiculo {

    private Veiculo veiculo;
    public String descricao;

    public VeiculoDecorator(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    // Cada decorador vai adicionar um percentual de custo
    public abstract float getPercentualPreco();

    @Override
    public float getPreco() {
        return this.veiculo.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeDescricao();

    @Override
    public String getDescricao() {
        return this.veiculo.getDescricao() + "/" + this.getNomeDescricao();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}