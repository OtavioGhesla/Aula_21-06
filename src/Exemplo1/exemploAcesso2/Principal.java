package Exemplo1.exemploAcesso2;

import Exemplo1.exemploAcesso.Pessoa;

public class Principal {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        //O nome está sem modificador na classe Pessoa, dessa forma a classe Principal não tem acesso a ele
        //p1.nome = "Jonas";
    }
}
