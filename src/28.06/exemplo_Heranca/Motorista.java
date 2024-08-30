package Aula_28_06.exemplo_Heranca;

public class Motorista extends Funcionario {

    private String cnh;

    public Motorista (String nome, String sobrenome, int matricula){
        super(nome, sobrenome, matricula);
    }

    public String getChn(){
        return cnh;
    }

    public void setCnh(String cnh){
        this.cnh = cnh;
    }
}
