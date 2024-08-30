package Aula_21_06.exemplo_Ecapsulamento;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com o nome do titulas: ");
        String titular = ler.next();

        System.out.print("Entre com o depósito inicial: ");
        float valor = ler.nextFloat();

        Conta c1 = new Conta(titular, valor);
        System.out.println("Conta cadastrada obteve id: "+c1.getIdentificador());

        System.out.print(c1.verificaSaldo());
        c1.depositar(10);
        System.out.println(c1.verificaSaldo());
        c1.sacar(20);
        System.out.println(c1.verificaSaldo());
    }
}
