package edu.andrade.anatomiaclasses;

public class Indentacao {

    //CODIGO DE BOLETIM ESTUDANTIL
    public static void main(String[] args) {
        int mediaFinal = 8;
        if(mediaFinal<6)
            System.out.println("REPROVADO");
        else if(mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
