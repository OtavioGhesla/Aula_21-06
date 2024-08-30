package Aula_12_07.exemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

    public static int leNumero(String mensagem){
        Scanner ler = new Scanner(System.in);

        int num = 0;

        boolean correto;

        do{
            try{
                System.out.println(mensagem);
                num = ler.nextInt();
                correto = true; //Se for um INT, é considerado verdadeiro
            }
            catch(InputMismatchException error){
                System.out.println("Erro! É preciso que uma letra seja digitada");
                correto = false; //Caso o valor digitado não seja INT, o boolean é dado como falso
                ler.next();
                //Foi preciso adicionar este comando pois o valor estava sendo repassado
                //infinitamente pelo loop 'Do...While'
            }
        }
        while(!correto); //É preciso ter cuidado com os loops do 'Do...While'

        return num;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1 = leNumero("Digite um valor para n1: ");
        int n2 = leNumero("Digite um valor para n2: ");

        try{

            int resposta = n1/n2;

            System.out.println("A reposta é: "+resposta);
        }
        catch (InputMismatchException erro){
            System.out.println("Os valores precisam ser números");
        }
        catch (ArithmeticException erro){
            System.out.println("Não é possível dividir por zero");
        }
    }

}
