package abstractfactory;

public class FabricaColaborador implements FabricaAbstrata {

    @Override
    public BancodeHoras createBancodehoras() { return new BancodeHorasColaborador(); }

    @Override
    public FolhadePagamento createFolhadepagamento() { return new FolhadePagamentoColaborador(); }
}


