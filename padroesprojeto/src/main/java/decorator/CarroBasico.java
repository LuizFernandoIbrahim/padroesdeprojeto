package decorator;

public class CarroBasico implements Veiculo {

    private float preco;

    public CarroBasico() {
    }

    public CarroBasico(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Carro Básico";
    }
}
