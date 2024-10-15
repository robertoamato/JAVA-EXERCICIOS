import java.util.Scanner;

//public class Main {
  //  public static void main(String[] args) {
        // Cria um objeto Scanner para receber entrada do usuário
    //    Scanner scanner = new Scanner(System.in);


      //  System.out.println("Digite um número inteiro: ");
        //int exercicio = scanner.nextInt();

        // Verifica se o número é positivo, negativo ou zero
        //if (exercicio > 0) {
          //  System.out.println(exercicio + " é um número positivo");
        //} else if (exercicio < 0) {
         //   System.out.println(exercicio + " é um número negativo");
        //} else {
          //  System.out.println("O número é zero");
        //}


        //scanner.close();
    //}


    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            // Verifica se o número é positivo, negativo ou zero
            if (idade > 18) {
                System.out.println(idade + " voce é maior de idade");
            } else if (idade < 18) {
                System.out.println(idade + " voce é menor de idade");
            } else {
                System.out.println("O número é zero");
            }

            // Fecha o scanner
            scanner.close();
        }
    }



