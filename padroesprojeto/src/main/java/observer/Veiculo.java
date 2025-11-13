package observer;

import java.util.Observable;

public class Veiculo extends Observable {

    private String modelo;
    private String placa;
    private double temperaturaMotor;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.temperaturaMotor = 0.0;
    }

    public void setTemperaturaMotor(double temperatura) {
        this.temperaturaMotor = temperatura;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", temperaturaMotor=" + temperaturaMotor +
                '}';
    }
}