package abstractfactory;

public class Funcionario {

    private BancodeHoras bancodehoras;
    private FolhadePagamento folhadepagamento;

    public Funcionario(FabricaAbstrata fabrica){
      this.bancodehoras = fabrica.createBancodehoras();
      this.folhadepagamento = fabrica.createFolhadepagamento();
    }

    public String emitirBancodehoras() {
        return this.bancodehoras.emitir();
    }
    public String emitirFolhadepagamento() {
        return this.folhadepagamento.emitir();
    }
}
