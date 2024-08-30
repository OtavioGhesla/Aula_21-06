package Aula_12_07.exemploExcecao;

public class Exemplo02 {


    //" Empurrando o problema "
    public int divide(int n1, int n2) throws ArithmeticException{
        if(n2 == 0){
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return n1/n2;
    }
}
