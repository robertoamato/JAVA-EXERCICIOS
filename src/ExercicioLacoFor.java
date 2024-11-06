import java.util.Scanner;

public class ExercicioLacoFor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero para a somatroria");
        int soma=0;

        int n= Integer.parseInt(teclado.nextLine());
        ;

        for (int i=0; i <= n; i++) {
            soma = soma + i;
            System.out.println(" a soma é " + soma );
        }
    }
}
