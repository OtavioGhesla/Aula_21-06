package Aula_19_07.exercícioArquivo;

import java.io.*;
public class GravarConta {

    public static void main(String[] args) {

        File caminho = new File("C:\\Users\\ryan1\\OneDrive\\Documentos\\Aula_19_07");

        if(!caminho.exists()){
            System.out.println("Caminho não existente. Tentando criar...");
            caminho.mkdirs();
            System.out.println("[Caminho Criado]");
        }

        File arquivo = new File(caminho,"Contas.db");

        /*try{

            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));

        }
        catch()*/
    }
}
