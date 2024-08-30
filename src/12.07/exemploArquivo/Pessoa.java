package Aula_12_07.exemploArquivo;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;

    private String sobrenome;

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+" "+sobrenome;
    }
}
