package edu.andrade.tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {

        //declaro uma variável do tipo inteiro e atribuo a ela o valor 5.
        int numero = 5;

        /*altero o valor da variável para 10,
        não é necessario declarar o tipo dela novamente,
        pois já foi declarado acima.*/
        numero = 10;
        System.out.println(numero);

        /* tem que ser declarada final além da convensão de nome
            para que esse valor não possa ser alterado.
         */

        final double VALOR_DE_PI = 3.14;



        /*
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;*/

    }
}
