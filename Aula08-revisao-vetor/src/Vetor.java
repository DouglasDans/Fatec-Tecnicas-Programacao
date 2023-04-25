import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public  Vetor (int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(String elemento) throws Exception{
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else {
            throw new Exception("O vetor está cheio" + " não é possivel adicionar novos elementos");
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i <  this.tamanho - 1; i++) {
            s.append(this.elementos[this.tamanho - 1]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
