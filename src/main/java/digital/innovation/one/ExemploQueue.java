package digital.innovation.one;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        // LinkedList

        Queue<String> fila = new LinkedList<>();

        fila.add("Patricia");
        fila.add("Roberto");
        fila.add("Flavia");
        fila.add("Alberto");
        fila.add("Pamela");
        fila.add("Joana");

        // System.out.println(fila);

        // ForEach - lista de nomes
        for(String nome: fila){
            System.out.println(nome);
        }
        System.out.println("");

        String primeiroClienteOuErro = fila.element(); // retorna primeiro elemento
        System.out.println("Cliente: "+primeiroClienteOuErro);
        System.out.println("Element Fila: "+fila);

        String primeiroCliente = fila.peek(); // retorna primeiro elemento
        System.out.println("Cliente: "+primeiroCliente);
        System.out.println("Peek Fila: "+fila);

        String clienteASerAtendido = fila.poll(); // remove e retorna próximo elemento
        System.out.println("Cliente: "+clienteASerAtendido);
        System.out.println("Poll Fila: "+fila);

        Iterator<String> iteratorFila = fila.iterator();

        //while(((Iterator<?>) iteratorFila).hasNext()){ //TBM DEU CERTO!!!
        while(iteratorFila.hasNext()){
            System.out.println("Iterator: "+iteratorFila.next());
        }

    }
}
