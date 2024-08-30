package Aula_19_07.exercícioLista;

import java.io.*;
import java.util.Scanner;

public class Cadastro {

    static File caminho = new File("C:\\Users\\ryan1\\OneDrive\\Documentos");
    static File arquivo = new File(caminho, "pessoas.db");


    public static Pessoa[] leArquivo(){
        Pessoa[] lista = new Pessoa[10];
        try{
            ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
            lista = (Pessoa[])leitura.readObject();
            leitura.close();
        }
        catch (IOException error){
            System.out.println("Erro ao ler o arquivo");
        }
        catch(ClassNotFoundException error){
            System.out.println("Classe não encontrada");
        }
        return lista;
    }

    public static void gravaArquivo(Pessoa[] lista){
        try{
            ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            escrita.writeObject(lista);
            escrita.close();
        }
        catch(IOException error){
            System.out.println("Erro ao gravar o arquivo");
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa[] lista = leArquivo();
        //Criando o contador de pessoas
        int cont = 0;
        Pessoa p;
        do{
            p = lista[cont];
            if(p != null){
                cont++;
            }
        }while(p != null);
        //
        String opc;

        do{
            System.out.println("c = cadastrar");
            System.out.println("l = listar");
            System.out.println("e - sair");
            opc = ler.next().toLowerCase();

            switch (opc){
                case "c"->{
                    Pessoa p1 = new Pessoa();
                    System.out.println("Qual o nome da pessoa: ");
                    p1.setNome(ler.next());
                    System.out.println("Qual o sobrenome: ");
                    p1.setSobrenome(ler.next());

                    lista[cont] = p1;
                    cont++;
                }

                case "l"->{
                    for(int i=0; i<cont; i++){
                        System.out.println(lista[i]);
                    }
                }

                case "e"->{
                    gravaArquivo(lista);
                }
            }

        }while(!opc.equals("e"));
    }
}
