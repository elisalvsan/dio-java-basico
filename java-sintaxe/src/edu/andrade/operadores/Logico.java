package edu.andrade.operadores;

public class Logico {
    public static void main(String[] args) {
        boolean condicao1 = true, condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        } else if (condicao1 || condicao2) {
            System.out.println("Uma das condições são verdadeiras");
        }
    }
}
