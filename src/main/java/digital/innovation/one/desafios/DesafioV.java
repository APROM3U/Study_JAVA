package digital.innovation.one.desafios;

import java.io.IOException;
import java.util.Scanner;


public class DesafioV {

    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            //declare suas variaveis do tipo double
            double raio = scan.nextDouble();
            double pi = 3.14159;
            //continue a solucao

            double area = pi * (Math.pow(raio,2));

            System.out.printf("A=%.4f\n", area);
    }
}
