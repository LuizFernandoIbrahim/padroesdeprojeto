package facade;

public class Conta extends ServicoBancario {

    private static Conta instancia = new Conta();

    private Conta() {}

    public static Conta getInstancia() {
        return instancia;
    }
}