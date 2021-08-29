package digital.innovation.one;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquete");

        System.out.println(esportes);

        for(String esporte: esportes) {
            System.out.println(esporte);
        }
    }
}
