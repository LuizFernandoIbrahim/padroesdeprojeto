package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class ServicoBancario {

    private List<Cliente> clientesComPendencia = new ArrayList<>();

    public void addClientePendente(Cliente cliente) {
        this.clientesComPendencia.add(cliente);
    }

    public boolean verificarClienteComPendencia(Cliente cliente) {
        return this.clientesComPendencia.contains(cliente);
    }
    public List<Cliente> getClientesComPendencia() {
        return this.clientesComPendencia;
    }

}