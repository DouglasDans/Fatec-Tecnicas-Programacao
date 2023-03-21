import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        double consumo, fornecimento, icms, cofins, pispasep, icmscofins, icmspispasep, fatura;

        consumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o consumo"));
        fornecimento = consumo * 0.28172;

        if (consumo <= 200) {
            icms = fornecimento * 0.136363;
            cofins =
        }else{
            icms = fornecimento * 0.333333;
        }
    }
}
