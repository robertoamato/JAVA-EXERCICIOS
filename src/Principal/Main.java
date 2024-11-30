package Principal;

import Jantar.Comida;
import Pessoa.Convidados;

public class Main {
    public static <Pessoa1 > void main(String[] args) {

        Convidados convidados = new Convidados();
        System.out.println("Nome : " + convidados.nome);
        System.out.println("Idade : " + convidados.idade);
        System.out.println("Sexo : " + convidados.sexo);
        System.out.println("Comida favorita : " + convidados.comidaFavorita);

        Comida  comida = new Comida();
        System.out.println("Peso da comida : " + comida.pesoDaComida);
        System.out.println("Id da comida : " + comida.idDaComida);
        System.out.println("Nome da comida : " + comida.nome);
     }
}