package digital.innovation.one;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstKey());

        // Retorna a última capital no final da árvore
        System.out.println(treeCapitais.lastKey());

        // ForEach
        for(Map.Entry<String, String> Capitais: treeCapitais.entrySet()){
            System.out.println(Capitais);
        }

        for(String Capital: treeCapitais.keySet()){
            System.out.println(Capital + " - " + treeCapitais.get(Capital));
        }

    }
}
