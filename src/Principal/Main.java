package Principal;

import Jantar.Comida;
import Pessoa.Convidados;

public class Main {
    public static <Pessoa1 > void main(String[] args) {

        Convidados convidados = new Convidados();
        System.out.println(convidados.nome);

        Comida  comida = new Comida();
        System.out.println(comida.pesoDaComida);
        
     }
}