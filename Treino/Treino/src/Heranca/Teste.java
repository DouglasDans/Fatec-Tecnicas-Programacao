package Heranca;

public class Teste {
    public static void main(String[] args) {
        Cachorro rex = new Cachorro();
        rex.setNome("aa");
        rex.setRaca("Golden");

        System.out.println(rex.getNome() + ']' + rex.getRaca());
    }
}
