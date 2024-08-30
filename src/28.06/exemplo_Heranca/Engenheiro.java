package Aula_28_06.exemplo_Heranca;

public class Engenheiro extends Funcionario{

    private String crea;

    public Engenheiro (String nome, String sobrenome, int matricula, String crea){ //É possível colocar mais atributos
        super(nome, sobrenome, matricula);
        this.crea = crea;
    }

    public String getCrea(){
        return crea;
    }

    public void setCrea(String crea){
        this.crea = crea;
    }


}
