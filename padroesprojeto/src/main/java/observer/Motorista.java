package observer;

import java.util.Observable;
import java.util.Observer;

public class Motorista implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Motorista(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void observar(Veiculo veiculo) {
        veiculo.addObserver(this);
    }

    @Override
    public void update(Observable veiculo, Object arg1) {
        this.ultimaNotificacao = this.nome + ", alerta recebido do " + veiculo.toString();
    }
}
