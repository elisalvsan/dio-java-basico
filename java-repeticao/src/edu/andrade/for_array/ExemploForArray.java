package edu.andrade.for_array;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        /* EXEMPLO COM FOR NORMAL
        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indicce x = " + x + " é " + alunos[x]);
        }*/

        /*EXEMPLO COM FOR EACH*/
        for (String aluno: alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
