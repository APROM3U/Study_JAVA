package digital.innovation.one;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Add os campeões mundiais fifa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("França", 3);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("Espanha", 1);
        campeoesMundialFifa.put("Inglaterra", 1);


        System.out.println(campeoesMundialFifa);

        // Atualiza
        campeoesMundialFifa.put("França", 2);

        System.out.println(campeoesMundialFifa);

        // Retorna se existe o valor informado pelo nome
        System.out.println(campeoesMundialFifa.containsKey("França"));
        // Retorna se existe o valor informado pelo "id"
        System.out.println(campeoesMundialFifa.containsValue(6));

        // Remove o item
        //campeoesMundialFifa.remove("França");

        System.out.println(campeoesMundialFifa);



    }
}
