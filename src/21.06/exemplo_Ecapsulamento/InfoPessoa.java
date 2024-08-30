package Aula_21_06.exemplo_Ecapsulamento;

import java.util.Scanner;
public class InfoPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = ler.next();

        System.out.println("Digite o sobrenome da pessoa: ");
        String sobrenome = ler.next();

        Pessoa p1 = new Pessoa (nome, sobrenome);
        System.out.print("O nome da pessoa é: "+p1.getNome()+" "+p1.getSobrenome());

        //Se precisar alterar informação (Usar SET)

        //System.out.print("Digite o nome da pessoa: ");
        //String nome = ler.next();

        //System.out.println("Digite o sobrenome da pessoa: ");
        //String sobrenome = ler.next();

        //p1.setNome(nome);
        //p1.setSobrenome(sobrenome);
    }
}
