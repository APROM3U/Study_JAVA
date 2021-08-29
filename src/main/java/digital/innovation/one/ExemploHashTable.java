package digital.innovation.one;

import java.util.Hashtable;

public class ExemploHashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Antonio", 25);
        estudantes.put("Mariana", 18);
        estudantes.put("Rafaela", 30);

        System.out.println(estudantes);



    }
}
