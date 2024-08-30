package Aula_05_07.exemploPolimorfismo;

import java.sql.Struct;

public class Aluno extends Pessoa{

    private String matrcula;

    public String getMatrcula(){
        return matrcula;
    }

    public void setMatrcula(String matrcula){
        this.matrcula = matrcula;
    }

    @Override
    public String obterDados(){
        return "Nome: "+getNome()+" "+getSobrenome()+" Matricula: "+matrcula;
    }

    @Override
    public String toString(){
        return obterDados();
    }
}
