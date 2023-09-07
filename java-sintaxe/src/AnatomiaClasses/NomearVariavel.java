package AnatomiaClasses;

public class NomearVariavel {

    public static void main(String[] args) {
        /*quando se tem uma variavel que é toda maiuscula se presupoe que ela é final
         e que não pode sofrer nenhum tipo de alteração
         */
        final String BR = "Brasil";
        /* BR = "Brazil";
        Está variavel não pode ser alterada */
        // Declarações inválidas de variáveis
        /*int numero&num =1; // Os unicos simbolos permitidos são _ e $
        int 1numero = 1; // Não pode se iniciar com numerico
        int numero um = 1; // Não pode conter espaço entre o nome da variavel
        int long = 1; // Não pode atribuir uma palavra reservada para nomear uma variavel*/

        // Declarações válidas de variáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;
    }

}
