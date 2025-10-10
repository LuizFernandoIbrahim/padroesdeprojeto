package facade;

public class Auditoria extends ServicoBancario {

    private static Auditoria instancia = new Auditoria();

    private Auditoria() {}

    public static Auditoria getInstancia() {
        return instancia;
    }
}