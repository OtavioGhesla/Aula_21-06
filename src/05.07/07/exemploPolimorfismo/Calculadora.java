package Aula_05_07.exemploPolimorfismo;

public class Calculadora {
    public static void main(String[] args) {
        Operações op = new Operações();

        System.out.println("Somando dois números: "+op.soma(5,6));
        System.out.println("Somando três números: "+op.soma(5,6,7));
        System.out.println("Somando duas Strings: "+op.soma("Palavra", "Soma"));
    }
}
