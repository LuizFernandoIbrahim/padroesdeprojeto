package abstractfactory;

public class FabricaGestor implements FabricaAbstrata {
    @Override
    public BancodeHoras createBancodehoras() { return new BancodeHorasGestor(); }

    @Override
    public FolhadePagamento createFolhadepagamento() { return new FolhadePagamentoGestor(); }
}
