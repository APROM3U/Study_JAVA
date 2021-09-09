package digital.innovation.one.desafios;

import java.io.IOException;
import java.util.Scanner;

public class MinhaClasse {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //declare suas variaveis corretamente

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        //continue a solução
        for(int i = 0; i < 5; i++){

            int valor = leitor.nextInt();

            if(valor % 2 == 0){
                par += 1;
            }

            if(valor % 2 !=0){
                impar += 1;
            }

            if(valor > 0){
                positivo +=1;
            }

            if(valor < 0 ){
                negativo +=1;
            }

        }
//insira suas variaveis corretamente
        System.out.println( par + " valor(es) par(es)");
        System.out.println( impar + " valor(es) impar(es)");
        System.out.println( positivo + " valor(es) positivo(s)");
        System.out.println( negativo + " valor(es) negativo(s)");
    }


}
