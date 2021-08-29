package digital.innovation.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        // Add
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        // Ordenação
        Collections.sort(nomes);

        System.out.println(nomes);

        // Altera
        nomes.set(2, "Alexandre");

        System.out.println(nomes);

        // Remove
        nomes.remove(2);

        System.out.println(nomes);

        // Obtem o valor de acordo com indice
        String nome = nomes.get(2);

        System.out.println(nome);

        // Pega o tamanho do array (Lista)
        int tamanho = nomes.size();

        System.out.println(tamanho);

        // Verifica se tem o nome na lista e retorna true e false
        boolean temNome = nomes.contains("Maria");

        System.out.println(temNome);

        // Limpa lista
        // nomes.clear();

        // Verifica se a lista está vazia
        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        // Retorna o indice que o nome se encontra
        int posicao = nomes.indexOf("Maria");
        System.out.println("O nome está na posição " + posicao);

        // Interações
        // ForEach
        for (String item: nomes){
            System.out.println(item);
        }

        // Outra maneira ...
        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("Iterator -> " + iterator.next());
        }

    }
}
