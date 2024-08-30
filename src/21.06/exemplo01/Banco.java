package Aula_21_06.exemplo01;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com o nome do titulas: ");
        String titular = ler.next();

        System.out.print("Entre com o depósito inicial: ");
        float valor = ler.nextFloat();

        Conta c1 = new Conta(titular, valor);
        System.out.println("Conta cadastrada obteve id: "+c1.identificador);

        //Criando outra conta

        //Atributo estático é único para todas as instâncias
        Conta c2 = new Conta("Jonas",10);
        c1.nomeBanco = "Banco Cimol";
        System.out.print("Nome banco c1: "+c1.nomeBanco);
        System.out.print("Nome banco c1: "+c2.nomeBanco);

        Conta.nomeBanco = "Teste";
        System.out.println("Nome banco c1: "+c1.nomeBanco);
        System.out.println("Nome banco c1: "+c2.nomeBanco);
    }
}
