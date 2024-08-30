package Aula_12_07.exemploArquivo;

import java.io.*;

public class GravarPessoa {

    public static void main(String[] args) {

        File caminho = new File("C:\\Users\\ryan1\\OneDrive\\Documentos/Aula_12_07");

        if(!caminho.exists()){
            System.out.println("Caminho não existe. Tentando criar...");
            caminho.mkdirs();
            System.out.println("[OK]");
        }

        File arquivo = new File(caminho,"pessoas.db");

        try{
            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            Pessoa p1 = new Pessoa();
            p1.setNome("Jonas");
            p1.setSobrenome("Silva");

            //Escrevendo p1 dentro do arquivo

            objEscrita.writeObject(p1);
            objEscrita.close();
        }
        catch(FileNotFoundException error){
            System.out.println("Arquivo não encontrado, precisa ser criado.");
        }

        catch(IOException error){
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
