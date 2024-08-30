package Aula_12_07.exemploExcecao;

public class Teste {

    public static void main(String[] args) {
        Exemplo02 e1 = new Exemplo02();

        try{
            e1.divide(5,0);
        }
        catch (ArithmeticException error){
            System.out.println("Não foi possível dividir!");
        }

    }
}
