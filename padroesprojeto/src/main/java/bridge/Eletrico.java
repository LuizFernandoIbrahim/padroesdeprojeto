package bridge;

public class Eletrico implements Combustivel {
    @Override
    public float custoPorKm() {
        return 0.2f;
    }
}
