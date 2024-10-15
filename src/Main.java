import java.util.Scanner;

//public class Main {
  //  public static void main(String[] args) {
       
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


    //public class Main {
      //  public static void main(String[] args) {

         //   Scanner scanner = new Scanner(System.in);


          //  System.out.println("Digite a sua idade: ");
          //  int idade = scanner.nextInt();


          //  if (idade > 18) {
           //     System.out.println(idade + " voce é maior de idade");
        //    } else if (idade < 18) {
         //       System.out.println(idade + " voce é menor de idade");
         //   } else {
          //      System.out.println("O número é zero");
          //  }

            /
         //   scanner.close();
       // }
 //   }



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro lado do triângulo: ");
        int lado1 = scanner.nextInt();
        System.out.println("Digite o segundo lado do triângulo: ");
        int lado2 = scanner.nextInt();
        System.out.println("Digite o terceiro lado do triângulo: ");
        int lado3 = scanner.nextInt();


        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            }

            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            }

            else {
                System.out.println("Triângulo Escaleno");
            }
        } else {

            System.out.println("As medidas inseridas não formam um triângulo.");
        }


        scanner.close();
    }
}


