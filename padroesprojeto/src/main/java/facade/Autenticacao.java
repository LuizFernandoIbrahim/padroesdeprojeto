package facade;

public class Autenticacao extends ServicoBancario {

    private static Autenticacao instancia = new Autenticacao();

    private Autenticacao() {}

    public static Autenticacao getInstancia() {
        return instancia;
    }
}