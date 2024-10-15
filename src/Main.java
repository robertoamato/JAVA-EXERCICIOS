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

            //
         //   scanner.close();
       // }
 //   }


        //3. Classificação de Triângulos
//public class Main {
   // public static void main(String[] args) {

      //  Scanner scanner = new Scanner(System.in);


       // System.out.println("Digite o primeiro lado do triângulo: ");
       // int lado1 = scanner.nextInt();
       // System.out.println("Digite o segundo lado do triângulo: ");
      //  int lado2 = scanner.nextInt();
       // System.out.println("Digite o terceiro lado do triângulo: ");
       // int lado3 = scanner.nextInt();


       // if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

          //  if (lado1 == lado2 && lado2 == lado3) {
          //      System.out.println("Triângulo Equilátero");
          //  }

          //  else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
          //      System.out.println("Triângulo Isósceles");
          //  }

           // else {
          //      System.out.println("Triângulo Escaleno");
          //  }
      //  } else {

       //     System.out.println("As medidas inseridas não formam um triângulo.");
      //  }


     //   scanner.close();
   // }
//}
import java.util.Scanner;

//public class Main {
    //public static void main(String[] args) {

    //    Scanner scanner = new Scanner(System.in);


     //   System.out.println("Digite um ano: ");
     //   int ano = scanner.nextInt();


     //   if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
     //       System.out.println(ano + " é um ano bissexto.");
     //   } else {
    //        System.out.println(ano + " não é um ano bissexto.");
    //    }


    //    scanner.close();
  //  }
//}
import java.util.Scanner;
  // Calculadora
//public class Main {
 //   public static void main(String[] args) {

  //      Scanner scanner = new Scanner(System.in);


     //   System.out.println("Digite o primeiro número: ");
     //   double numero1 = scanner.nextDouble();
      //  System.out.println("Digite o segundo número: ");
      //  double numero2 = scanner.nextDouble();


      //  System.out.println("Digite o operador (+, -, *, /): ");
      //  char operador = scanner.next().charAt(0);


     //   double resultado;
      //  if (operador == '+') {
      //      resultado = numero1 + numero2;
      //      System.out.println("Resultado: " + resultado);
      //  } else if (operador == '-') {
      //      resultado = numero1 - numero2;
     //       System.out.println("Resultado: " + resultado);
    //    } else if (operador == '*') {
     //       resultado = numero1 * numero2;
     //       System.out.println("Resultado: " + resultado);
     //   } else if (operador == '/') {
    //        if (numero2 != 0) {
   //             resultado = numero1 / numero2;
    //            System.out.println("Resultado: " + resultado);
   //         } else {
    //            System.out.println("Erro: Divisão por zero não permitida.");
    //        }
  //      } else {
  //          System.out.println("Operador inválido.");
  //      }


   //     scanner.close();
 //   }
//}

   //6. Verificação de Par ou Ímpar
import java.util.Scanner;

//public class Main {
 //   public static void main(String[] args) {

     //   Scanner scanner = new Scanner(System.in);


      //  System.out.println("Digite um número inteiro: ");
      //  int numero = scanner.nextInt();


       // if (numero % 2 == 0) {
       //     System.out.println(numero + " é Par.");
       // } else {
       //     System.out.println(numero + " é Ímpar.");
       // }


        //scanner.close();
   // }
//}
  //7. Calculadora de Média
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();


        double media = (nota1 + nota2 + nota3) / 3;


        if (media >= 7) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }

        
        scanner.close();
    }
}
