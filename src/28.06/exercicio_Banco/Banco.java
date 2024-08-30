package Aula_28_06.exercicio_Banco;

import java.util.Scanner;

public class Banco {

    public static String leString(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem + ": ");
        return ler.nextLine();

    }

    public static float leFloat(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem + ": ");
        return ler.nextFloat();
    }

    public static ContaCorrente acessaCC(ContaCorrente c1) {
        String opc;
        System.out.println("Acessando a conta " + c1.getIdentificador());
        System.out.println("Bem vindo: " + c1.getTitular());
        do {
            System.out.println("Precione 'D' para depositar: ");
            System.out.println("Precione 'V' para verificar : ");
            System.out.println("Precione 'S' para sacar");
            System.out.println("Precione 'A' para alterar a senha");
            System.out.println("Precione 'E' para sair");
            opc = leString("").toLowerCase();
        }
        while (!opc.equals("E"));

        if (opc.equals("d")) {
            float valor = leFloat("Qual o valor a depositar: ");
            c1.depositar(valor);
            System.out.println("Deposito realizado");

        } else if (opc.equals("s")) {
            float valor = leFloat("Qual o valor do saque: ");
            if (c1.sacar(valor)) {
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo insuficientes");
            }
        } else if (opc.equals("v"))
            c1.verificaSaldo();

        else if (opc.equals("a")) {
            String senha = leString("Qual a nova senha? ");
            c1.setSenha(senha);
        }
        return c1;
    }

    ;

    public static ContaPoupanca acessaCP(ContaPoupanca c1) {
        String opc;
        System.out.println("Acessando a conta: " + c1.getIdentificador());
        System.out.println("Bem vindo: " + c1.getTitular());

        do {
            System.out.println("Precione 'D' para depositar");
            System.out.println("Precione 'S' para sacar");
            System.out.println("Precione 'V' para verificar saldo");
            System.out.println("Precione 'E' para sair");
            opc = leString("").toLowerCase();
        }
        while (!opc.equals("E"));

        if (opc.equals("d")) {
            float deposito = leFloat("Qual o valor do deposito: ");
            c1.depositar(deposito);
        } else if (opc.equals("s")) {
            float sacar = leFloat("Digite o valor a ser sacado: ");
            if (c1.sacar(sacar)) {
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo insuficientes");
            }
        } else if (opc.equals("v")) {
            c1.verificaSaldo();
        }
        return c1;
    }

    public static ContaCorrente cadastraCC() {
        String titular = leString("Qual o titular da conta? ");
        String senha = leString("Qual a senha? ");
        float limite = leFloat("Qual o limite inicial? ");

        ContaCorrente c1 = new ContaCorrente(titular, senha, limite);
        System.out.println("Conta cadastrada com o indentificador " + c1.getIdentificador());
        return c1;
    }

    public static ContaPoupanca cadastraCP() {
        String titular = leString("Qual o titular? ");
        String senha = leString("Qual a senha? ");
        float deposito = leFloat("Qual o valor a depositar? ");

        ContaPoupanca c1 = new ContaPoupanca(titular, senha, deposito);
        System.out.println("Conta cadastrada com o identificador: " + c1.getIdentificador());
        return c1;
    }

    public static void main(String[] args) {
        ContaCorrente[] listaCC = new ContaCorrente[20];

        ContaPoupanca[] listaCP = new ContaPoupanca[20];

        int contaCC = 0;
        int contaCP = 0;
        String opc;

        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("CC - Cadastrar conta corrente");
            System.out.println("CP - Cadastrar conta poupança");
            //Nas opções de acessar existem submenus depositar, sacar, verificar saldo
            System.out.println("AC - Acessar conta corrente");
            System.out.println("AP - Acessar conta poupança");
            System.out.println("E - Sair");
            opc = leString(" ");

            switch (opc) {
                case "cc" -> {
                    listaCC[contaCC] = cadastraCC();
                    contaCC++;
                }
                case "cp" -> {
                    listaCP[contaCP] = cadastraCP();
                    contaCP++;
                }
                case "ac" -> {
                    String identificar = leString("Qual o identificador: ");
                    String senha = leString("Qual a senha: ");

                    int posicao = -1;
                    for (int i = 0; i < contaCC; i++) {
                        if (listaCC[i].validaAcesso(identificar, senha)) {
                            posicao = i;
                        }
                        if (posicao >= 0) {
                            listaCC[posicao] = acessaCC(listaCC[posicao]);
                        } else
                            System.out.println("Conta ou senha incorretas");
                    }
                }
                case "ap" -> {
                    String identificar = leString("Qual o identificador: ");
                    String senha = leString("Qual a senha: ");

                    int posicao = -1;
                    for (int i = 0; i < contaCP; i++) {
                        if (listaCP[i].validaAcesso(identificar, senha)) {
                            posicao = i;
                        }
                    }
                    if (posicao >= 0) {
                        listaCP[posicao] = acessaCP(listaCP[posicao]);
                    } else {
                        System.out.println("Conta ou senha incorretas");
                    }
                }

            }
        }
        while (!opc.equals("E"));
    }
}
