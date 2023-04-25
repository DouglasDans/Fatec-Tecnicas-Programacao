public class Teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        try{
            vetor.adicionar("Elemento 1");
            vetor.adicionar("Elemento 2");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(vetor.getTamanho());
        System.out.println(vetor.toString());
    }
}
