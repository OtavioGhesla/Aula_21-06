package Aula_12_07.exemploArquivo;

import java.io.*;

public class LerPessoa {

    public static void main(String[] args) {

        File caminho = new File("C:\\Users\\ryan1\\OneDrive\\Documentos/Aula_12_07");
        File arquivo = new File(caminho, "pessoas.db");

        try{
            ObjectInputStream objLeitura = new ObjectInputStream( new FileInputStream(arquivo.getAbsolutePath()));
            Pessoa p1 = (Pessoa)objLeitura.readObject();
            System.out.println(p1);
            objLeitura.close();
        }
        catch(IOException error){
            System.out.println("Erro ao abrir o arquivo");

        }
        catch(ClassNotFoundException error){
            System.out.println("Erro ao localizar a clase");
        }
    }
}
