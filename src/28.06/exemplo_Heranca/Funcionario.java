package Aula_28_06.exemplo_Heranca;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private int matricula;


    public Funcionario(String nome, String sobrenome, int matricula){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    //Se a classe principal tem um construtor, as heranças também precisam ter um

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

}
