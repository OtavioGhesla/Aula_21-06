package Aula_05_07.exemploFinal;

public class Exemplo01 {

    //Declarando uma variavel do tipo final
    final double numero;

    //Criando uma constante, ela DEVE receber um valor no momento da declaração;

    //Acesso universal pelo 'public';

    //Existe independente da criação de instância 'static';

    //Não pode ser modificada, quem garante isso é o 'final';
    public static final double PI = Math.PI;

    //Como não foi definido um valor no momento da declaração,
    // este valor deverá ser atribuido até o final do construtor

    public Exemplo01(){
        numero = 10;
    }
}
