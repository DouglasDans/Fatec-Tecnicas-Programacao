public class Teste {
    public static void main(String[] args) throws Exception{
        Vetor vetor = new Vetor(5);

        try{
            vetor.adicionar("Elemento 1");
            vetor.adicionar("Elemento 2");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(vetor.getTamanho());
        System.out.println(vetor.toString());
        System.out.println(vetor.busca(1));
        System.out.println(vetor.busca1("Elemento 1"));
        System.out.println(vetor.adicionarInicio(0,"PAi"));

        for (int i = 0; i < vetor.getTamanho(); i++){
            System.out.println("Elemento: " + i + ": " + vetor.busca(i));
        }
        System.out.println(vetor.getTamanho());
        vetor.remove(2);

        for (int i = 0; i < vetor.getTamanho(); i++){
            System.out.println("Elemento: " + i + ": " + vetor.busca(i));
        }
    }
}
