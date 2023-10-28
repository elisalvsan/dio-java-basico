# Tratamento de Exeções

---

## Exceções

Ao executar o código Java, diferente erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada ou outross imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma **exceção** (jogará um erro).

De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválida. Todos estes cenários e o demais não são erros mas sim fluxos não previstos pela aplicação.

É ai que entra mais uma responsabilidade do desenvvolvedor, prever sintuações iguais a estas e realizar o que denominamos de **Tratamento de exceções**.

**Mão na massa**

```Java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        final Locale locale = new Locale("pt","BR");

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
    }
}
```
    Possíveis erros ou exceções que podem acontecer:

    - Não informar o nome e sobrenome
    - O valor da idade ter um caractere NÃO numérico
    - O valor da altura ter um ponto ao invês de ser uma virgura (comforme o padrão pt_BR)

**Conhecer algumas exceções java**

- [List of Java Exceptions](https://programming.guide/java/list-of-java-exceptions.html)
- [Most Common Java Exceptions](https://rollbar.com/blog/most-common-java-exceptions/)

**Tratamento de exceções**

A instrução **try** permite que você defina um bloco de código para ser testado quando a erros enquanto está sendo executado.

A instrução **catch** permite definir um bloco de código a ser executado, caso ocorra um erro no bloco **try**.

A instrução **finally** permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave **try** e **catch** vêm em pares:

 - Estrutura de um bloco com try e catch

```
    try{
        // bloco de código conforme esperado
    }
    catch(Exception e ){
        //precisamos saber qual exceção
        // bloco de código que captura as exceções que podem acontecer
        // em caso de um fluxo não previsto
    }
```

**Exemplo apresentado acima com o tratamento de exceções**

```Java
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
```