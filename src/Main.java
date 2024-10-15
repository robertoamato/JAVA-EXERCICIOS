import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.println("Digite um número inteiro: ");
        int exercicio = scanner.nextInt();

        // Verifica se o número é positivo, negativo ou zero
        if (exercicio > 0) {
            System.out.println(exercicio + " é um número positivo");
        } else if (exercicio < 0) {
            System.out.println(exercicio + " é um número negativo");
        } else {
            System.out.println("O número é zero");
        }

        // Fecha o scanner
        scanner.close();
    }
}


