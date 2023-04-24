import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float temp[] = new float[7];
        float media;
        int diasAcima = 0, diasAbaixo = 0, controle;
        media = 0;

        for (controle = 0; controle < temp.length; controle++) {
            System.out.println("Digite a tempreratura do dia " + (controle + 1));
            temp[controle] = in.nextFloat();
            media += temp[controle];
        }

        media = media / temp.length;

        for (controle = 0; controle < temp.length; controle++){
            if (temp[controle] >= media){
                diasAcima++;
            }else {
                diasAbaixo++;
            }
        }
        System.out.println("A média das temperaturas é: " + media);
        System.out.println("Quantidade de dias que ficou acma da média: " + diasAcima);
        System.out.println("Quantidade de dias que ficou abaixo da mádia: " + diasAbaixo);

    }
}