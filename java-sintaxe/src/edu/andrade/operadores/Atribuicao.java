package edu.andrade.operadores;

import java.util.Date;

public class Atribuicao {
    public static void main(String[] args) {
        String nome = "Elisa";
        int idade = 21;
        double peso = 50.0;
        char sexo = 'F';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.println("Nome: " + nome + "\nIdade: " + idade
                + "\nPeso: " + peso + "\nSexo: " + sexo
                + "\nDoador de Orgão: " + doadorOrgao + "\nData: " + dataNascimento);
    }
}
