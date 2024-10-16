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

//public class Main {
  //  public static void main(String[] args) {

    //    Scanner scanner = new Scanner(System.in);


     //   System.out.println("Digite a primeira nota: ");
     //   double nota1 = scanner.nextDouble();

      //  System.out.println("Digite a segunda nota: ");
      //  double nota2 = scanner.nextDouble();

     //   System.out.println("Digite a terceira nota: ");
    //    double nota3 = scanner.nextDouble();


     //   double media = (nota1 + nota2 + nota3) / 3;


     //   if (media >= 7) {
     //       System.out.println("Aprovado com média: " + media);
     //   } else {
     //       System.out.println("Reprovado com média: " + media);
     //   }


     //   scanner.close();
  //  }
//}

   //8. Cálculo de IMC
import java.util.Scanner;

//public class Main {
   // public static void main(String[] args) {

     //   Scanner scanner = new Scanner(System.in);


      //  System.out.println("Digite o peso em kg: ");
       // double peso = scanner.nextDouble();

       // System.out.println("Digite a altura em metros: ");
       // double altura = scanner.nextDouble();


       // double imc = peso / (altura * altura);


       // System.out.printf("Seu IMC é: %.2f\n", imc);


      //  if (imc < 18.5) {
      //      System.out.println("Você está abaixo do peso.");
      //  } else if (imc >= 18.5 && imc < 24.9) {
      //      System.out.println("IMC Normal.");
      //  } else if (imc >= 25 && imc < 29.9) {
      //      System.out.println("Você está com sobrepeso.");
      //  } else {
     //       System.out.println("Você está com obesidade.");
     //   }


     //   scanner.close();
   // }
//}
//9. Classificação de Notas
import java.util.Scanner;

//public class Main {
  //  public static void main(String[] args) {

     //   Scanner scanner = new Scanner(System.in);


      //  System.out.println("Digite uma nota de 0 a 100: ");
      //  int nota = scanner.nextInt();


     //   if (nota >= 90 && nota <= 100) {
     //       System.out.println("Nota A");
     //   } else if (nota >= 80 && nota < 90) {
    //        System.out.println("Nota B");
    //    } else if (nota >= 70 && nota < 80) {
  //          System.out.println("Nota C");
   //     } else if (nota >= 60 && nota < 70) {
   //         System.out.println("Nota D");
   //     } else if (nota >= 0 && nota < 60) {
   //         System.out.println("Nota F");
   //     } else {
  //          System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 100.");
  //      }


      //  scanner.close();
  //  }
//}
   // 10. Validação de Senha
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {

//        String senhaCadastrada = "12345";


//        Scanner scanner = new Scanner(System.in);


//        System.out.println("Digite a senha: ");
//        String senhaInserida = scanner.nextLine();


//        if (senhaInserida.equals(senhaCadastrada)) {
//            System.out.println("Senha correta.");
//        } else {
//            System.out.println("Senha incorreta.");
//        }


//        scanner.close();
//    }
//}

//11. Verificação de Vogal ou Consoante
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);


   //     System.out.println("Digite uma letra: ");
     //   char letra = scanner.next().toLowerCase().charAt(0);


       // if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
      //      System.out.println("Vogal");
     //   } else if (Character.isLetter(letra)) {
     //       System.out.println("Consoante");
     //   } else {
     //       System.out.println("Não é uma letra válida.");
    //    }


     //   scanner.close();
//    }
//}


   // 12. Verificação de Número Par ou Divisível por 5

import java.util.Scanner;

//public class Main {
  //  public static void main(String[] args) {

    //    Scanner scanner = new Scanner(System.in);


      //  System.out.println("Digite um número inteiro: ");
      //  int numero = scanner.nextInt();


      //  if (numero % 2 == 0 && numero % 5 == 0) {
      //      System.out.println("Número Par e Divisível por 5");
      //  } else if (numero % 2 == 0) {
      //      System.out.println("Número Par");
      //  } else if (numero % 5 == 0) {
      //      System.out.println("Número Divisível por 5");
      //  } else {
      //      System.out.println("O número não é par nem divisível por 5");
      //  }


      //  scanner.close();
  //  }
//}
import java.util.Scanner;
    //13. Desconto Progressivo
//public class Main {
  //  public static void main(String[] args) {

    //    Scanner scanner = new Scanner(System.in);


      //  System.out.println("Digite o valor da compra: ");
      //  double valorCompra = scanner.nextDouble();


//        double desconto = 0;


  //      if (valorCompra > 500) {
    //        desconto = 0.20;  // 20% de desconto
      //      System.out.println("Desconto aplicado: 20%");
    //    } else if (valorCompra > 100) {
    //        desconto = 0.10;  // 10% de desconto
   //         System.out.println("Desconto aplicado: 10%");
   //     } else {
  //          System.out.println("Sem desconto aplicado.");
  //      }


    //    double valorFinal = valorCompra - (valorCompra * desconto);


      //  System.out.printf("Valor final da compra: R$ %.2f\n", valorFinal);


      //  scanner.close();
  //  }
//}
//14. Verificação de Horário do Dia
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a hora do dia (formato 24 horas): ");
        int hora = scanner.nextInt();


        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida! Insira um valor entre 0 e 23.");
        } else {

            if (hora >= 6 && hora < 12) {
                System.out.println("Manhã");
            } else if (hora >= 12 && hora < 18) {
                System.out.println("Tarde");
            } else {
                System.out.println("Noite");
            }
        }


        scanner.close();
    }
}
