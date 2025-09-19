package factorymethod;

public class ServicoAgendarCorrida implements IServico {

    public String executar() { return "Corrida Agendada"; }

    public String cancelar() { return "Corrida Cancelada"; }

}
