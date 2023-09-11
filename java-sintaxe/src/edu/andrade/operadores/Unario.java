package edu.andrade.operadores;

public class Unario {
    public static void main(String[] args) {

        //Numero positivo e negativo

        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        System.out.println("---------------------------------------------------");
        //Incremento
        //incrementa 1
        ++numero;
        System.out.println(numero);

        //decrementa 1
        --numero;
        System.out.println(numero);

        System.out.println("---------------------------------------------------");
        //negação

        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);
    }
}
