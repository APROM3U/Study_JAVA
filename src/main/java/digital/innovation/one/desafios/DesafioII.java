package digital.innovation.one.desafios;

import java.io.IOException;
import java.util.Scanner;

public class DesafioII {

    public static void main(String[] args) throws IOException {

    //Scanner leitor = new Scanner(System.in);
    int soma = 10;

    for (int i = 0; i < 6; i++) {

        double x = 2;//leitor.nextDouble();

        if( x > 0 ) {
            soma ++;
        }

    }

    System.out.println(soma+" valores positivos");

}


}
