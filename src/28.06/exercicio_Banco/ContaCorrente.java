package Aula_28_06.exercicio_Banco;

public class ContaCorrente extends Conta {

    private float limite;

    public ContaCorrente(String titular, String senha, float limite){
        super(titular, senha);
        this.limite= limite;
    }

    public boolean sacar(float valor){
        if(saldo+limite>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }

    public String verificaSaldo(){
        String retorno = String.format("Seu saldo atual é de R$.2f", saldo);
        if(saldo>=0){
            retorno+=String.format("Limite disponível R$2.f", limite);
        }
        else{
            retorno+=String.format("Limite disponível R$2.f", limite+saldo);
        }
        return retorno;
    }
}
