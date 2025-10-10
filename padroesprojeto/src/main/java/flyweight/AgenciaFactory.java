package flyweight;

import java.util.HashMap;
import java.util.Map;

public class AgenciaFactory {
    private static Map<String, Agencia> agencias = new HashMap<>();

    public static Agencia getAgencia(String nome, String cidade, String uf) {
        String chave = nome + "-" + cidade;
        Agencia agencia = agencias.get(chave);
        if (agencia == null) {
            agencia = new Agencia(nome, cidade, uf);
            agencias.put(chave, agencia);
        }
        return agencia;
    }

    public static int getTotalAgencias() {
        return agencias.size();
    }
}
