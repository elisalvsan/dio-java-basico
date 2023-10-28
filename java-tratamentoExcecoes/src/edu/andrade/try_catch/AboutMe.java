package edu.andrade.try_catch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        try {
            final Locale locale = new Locale("pt", "BR");

            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(locale);

            // recebendo os dados
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            // imprimindo dos dados
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
            scanner.close();
        }catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }

    }
}
