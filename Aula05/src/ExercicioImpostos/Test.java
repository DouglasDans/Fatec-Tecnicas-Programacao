package ExercicioImpostos;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        double consumo;
        consumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o consumo KW/h"));
        Consumo fatura = new Consumo(consumo);
        double fornecimento = fatura.fornecimento();
        JOptionPane.showMessageDialog(null, "" +
                "Fonercimento: " + fatura.fornecimento() +
                "\nICMS: " + fatura.icms(fornecimento) +
                "\nCOFINS: " + fatura.cofins(fornecimento)+
                "\nPIS/PASEP: " + fatura.pispasep(fornecimento) +
                "\nICMS SOBRE COFINS: " + fatura.icmscofins(fornecimento) +
                "\nICMS SOBRE PISPASEP: " + fatura.icmspispasep(fornecimento) +
                "\nFATURA: " + fatura.calcularConsumo());
        fatura.updateConsumo(fatura.consumo + 100);

    }
}
