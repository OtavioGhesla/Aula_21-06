package Exemplo1.exemploEncapsulamento;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o nome: ");
        String nome = ler.next();
        System.out.println("Entre com o sobrenome: ");
        String sobrenome = ler.next();
        Pessoa pessoaUm = new Pessoa(nome, sobrenome);
        System.out.println("Nome: " +pessoaUm.getNome());
        System.out.println("Sobrenome: " +pessoaUm.getSobrenome());
        //Se pprecisar aterar uma informação
        System.out.print("Qual o nome: ");
        nome = ler.next();
        pessoaUm.setNome(nome);
        pessoaUm.setSobrenome(sobrenome);
        System.out.println("Nome: "+pessoaUm.getNome());
        System.out.println("Sobrenome: "+pessoaUm.getSobrenome());
    }
}
