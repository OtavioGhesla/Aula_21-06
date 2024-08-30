package Aula_19_07.exercícioArquivo;

import java.io.Serializable;

public class ContaPoupanca extends Conta implements Serializable{

    public ContaPoupanca(String titular, String senha,float deposito) {
        super(titular, senha);
        saldo = deposito;
    }

    public boolean sacar(float valor){
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }

    public String verificaSaldo(){
        return String.format("Seu saldo atual é de R$%.2f",saldo);
    }
}
