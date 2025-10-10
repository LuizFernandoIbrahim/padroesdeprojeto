package flyweight;

public class Agencia {

    private String nome;
    private String cidade;
    private String uf;

    public Agencia(String nome, String cidade, String uf) {
        this.nome = nome;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }
}
