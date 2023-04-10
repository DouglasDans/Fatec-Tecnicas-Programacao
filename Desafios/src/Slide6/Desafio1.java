package Slide6;

import java.util.Random;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        int numAleatorio = aleatorio.nextInt(20);
        int numUsuario = 0;
        System.out.println("PC jogou um número");
        do {
            System.out.println("Digite um número entre 1 e 20");
            numUsuario = in.nextInt();

            if (numUsuario < numAleatorio){
                System.out.println("O numero é maior");
            }
            if (numUsuario > numAleatorio){
                System.out.println("O número é menor");
            }
        }while(numUsuario != numAleatorio);
        System.out.println("Boaa, você acertou o número: " + numAleatorio);
    }
}
