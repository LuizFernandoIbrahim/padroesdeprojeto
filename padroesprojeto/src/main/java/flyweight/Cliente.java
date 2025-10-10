package flyweight;

public class Cliente {

    private String nome;
    private Agencia agencia;

    public Cliente(String nome, Agencia agencia) {
        this.nome = nome;
        this.agencia = agencia;
    }

    public String obterCliente() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", agencia='" + agencia.getNome() + '\'' +
                ", cidade='" + agencia.getCidade() + '\'' +
                ", uf='" + agencia.getUf() + '\'' +
                '}';
    }
}