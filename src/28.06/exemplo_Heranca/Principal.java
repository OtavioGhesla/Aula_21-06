package Aula_28_06.exemplo_Heranca;

public class Principal {
    public static void main(String[] args) {

        Motorista m1 = new Motorista("Jonas","Silva",1234);

        m1.setNome("Jonas");
        m1.setSobrenome("Silva");
        m1.setMatricula(1234);


        Engenheiro e1 = new Engenheiro("Ryan","Koch",1289,"488892832");

        e1.setNome("Ryan");
        e1.setSobrenome("Koch");
        e1.setMatricula(1289);
        e1.setCrea("488892832");
    }
}
