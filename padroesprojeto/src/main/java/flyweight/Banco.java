package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(String nomeCliente, String nomeAgencia, String cidade, String uf) {
        Agencia agencia = AgenciaFactory.getAgencia(nomeAgencia, cidade, uf);
        Cliente cliente = new Cliente(nomeCliente, agencia);
        clientes.add(cliente);
    }

    public List<String> obterClientes() {
        List<String> saida = new ArrayList<>();
        for (Cliente cliente : this.clientes) {
            saida.add(cliente.obterCliente());
        }
        return saida;
    }
}