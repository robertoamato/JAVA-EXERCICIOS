public class Main {
    public static void main(String[] args) {
        //variaveis tipos

       int idade = 41;
       int salario= 4000;

    // variaveis dentro do escopo local
        var nome="roberto";


       // Variaveis do tipo primitives que sao 8 tipos 4 sao usados para inteiros byte, short, int, long
     byte aniversario=26;

       //booleanos servem pra amarzenar true ou false

     boolean brasil=true;

      // char serve para armazenar 1 caractere por vez.

     char letra='a';

      // tipo primitivo float e double
        // float: Usado quando você precisa de números com casas decimais, mas não necessita de muita precisão e quer economizar memória.
        // double: Usado quando a precisão é importante e você precisa de mais casas decimais.
        // Declarando uma variável do tipo float.
        
        // O 'f' no final é obrigatório para dizer que o valor é do tipo float.
        float altura = 1.75f;
        System.out.println("Altura (float): " + altura);  // Exibe a altura com precisão simples (7 dígitos).

        // Declarando uma variável do tipo double.
        // Aqui não precisa de sufixo, pois por padrão o número com decimal é considerado double.
        double distancia = 384400.56;
        System.out.println("Distância para a Lua (double): " + distancia);  // Exibe a distância com precisão dupla (15 dígitos).

        // Comparando precisão entre float e double:
        float piFloat = 3.141592653589793238f;  // Armazenando o valor de PI como float (com menos precisão).
        double piDouble = 3.141592653589793238;  // Armazenando o valor de PI como double (mais preciso).

        System.out.println("Valor de PI (float): " + piFloat);  // Exibe o valor de PI com precisão simples (float).
        System.out.println("Valor de PI (double): " + piDouble);  // Exibe o valor de PI com precisão dupla (double).

        // Mostrando a diferença de precisão:
        // O float perderá algumas casas decimais, enquanto o double será mais preciso.
        System.out.println("Diferença de precisão: ");
        System.out.println("PI em float: " + piFloat);  // Menos preciso
        System.out.println("PI em double: " + piDouble);  // Mais preciso




    }
}