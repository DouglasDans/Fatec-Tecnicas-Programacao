import javax.swing.*;
import java.util.Scanner;

public class TesteSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero de 1 a 4"));
        switch (num){
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você escolheu 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Você escolheu 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Você escolheu 4");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido");
        }
    }
}
