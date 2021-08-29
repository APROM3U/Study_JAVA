package digital.innovation.one;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {

        Set<Double> notasAluno = new HashSet<>();

        notasAluno.add(5.8);
        notasAluno.add(8.9);
        notasAluno.add(8.0);
        notasAluno.add(7.5);
        notasAluno.add(9.8);

        System.out.println(notasAluno);

    }
}
