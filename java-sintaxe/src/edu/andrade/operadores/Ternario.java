package edu.andrade.operadores;

public class Ternario {
    public static void main(String[] args) {
        int a, b;
        String resultado;

        a = 5;
        b = 6;

        //Condicional utilizando if/else
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);
        System.out.println("__________________________________");
        a = 7;
        b =7;
        resultado = a==b ? "verdadeiro": "falso";
        System.out.println(resultado);
    }
}
