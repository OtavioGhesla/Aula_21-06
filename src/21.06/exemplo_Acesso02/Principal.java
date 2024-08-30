package Aula_21_06.exemplo_Acesso02;

import Aula_21_06.exemplo_Acesso.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        //O nome está sem modificador na classe pessoa, desta forma a classe principal
        //não tem acesso a ele.

        //p1.nome = "Jonas";
    }
}
