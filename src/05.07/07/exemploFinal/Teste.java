package Aula_05_07.exemploFinal;

public class Teste {
    public static void main(String[] args) {
        Exemplo01 ex = new Exemplo01();

        //Não é possível trocar o valor de um atributo final

        //ex.numero =25;

        //Lendo o valor de uma constante;
        System.out.println(Exemplo01.PI);
    }
}
