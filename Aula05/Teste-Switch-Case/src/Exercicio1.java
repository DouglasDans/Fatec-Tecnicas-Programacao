import javax.swing.*;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de um mes"));
        switch (num){
            case 1:
                JOptionPane.showMessageDialog(null, "Você selecionou Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você selecionou Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Você selecionou Março");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Você selecionou Abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Você selecionou Maio");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Você selecionou Julho");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Você selecionou Junho");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Você selecionou Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Você selecionou Setembro");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Você selecionou Outubro");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Você selecionou Novembro");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Você selecionou Dezembro");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mês inválido");
        }
    }
}
