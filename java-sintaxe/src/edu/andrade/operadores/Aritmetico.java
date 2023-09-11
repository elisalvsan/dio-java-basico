package edu.andrade.operadores;

import java.util.Scanner;

public class Aritmetico {

    public static void main(String[] args) {

        int n1, n2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        n1 = scan.nextInt();
        System.out.println("\nInforme outro valor: ");
        n2 = scan.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;
        int modulo = n1 % n2;
        double resultado = (double)(n1*n2) + (double)(n2/n1);

        System.out.println("Soma: " + soma + "\nSubtracao: " + subtracao
                + "\nMultiplicacao: " + multiplicacao + "\nDivisao: "+ divisao);
        System.out.println("=================================================");
        System.out.println("\nModulo: " + modulo + "\nResultado: " + resultado);

        System.out.println("================CONCATENAÇÃO==================");
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
    }
}
