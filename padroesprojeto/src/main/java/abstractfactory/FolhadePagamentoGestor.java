package abstractfactory;

public class FolhadePagamentoGestor implements FolhadePagamento {
    public String emitir() {
        return "Essa é a folha de pagamento dos seus colaboradores";
    }
}
