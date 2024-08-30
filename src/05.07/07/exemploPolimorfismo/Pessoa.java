package Aula_05_07.exemploPolimorfismo;

public class Pessoa {
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

    //Se o método obterDados for 'final' ele não poderá ter o comportamento
    //substituido em outra class, ou seja, ele não recebe Override;

    //public final String obterDados()

    public String obterDados(){
        return "Nome: "+nome+" "+sobrenome;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+" "+sobrenome;
    }
}
